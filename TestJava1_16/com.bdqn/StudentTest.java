import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
//        Student student=new Student();
//        student.name="张三";
//        student.score=80;


        Student[] students=new Student[3];
        students[0]=new Student();
        students[1]=new Student();
        students[2]=new Student();
        students[0].name="张三";
        students[0].score=95;
        students[1].name="李四";
        students[1].score=100;
        students[2].name="王五";
        students[2].score=85;
        //遍历
        for (Student student : students) {
            System.out.println(student.name);
            System.out.println(student.score);
        }
    }
}
