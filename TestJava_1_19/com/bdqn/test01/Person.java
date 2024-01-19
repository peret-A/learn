package bdqn.test01;

public class Person {
    /*
    28：
    （1）编写一个人类Person，其中包含姓名、性别和年龄的属性，包含构造方法以及显示姓名、性别和年龄的方法。
    （2）再编写一个学生类Student，它继承Person类，其中包含学号属性，包含构造方法以及显示学号的方法。
    （3）在Student类里面重写equals方法，只要是学号和姓名一致就认为是同一个学生。
    （4）最后编写一个测试类，此类里面包含main()方法，在main()方法中定义两个学生s1和s2并给他们赋值，
    最后显示他们的学号、姓名、性别以及年龄，以及判断两个学生是否是同一个学生。
     */
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
