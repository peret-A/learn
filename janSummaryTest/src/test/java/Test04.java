import java.io.*;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Test04 {
    /*
    4、从磁盘读取一个文件到内存中，再打印到控制台
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
            while ((substance=bufferedReader.readLine())!=null){
                System.out.println(substance);
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
