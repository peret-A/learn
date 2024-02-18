import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class Test13 {
    /*
    13、查看D盘中所有的文件和文件夹名称，并且使用名称升序降序，文件夹在前和文件夹在后，文件大小排序等。
     */
    public static void main(String[] args) {
        File file = new File("D:");
        sortName(file);
        sortType(file);
        sortSize(file);
    }

    private static void sortSize(File file) {
        System.out.println("---------文件大小排序---------");
        HashMap<Long,String> hashMap = new HashMap<>();
        File[] files =file.listFiles();
        for(File file1:files){
            hashMap.put(file1.length(),file1.getName());
        }
        for (String s:hashMap.values()){
            System.out.println(s);
        }
    }

    private static void sortType(File file) {
        //两次遍历
        System.out.println("--------文件夹在前和文件夹在后--------");
        File[] files =file.listFiles();
        for(File file1:files){
            if(file1.isDirectory()){
                System.out.println(file1.getName());
            }
        }
        for(File file1:files){
            if(file1.isFile()){
                System.out.println(file1.getName());
            }
        }
    }

    private static void sortName(File file) {
        String[] strings =file.list();
        Arrays.sort(strings);
        System.out.println("------------名称排序-----------");
        for (String s:strings){
            System.out.println(s);
        }
    }
}
