package bdqn.test01;

public class test {
    public static void main(String[] args) {
        /*
        （4）最后编写一个测试类，此类里面包含main()方法，在main()方法中定义两个学生s1和s2并给他们赋值，
    最后显示他们的学号、姓名、性别以及年龄，以及判断两个学生是否是同一个学生。
         */
        Student s1=new Student("小明","男",25,101);
        Student s2=new Student("小明","女",31,101);
        System.out.println("s1和s2相同: "+s1.equals(s2));
    }
}
