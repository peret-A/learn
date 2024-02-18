package test12;

import java.io.*;
import java.util.Scanner;

public class MyRunnable extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread()+"线程拷贝文件启动 ----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入被拷贝我文件路径及问文件名称：");
        String soursePath = scanner.next();
        File sourseFile = new File(soursePath);
        System.out.println("请输入拷贝目的地文件夹名称：");
        String targePath = scanner.next();
        File targeFile = new File(targePath);
        targeFile.mkdir();
        createFile(sourseFile,soursePath,targePath);
    }
    public void createFile(File sourseFile,String soursePath,String targePath){
        //思路 使用深度遍历思想 向下复制文件
        //1.先获取文件夹的文件内容
        File[] files = sourseFile.listFiles();
        for(int i=0;i<files.length;i++){
            if(files[i].isFile()){
                //在目标文件创建
                String fileName = files[i].getName();
                fileName.replace(soursePath,targePath);
                File targeFile = new File(fileName);
                //将内容文件
                InputStream inputStream =null;
                Reader reader = null;
                BufferedReader bufferedReader =null;
                OutputStream outputStream =null;
                Writer writer =null;
                BufferedWriter bufferedWriter =null;
                try {
                    inputStream =new FileInputStream(files[i]);
                    reader = new InputStreamReader(inputStream);
                    bufferedReader = new BufferedReader(reader);
                    //因为是复制 所以是用写入的方式存储
                    outputStream = new FileOutputStream(targeFile);
                    writer = new OutputStreamWriter(outputStream);
                    bufferedWriter = new BufferedWriter(writer);
                    String contains = null;
                    while ((contains=bufferedReader.readLine())!=null){
                        bufferedWriter.write(contains);
                        //刷新
                        bufferedWriter.flush();
                    }
                } catch (FileNotFoundException e) {
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
            }else if(files[i].isDirectory()){
                //如果是文件夹
                String fileName = files[i].getName();
                fileName.replace(soursePath,targePath);
                File targeFile = new File(fileName);
                targeFile.mkdirs();
                createFile(files[i],soursePath,targePath);
            }
        }
    }
}
