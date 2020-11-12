package bimda.cdshproject.utils;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @PACKAGE_NAME: bimda.cdshproject.utils
 * @NAME: Base64Utils
 * @USER: code.rookie
 * @DATE: 2020/11/11
 * @TIME: 11:25 上午
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public class Base64Utils {
  /**
   * 图片转化成base64字符串
   * @param imgPath
   * @return
   */
  public static String getImageStr(String imgPath) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
      String imgFile = imgPath;// 待处理的图片
      InputStream in = null;
      byte[] data = null;
      String encode = null; // 返回Base64编码过的字节数组字符串
      // 对字节数组Base64编码
      BASE64Encoder encoder = new BASE64Encoder();
        try {
                // 读取图片字节数组
                in = new FileInputStream(imgFile);
                data = new byte[in.available()];
                in.read(data);
                encode = encoder.encode(data);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                 try {
                    in.close();
                 } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                 }
                }
        return encode;
  }
}
