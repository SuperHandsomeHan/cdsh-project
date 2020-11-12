package bimda.cdshproject.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;

/**
 * @PACKAGE_NAME: bimda.cdshproject.utils
 * @NAME: MD5Utils
 * @USER: code.rookie
 * @DATE: 2020/11/10
 * @TIME: 1:40 下午
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public class MD5Utils {
    /**
     *
     * @Title: MD5Utils.java
     * @Package com.imooc.utils
     * @Description: 对字符串进行md5加密
     */
    public static String getMD5Str(String strValue) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String newstr = Base64.encodeBase64String(md5.digest(strValue.getBytes()));
        return newstr;
    }

    public static void main(String[] args) {
        try {
            String md5 = getMD5Str("1111");
            System.out.println(md5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
