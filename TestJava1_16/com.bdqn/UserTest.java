import java.util.Scanner;
public class UserTest {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //输入用户名
        System.out.print("输入用户名:");
        String root=scanner.next();
        //输入密码
        System.out.print("输入密码");
        String pass=scanner.next();
        pass=User.equal(pass);

    }
}
