package cn.itheima;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class FileInputStreamTest {
    public static void main(String[] args) {
        //文件所在
        String filePath = "E:\\IntelliJ IDEA 2018.1.5\\Workspace\\IO\\src\\file";
        //读取文件，先创建“输入流”
        FileInputStream fis=null;
        try {
            fis = new FileInputStream(filePath);
            //开始读
            int read = 0;
            //循环读取
            while ((read=fis.read())!=-1){
                System.out.println(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


