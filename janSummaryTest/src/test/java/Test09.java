import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class Test09 {
    /*
    9、统计一个文件calcCharNum2.txt（文件自备）中各个字母出现次数：
    A(8),B(16),C(10)...,a(12),b(10),c(3)....中(5),国(6)，括号内代表字符出现次数;
     */
    public static void main(String[] args) {
        //思路:文件的字母数量不确定,所以使用变长数组去统计 hashMap 因为 hashMap是不可重复，且无序，所以最后不用排序
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        //准备文件
        File file = new File("calcCharNum.txt");
        //读取流
        InputStream inputStream=null;
        Reader reader =null;
        BufferedReader bufferedReader = null;
        try {
            inputStream = new FileInputStream(file);
            reader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(reader);
            //读取数据
            String line ;
            while ((line=bufferedReader.readLine())!=null){
                for (int i = 0; i < line.length(); i++) {
                     Character key = line.charAt(i);
                     Integer value = 1;
                     //如果存在这个字符就加1 如果不存在就创建并加1
                    if(hashMap.containsKey(key)){
                        value = hashMap.get(key) + 1;
                    }
                    hashMap.put(key,value);

                }
            }
            //遍历map
            Set<Character> keys = hashMap.keySet();
            for (var key: keys){
                System.out.print(key + "(" + hashMap.get(key) + ")  ");
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
