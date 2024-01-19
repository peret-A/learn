package bdqn.test02;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=new Car(4,20.0,4);
        System.out.println("小车:"+vehicle.toString());
        vehicle=new Truck(4,20.0,200);
        System.out.println("卡车"+vehicle.toString());
    }
}
