import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test01 {
    /**
     * 1、在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，
     * 在创建一个目录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //创建文件
        File file =new File("D:\\HelloWorld.txt");
        file.createNewFile();
        //判断属性
        System.out.println("HelloWorld.txt是文件:"+file.isFile());
        System.out.println("HelloWorld.txt是目录:"+file.isDirectory());
        //创建一个目录IOTest
        File file1 = new File("D:/IOTest");
        file1.mkdir();
//        System.out.println(file1.isDirectory());
        //将文件移动到目录下
        Files.move(file.toPath(), Path.of(file1.getPath() + "/HelloWorld.txt"));
        //遍历目录
        File[] files = file1.listFiles();
        for (File file2: files){
            System.out.println(file2.getName());
        }
    }
}
