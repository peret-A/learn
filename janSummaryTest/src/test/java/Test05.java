import java.io.*;

public class Test05 {
    public static void main(String[] args) {
        /*
        5、在程序中写一个"HelloJavaWorld你好世界"输出到操作系统文件Hello.txt文件中
         */
        //创建Hello.txt文件  因为是写入所以不需要 createnewfile
        File file =new File("Hello.txt");
        //创建输出流
        OutputStream outputStream=null;
        Writer writer=null;
        BufferedWriter bufferedWriter=null;
        try {
            outputStream = new FileOutputStream(file,true);
            writer =new OutputStreamWriter(outputStream,"utf-8");
            bufferedWriter =new BufferedWriter(writer);
            bufferedWriter.write("HelloWorld你好世界");
            //刷新
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //关闭流
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
