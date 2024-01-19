package bdqn.test01;

public class Student extends Person{
    /*
    （2）再编写一个学生类Student，它继承Person类，其中包含学号属性，包含构造方法以及显示学号的方法。
    （3）在Student类里面重写equals方法，只要是学号和姓名一致就认为是同一个学生。
     */
    private int sno;


    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public Student() {
    }

    public Student(String name, String gender, int age, int sno) {
        super(name, gender, age);
        this.sno = sno;
    }
    //（3）在Student类里面重写equals方法，只要是学号和姓名一致就认为是同一个学生。
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object instanceof Student student){
            return this.getName().equals(student.getName())&&this.getSno()==student.getSno();
        }
        return false;
    }
}
