import java.io.*;
import java.util.Scanner;

public class Test10 {
    /*
    10、使用随机文件流类RandomAccessFile将一个文本文件倒置读出。
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner =new Scanner(System.in);
        //输入要遍历的项目
        System.out.print("输入要读取的文件: ");
        String path = scanner.next();
        File file =new File(path);
        //创建输入流
        InputStream inputStream=null;
        Reader reader=null;
        BufferedReader bufferedReader=null;
        try {
            inputStream =new FileInputStream(file);
            reader =new InputStreamReader(inputStream);
            bufferedReader =new BufferedReader(reader);
            String substance = null;
            String contains = null;
            while ((substance=bufferedReader.readLine())!=null){
                    contains +=substance;
                    contains +='\n';
            }
            //倒序读取 除去null的四个字节
            for (int i=contains.length()-1;i>=4;i--){
                System.out.print(contains.charAt(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //关闭流
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(reader!=null){
                try {
                    reader.close();
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
