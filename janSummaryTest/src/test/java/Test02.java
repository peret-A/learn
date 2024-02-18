import java.io.File;
import java.util.Scanner;

public class Test02 {
    /*
    2、递归实现输入任意目录，列出文件以及文件夹
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner =new Scanner(System.in);
        //输入要遍历的目录
        System.out.print("输入要遍历的目录: ");
        String path = scanner.next();
        File file =new File(path);
        //遍历目录
        FilePrint(file);
    }
    public static void FilePrint(File file){
        //判断是文件还是文件夹
        if(file.isFile()){
            System.out.println(file.getName()+"文件");
            //如果是文件是没有下级文件的所以结束递归
            return;
        }
        if(file.isDirectory()){
            System.out.println("------------------------");
            System.out.println(file.getName()+"目录");
            //如果是目录的话就进入遍历目录文件
           File[] files = file.listFiles();
           for (File file1: files){
               FilePrint(file1);
           }
        }
    }
}
