import java.io.*;

public class Test14 {
    /*
    1、使用IO流，在F盘的Java2408目录下面，给花名册.txt文件中的每个人创建一个目录（目录名就是人名）
     */
    public static void main(String[] args) {
        File file =new File("C:\\Users\\86156\\Desktop\\1月日历\\Java+大数据2408班假期作业\\IO流作业\\花名册.txt");
        //读取数据
        try {
            InputStream inputStream =new FileInputStream(file);
            Reader reader =new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String name = null;
            while ((name=bufferedReader.readLine())!=null){
                File file1 = new File("C:\\Users\\86156\\Desktop\\1月日历\\Java+大数据2408班假期作业\\"+name);
                file1.mkdirs();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
