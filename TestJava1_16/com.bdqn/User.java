import java.util.Scanner;

public class User {
    public static String equal(String pass){
        //Scanner对象
        Scanner scanner=new Scanner(System.in);
        if(pass.equals("111111")){
            System.out.print("输请入新密码:");
            pass=scanner.next();
            System.out.println("修改密码成功，你的密码为:" + pass);
        }else{
            System.out.println("用户名与密码不匹配！你没有权限更新管理员信息");
        }

        return pass;
    }
}
