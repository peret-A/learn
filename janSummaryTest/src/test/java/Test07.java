import java.io.*;

public class Test07 {
    /*
    7、统计一个文件calcCharNum.txt（文件自备）中字母'A'和'a'出现的总次数
     */
    public static void main(String[] args) {
        //准备文件
        File file =new File("calcCharNum.txt");
        //创建读取流
        InputStream inputStream=null;
        Reader reader=null;
        BufferedReader bufferedReader=null;
        try {
            inputStream =new FileInputStream(file);
            reader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(reader);
            //读取数据
            int contains;
            //用于统计A a 的数量
            int countA=0;
            int counta=0;
            while ((contains=bufferedReader.read())!=-1){
                if((char)contains=='A') countA++;
                if((char)contains=='a') counta++;
            }
            System.out.println("文件calcCharNum.txt中 A出现的次数为: " + countA + " a出现的次数为: " + counta);
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
