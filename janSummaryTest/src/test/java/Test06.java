import java.io.*;
import java.util.Scanner;

public class Test06 {
    /*
    6、拷贝一张图片，从一个目录到另外一个目录下(PS:是拷贝是不是移动)
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner =new Scanner(System.in);
        System.out.print("输入要复制的图片文件: ");
        String soursePath = scanner.next();
        File soursefile =new File(soursePath);
        System.out.print("输入要复制到的地址: ");
        String tagerPath = scanner.next();
        File tagerFile = new File(tagerPath);
        //创建流
        InputStream inputStream=null;
        DataInputStream dataInputStream = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream =null;
        try {
            inputStream =new FileInputStream(soursefile);
            dataInputStream =new DataInputStream(inputStream);
            outputStream =new FileOutputStream(tagerFile);
            dataOutputStream =new DataOutputStream(outputStream);

            //读取文件数据
            int contains;
            while ((contains=dataInputStream.read())!=-1){
                //写入数据
                dataOutputStream.write(contains);
            }
            //刷新
            dataOutputStream.flush();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //关闭流
            if(dataOutputStream!=null){
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(dataInputStream!=null){
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
