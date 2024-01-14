import java.util.Scanner;

public class Test {
    /**
     *
     * @param args
     * 题目：设计一个图书管理系统，功能如下：
     * 要求：
     * 	1）通过账号控制图书管理系统，账号分为管理员账号和普通用户账号
     * 		管理员账号和普通用户账号都可以使用手机号码+密码、身份证号码+密码的形式登录
     * 		管理员账号和普通账号除了手机号码、身份中号码、密码三个数据之外，还有姓名、性别、专业、住址信息
     * 	2）启动系统后，显示登录账号、注册账号、退出登录三个模块
     * 		登录账号：
     * 			显示管理员登录、用户登录两个模块
     * 		注册账号：
     * 			显示注册管理员、注册用户两个模块
     * 		退出登录：
     * 			结束程序运行
     * 	3）登录账号成功后，根据账号的性质来显示不同的模块：
     * 		登录普通账号成功后，显示如下模块：
     * 			--》查看所有图书，图书显示哪些信息，你自行设计
     * 			--》借阅图书
     * 			--》归还图书
     * 			--》显示用户信息（只能查看自己的用户信息）
     * 			--》修改用户信息（只能修改自己的用户信息）
     * 			--》退出系统
     * 		登录管理员账号成功后，显示如下模块：
     * 			--》查看所有图书，图书显示哪些信息，你自行设计
     * 			--》添加图书
     * 			--》修改图书
     * 			--》删除图书
     * 			--》查看所有普通用户信息
     * 			--》查看管理员账号信息
     * 			--》修改管理员账号信息
     * 			--》退出系统
     * 提交作业要求：
     * 	1）新建一个项目完成上述内容，提交整个项目代码
     * 	2）项目编写完毕之后，自行测试，测试没有问题之后，进行一个完整的操作，这个操作过程录屏
     * 	3）提交截止时间：2024年1月14日 21：00之前
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //创建图书管理系统信息
        //用户信息 最多有4个可存在的账号
        //手机号码、身份中号码、密码三个数据之外，还有姓名、性别、专业、住址信息 权限（0为普通用户，1为管理员）
        String[] user_tel=new String[4];
        String[] user_id=new String[4];
        String[] user_pass=new String[4];
        String[] user_name=new String[4];
        String[] user_gender=new  String[4];
        String[] user_dept=new String[4];
        String[] user_adder=new String[4];
        int[] user_per=new int[4];
        user_tel[0]="156";
        user_id[0]="341";
        user_pass[0]="123";
        user_name[0]="root";
        user_per[0]=1;

        //count统计注册到第几个
        int user_count=0;

        //图书信息 名字 数量
        String[] book_name=new String[4];
        int[] book_num=new int[4];
        //记录添加图书的个数
        int book_count=0;
        //初始化图书信息
        book_name[book_count]="奥特曼大战小怪兽";
        book_num[book_count]=5;
        book_count++;
        book_name[book_count]="孙悟空暴打卡卡罗特";
        book_num[book_count]=2;


        //借阅图书信息 名字 时间 图书状态
        String[][] bor_book_name=new String[4][4];
        int[][] bor_book_time=new int[4][4];
        String[][] bor_book_state=new String[4][4];

        //控制循环
        int i=0;
        //创建图书管理系统整体构架
        //以do while（）循来使菜单可以方法可以循环使用
        //定义choose控制选择选项
        int choose=0;
        do{
            //启动系统后，显示登录账号、注册账号、退出登录三个模块
            System.out.println("---------------------启动系统-----------------------");
            System.out.println("1. 登录账号");
            //这里的注册账号，只能注册普通用户，如果想注册管理员账号需要通过已有管理员账号注册
            //初始管理员账号为 root 密码 为 123
            System.out.println("2. 注册账号");
            System.out.println("0. 退出登录");
            //用户选择
            System.out.print("选择:");
            choose=scanner.nextInt();
            //通过switch的方式进入选择的模块
            switch (choose){
                case 0:
                    System.out.println("---------------------退出登录-----------------------");
                    System.out.println("退出图书管理系统");
                    break;
                case 1:
                    System.out.println("---------------------登录账号-----------------------");
                    a:while (true){
                        System.out.print("输入用户的手机号码或者身份证号码: ");
                        String root=scanner.next();
                        for (i = 0;  i<=user_count ; i++) {
                            if(!root.equals("15")&&!root.equals("0")&&(user_tel[i].equals(root)||user_id[i].equals(root))){
                                   while (true){
                                       System.out.print("输入用户的密码: ");
                                       String pass=scanner.next();
                                       if(pass.equals(user_pass[i])){
                                           System.out.println("登录成功");
                                           //跳出循环
                                           break a;
                                       }else{
                                           System.out.println("密码错误");
                                           //重新输入账号密码
                                       }
                                   }
                            }
                        }
                        if(i==user_count){
                            break;
                        }

                    }
                    //通过权限判断是进入普通用户界面还是管理员界面
                    if(user_per[i]==0){
                        b:do {
                            System.out.println("---------------------用户界面-----------------------");
//                      登录普通账号成功后，显示如下模块：
//     		            --》查看所有图书，图书显示哪些信息，你自行设计
//                      --》借阅图书
//                      --》归还图书
//                      --》显示用户信息（只能查看自己的用户信息）
//      		    	--》修改用户信息（只能修改自己的用户信息）
//          			--》退出系统
                            System.out.println("1. 查看图书");
                            System.out.println("2. 借阅图书");
                            System.out.println("3. 归还图书");
                            System.out.println("4. 显示用户信息");
                            System.out.println("5. 修改用户信息");
                            System.out.println("6. 退出登录");
                            //用户选择
                            System.out.print("选择:");
                            choose=scanner.nextInt();
                            switch (choose){
                                case 6:
                                    System.out.println("---------------------退出登录-----------------------");
                                    break b;
                                case 1:
                                    System.out.println("---------------------查看图书-----------------------");
                                    System.out.println("图书信息: \t名字 \t\t\t数量");
                                    for (int j = 0; j <= book_count ; j++) {
                                        System.out.println("图书信息: \t" + book_name[j] + " \t" + book_num[j]);
                                    }
                                    while (true){
                                        System.out.println("如果要返回上一级，输入返回");
                                        String result=scanner.next();
                                        if(result.equals("返回")){
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("---------------------借阅图书-----------------------");
                                    //先生成借阅图书单 time为0 状态为未借阅
                                    for (int j = 0; j <=book_count; j++) {
                                        bor_book_name[i][j]=book_name[j];
                                        bor_book_time[i][j]=0;
                                        bor_book_state[i][j]="未借阅";
                                    }
                                    //输入要借阅的图书
                                    System.out.print("要借阅的图书:");
                                    String name=scanner.next();
                                    int j;
                                    //判断要借阅的书籍是否存在
                                    for (j = 0; j <= book_count; j++) {
                                        if(name.equals(book_name[j])){
                                            //存放借阅书单
                                            //i是匹配第几个用户去借阅书籍
                                            //j是匹配图书库的第几本书
                                            System.out.print("要借阅的时间:");
                                            bor_book_time[i][j]=scanner.nextInt();
                                            //借阅后图书库的数量减一
                                            book_num[j]--;
                                            bor_book_state[i][j]="借阅中";
                                            break;
                                        }
                                    }
                                    if(j==book_count+1){
                                        System.out.println("要借阅的书籍不存在，请重新确定");
                                    }
                                    break;
                                case 3:
                                    System.out.println("---------------------归还图书-----------------------");
                                    //先把书籍状态都打印出来
                                    System.out.println("图书信息: \t名字 \t\t\t数量 \t借阅时间  \t借阅状态");

                                    for (j = 0; j <= book_count ; j++) {
                                        System.out.println("图书信息: \t" + book_name[j] + " \t" + book_num[j] +
                                                "\t\t"+bor_book_time[i][j]+"\t\t\t"+bor_book_state[i][j]);
                                    }
                                    break;
                                case 4:
                                    System.out.println("---------------------显示用户信息-----------------------");
                                    System.out.println("手机号码\t\t\t身份中号码\t\t\t密码\t\t\t姓名\t\t\t性别\t\t\t专业\t\t\t住址信息");
                                          System.out.println(user_tel[i] + "\t\t" + user_id[i] + "\t" + user_pass[i] + "\t\t" + user_name[i] +
                                                    "\t\t\t" + user_gender[i] + "\t\t\t" + user_dept[i] + "\t\t\t" + user_adder[i]);

                                    break;
                                case 5:
                                    System.out.println("---------------------修改用户信息-----------------------");
                                    System.out.print("输入用户的密码: ");
                                    user_pass[user_count]=scanner.next();
                                    System.out.print("输入用户的名字: ");
                                    user_name[user_count]=scanner.next();
                                    System.out.print("输入用户的性别: ");
                                    user_gender[user_count]=scanner.next();
                                    System.out.print("输入用户的专业: ");
                                    user_dept[user_count]=scanner.next();
                                    System.out.print("输入用户的地址: ");
                                    user_adder[user_count]=scanner.next();
                                    break;
                                default:
                                    System.out.println("选择有误，重新选择");
                            }

                        }while (choose!=0);
                    }else{
                        b: do {
                            System.out.println("---------------------管理员界面-----------------------");
//                      登录管理员账号成功后，显示如下模块：
//          			--》查看所有图书，图书显示哪些信息，你自行设计
//                      --》添加图书
//                      --》修改图书
//                      --》删除图书
//                      --》查看所有普通用户信息
//                      --》查看管理员账号信息
//                      --》修改管理员账号信息
//                      --》退出系统
                            System.out.println("1. 查看图书");
                            System.out.println("2. 添加图书");
                            System.out.println("3. 删除图书");
                            System.out.println("4. 查看所有普通用户信息");
                            System.out.println("5. 查看管理员账号信息");
                            System.out.println("6. 修改管理员账号信息");
                            System.out.println("7. 退出登录");
                            //用户选择
                            System.out.print("选择:");
                            choose=scanner.nextInt();
                            switch (choose){
                                case 7:
                                    System.out.println("---------------------退出登录-----------------------");
                                    break b;
                                case 1:
                                    System.out.println("---------------------查看图书-----------------------");
                                    System.out.println("图书信息: \t名字 \t\t\t数量");
                                    for (int j = 0; j <= book_count ; j++) {
                                        System.out.println("图书信息: \t" + book_name[j] + " \t" + book_num[j]);
                                    }
                                    while (true){
                                        System.out.println("如果要返回上一级，输入返回");
                                        String result=scanner.next();
                                        if(result.equals("返回")){
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("---------------------添加图书-----------------------");
                                    if(book_count==3){
                                        System.out.println("图书库已满,需要添加新的图书，请先删除图书");
                                    }else{
                                        book_count++;
                                        System.out.print("图书名字：");
                                        book_name[book_count]=scanner.next();
                                        System.out.print("图书数量：");
                                        book_num[book_count]=scanner.nextInt();
                                    }
                                    break;
                                case 3:
                                    System.out.println("---------------------删除图书-----------------------");
                                    if(book_count==0){
                                        System.out.println("图书库已空,需要删除图书，请先添加新的图书");
                                    }else {
                                        System.out.print("输入要删除图书的名字：");
                                        String name=scanner.next();
                                        //输入的名字与图书库与之匹配，如果没有就结束，如果有就将后置位的图书前移，book_count--
                                    a: while (true){
                                        int j;
                                        for (j = 0; j <= book_count; j++) {
                                            if(name.equals(book_name[j])){
                                                //如果要删除的是最后一本book_count直接减一
                                                if(j==book_count){
                                                    book_count--;
                                                    System.out.println("删除结束");
                                                    break a;
                                                }else{
                                                    for (int k = j; k < book_count; k++) {
                                                        book_name[k]=book_name[k+1];
                                                        book_count--;
                                                    }
                                                }
                                                System.out.println("删除结束");
                                                break;
                                            }

                                        }
                                        if(j==book_count+1){
                                            System.out.println("重新确定要删除的图书");
                                            break;
                                        }
                                    }
                                    }
                                    break;
                                case 4:
                                    System.out.println("---------------------查看所有普通用户信息-----------------------");
                                    //手机号码、身份中号码、密码，姓名、性别、专业、住址信息
                                    System.out.println("手机号码\t\t\t身份中号码\t\t\t密码\t\t\t姓名\t\t\t性别\t\t\t专业\t\t\t住址信息");
//                                    System.out.println(user_tel[0] + "\t\t\t\t" + user_id[0] + "\t\t\t\t\t" + user_pass[0] + "\t\t\t" + user_name[0] +
//                                            "\t\t" + user_gender[0] + "\t\t" + user_dept[0] + "\t\t" + user_adder[0]);
                                    for (int j = 1; j <= user_count; j++) {
                                        //用权限去区分普通用户与管理员
                                        if(user_per[j]==0)
                                        System.out.println(user_tel[j] + "\t\t" + user_id[j] + "\t" + user_pass[j] + "\t\t" + user_name[j] +
                                                "\t\t\t" + user_gender[j] + "\t\t\t" + user_dept[j] + "\t\t\t" + user_adder[j]);
                                    }
                                    break;
                                case 5:
                                    System.out.println("---------------------查看管理员账号信息-----------------------");
                                    //手机号码、身份中号码、密码，姓名、性别、专业、住址信息
                                    System.out.println("手机号码\t\t\t身份中号码\t\t\t密码\t\t\t姓名\t\t\t性别\t\t\t专业\t\t\t住址信息");
                                    System.out.println(user_tel[0] + "\t\t\t\t" + user_id[0] + "\t\t\t\t\t" + user_pass[0] + "\t\t\t" + user_name[0] +
                                            "\t\t" + user_gender[0] + "\t\t" + user_dept[0] + "\t\t" + user_adder[0]);
                                    for (int j = 1; j <= user_count; j++) {
                                        //用权限去区分普通用户与管理员
                                        if(user_per[j]==1)
                                            System.out.println(user_tel[j] + "\t\t" + user_id[j] + "\t" + user_pass[j] + "\t\t\t" + user_name[j] +
                                                    "\t\t\t" + user_gender[j] + "\t\t\t" + user_dept[j] + "\t\t\t" + user_adder[j]);
                                    }
                                    break;
                                case 6:
                                    System.out.println("---------------------修改管理员账号信息-----------------------");
                                    //通过电话号码去确定
                                    //首先初始化账号不能修改
                                    System.out.print("输入要修改的电话号码");
                                    String tel=scanner.next();
                                    int j;
                                    //判断tel与已存在的数据进行匹配
                                    for (j = 1; j <= user_count; j++) {
                                        if(tel.equals(user_tel[j])){
                                            //进行修改
                                            //手机号码与身份证不能修改
                                            System.out.print("输入用户的密码: ");
                                            user_pass[user_count]=scanner.next();
                                            System.out.print("输入用户的名字: ");
                                            user_name[user_count]=scanner.next();
                                            System.out.print("输入用户的性别: ");
                                            user_gender[user_count]=scanner.next();
                                            System.out.print("输入用户的专业: ");
                                            user_dept[user_count]=scanner.next();
                                            System.out.print("输入用户的地址: ");
                                            user_adder[user_count]=scanner.next();
                                            System.out.print("输入用户的权限(0. 普通用户  1. 管理员): ");
                                            user_per[user_count]=scanner.nextInt()%2;
                                            break;
                                        }
                                    }
                                    //说明要修改的电话不存在
                                    if(j==user_count+1){
                                        System.out.println("该用户不存在，重新确定要修改的用户");
                                    }
                                    break;
                                default:
                                    System.out.println("选择有误，重新选择");
                            }
                        }while (choose!=0);
                    }
                    break;
                case 2:
                    System.out.println("---------------------注册账号-----------------------");
                    //注册普通用户
                    //确定输入到第几个用户
                    user_count++;
                 if(user_count==4){
                     System.out.println("已注册四个账号，如果想继续注册，请管理员删除账号后再注册");
                 }else{
                     while (true){
                         System.out.print("输入用户的手机号码（11位）前三位为156: ");
                         user_tel[user_count]=scanner.next();
                         if(user_tel[user_count].indexOf("156")==0){
                             int j;
                             for (j = 0; j < user_count; j++) {
                                 if(user_tel[j].equals(user_tel[user_count])){
                                     System.out.println("该账号已存在，重新输入");
                                     break;
                                 }
                             }
                             // 现存在的数据与输入的不一样
                             if(j==user_count){
                                 break;
                             }

                         }else{
                             System.out.println("不符合前三位为156，重新输入");
                         }
                     }
                     while (true){
                         System.out.print("输入用户的身份证号码（18位，前三位为341）: ");
                         user_id[user_count]=scanner.next();
                         if(user_id[user_count].indexOf("341")==0&&!user_tel[user_count].equals("341")){
                             int j;
                             for (j = 0; j < user_count; j++) {
                                 if(user_id[j].equals(user_id[user_count])){
                                     System.out.println("该账号已存在，重新输入");
                                     break;
                                 }
                             }
                             // 现存在的数据与输入的不一样
                             if(j==user_count){
                                 break;
                             }

                         }else{
                             System.out.println("不符合前三位为341，重新输入");
                         }
                     }
                     System.out.print("输入用户的密码: ");
                     user_pass[user_count]=scanner.next();
                     System.out.print("输入用户的名字: ");
                     user_name[user_count]=scanner.next();
                     System.out.print("输入用户的性别: ");
                     user_gender[user_count]=scanner.next();
                     System.out.print("输入用户的专业: ");
                     user_dept[user_count]=scanner.next();
                     System.out.print("输入用户的地址: ");
                     user_adder[user_count]=scanner.next();
                     user_per[user_count]=0;
                 }
                    break;
                default:
                    System.out.println("选择有误，重新选择");
            }
        }while (choose!=0);
        //关闭Scanner对象
        scanner.close();
    }
}
