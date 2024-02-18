import java.io.*;
import java.util.Scanner;

public class Test11 {
    /*
    11、编写一个Java应用程序，可以实现Dos中的type命令，并加上行号。即将文本文件在控制台上显示出来，并在每一行的前面加上行号。
    在DOS中，TYPE命令是一个用于查看文本文件内容的基本命令。
    通过TYPE命令，用户可以快速浏览文件的内容，以便在不打开编辑器的情况下查看文件的基本信息和内容。
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner =new Scanner(System.in);
        //输入要遍历的项目
        System.out.print("输入要遍历的文件: ");
        String path = scanner.next();
        File file =new File(path);
        //先判断文件是否存在

        if(file.exists()){
            //遍历内容
            InputStream inputStream = null;
            Reader reader = null;
            BufferedReader bufferedReader = null;
            try {
                inputStream = new FileInputStream(file);
                reader = new InputStreamReader(inputStream);
                bufferedReader = new BufferedReader(reader);
                //记行器
                int count=1;
                String contain = null;
                while ((contain = bufferedReader.readLine())!=null){
                    System.out.println(count+" "+contain);
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
        }else {
            System.out.println("文件不存在");
        }
    }
}
