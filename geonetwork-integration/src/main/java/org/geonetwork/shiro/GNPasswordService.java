package org.geonetwork.shiro;

import org.apache.shiro.authc.credential.HashingPasswordService;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.util.ByteSource;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class GNPasswordService implements HashingPasswordService {
    private static String SECRET_SALT = "secret-hash-salt=";

    private StandardPasswordEncoder passwordEncoder;

    public GNPasswordService() {
        passwordEncoder = new StandardPasswordEncoder(SECRET_SALT);
    }

    public String encryptPassword(Object plaintext) {
       ByteSource plaintextBytes = createByteSource(plaintext);

       return passwordEncoder.encode(plaintextBytes.toString());
    }

    public Hash hashPassword(Object plaintext) {
        return null;
    }

    public boolean passwordsMatch(Object plaintext, Hash saved) {
        return true;
    }


    public boolean passwordsMatch(Object o, String s) {
        //ByteSource plaintextBytes = createByteSource(o);

        String password = new String((char[]) o);
        return passwordEncoder.matches(password, s);
    }

    protected ByteSource createByteSource(Object o) {
        return ByteSource.Util.bytes(o);
    }

}
