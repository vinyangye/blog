package com.vinyangy.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author yeyang
 * @Date 2019-05-19
 */
public class MD5Utils {

    /**
     * MD5 encryption
     * @param str string to be encrypted
     * @return Encrypted string
     */
    public static String encrypt(String str){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] byteDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }

                buf.append(Integer.toHexString(i));
            }
            //32 bit encryption
            return buf.toString();
            // 16 bit encryption
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(encrypt("1234"));

    }
}
