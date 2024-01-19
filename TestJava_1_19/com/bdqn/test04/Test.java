package bdqn.test04;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person("101",'男',"小明",18,"安徽",new Date());
        Person person2=new Person("101",'男',"小明",18,"安徽",new Date());
        System.out.println("两个人是一个人: "+person1.equals(person2));
        System.out.println("第一人: "+person1.toString());
        System.out.println("第二人: "+person2.toString());
    }
}
