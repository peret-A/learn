import java.io.File;
import java.util.Scanner;

public class Test03 {
    /*
    3、递归实现列出当前工程下所有.java文件
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner =new Scanner(System.in);
        //输入要遍历的项目
        System.out.print("输入要遍历的项目: ");
        String path = scanner.next();
        File file =new File(path);
        FilePrint(file);
    }
    public static void FilePrint(File file){
        if(file.isFile()){
        //判断是文件还是文件夹且是.java后缀
            try{
                String suffix = file.getName().substring(file.getName().lastIndexOf("."));
                if(suffix.equals(".java")){
                    System.out.println(file.getName());
                }

            }catch (IndexOutOfBoundsException e){
            }finally {
                //无论文件是否为.java文件都会结束本次递归
                return;
            }
        }
        if(file.isDirectory()){
            //如果是目录的话就进入遍历目录文件
            File[] files = file.listFiles();
            for (File file1: files){
                FilePrint(file1);
            }
        }
    }
}
