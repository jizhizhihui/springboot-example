package com.JZhi.utils;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5Util {
    public static void main(String[] args) {

        //用户民
        String username = "user";
        //原始密码
        String password = "123456";
        //盐
        String salt = randomSalt();
        //散列次数
        int hashInteractions = 2;
        //加密方式
        String hashAlgorithmName = "MD5";

        System.out.println("盐：" + salt);
        System.out.println("密码：" + new SimpleHash(hashAlgorithmName, password, ByteSource.Util.bytes(username + salt), hashInteractions));
    }

    /**
     * @param hashAlgorithmName 加密方式
     * @param hashInteractions  加密次数
     * @param str               明文
     * @param salt              盐
     * @return String
     */
    public static String simple(String hashAlgorithmName, int hashInteractions, String str, String salt) {
        String result = new SimpleHash(hashAlgorithmName, str, ByteSource.Util.bytes(salt), hashInteractions).toHex();
        System.out.println(result);
        return result;
    }

    /**
     * 生成随机盐
     */
    public static String randomSalt() {
        // 一个Byte占两个字节，此处生成的3字节，字符串长度为6
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        return secureRandom.nextBytes(3).toHex();
    }

    /**
     * @param str              明文
     * @param salt             盐
     * @param hashInteractions 散列的次数，比如散列两次，相当 于md5(md5(''))
     * @return String
     */
    public static String md5(String str, String salt, int hashInteractions) {
        return new Md5Hash(str, salt, hashInteractions).toString();
    }

}
