package bdqn.test03;

public class Test {
    public static void main(String[] args) {
        //（5）实例化两个对象，输出两个对象的信息，比较两个对象是否是同一个对象。
        Car car1 =new Car("red","大众");
        Car car2 =new Car("red","大众");
        System.out.println("两辆车相同: "+car2.equals(car1));
    }
}
