package test;

public class Test {

    public static void main(String[] args) {
        Master master=new Master();
        Pet pet =new Dog("小明",20,100,"大毛");
        pet.run();
        // 父类的对象去子类实例化时不能调用子类的特殊方法
//        pet.eat();/
         pet.print();
        master.cure(pet);
        pet.print();

        System.out.println("*********************************");
         pet =new Pengui("小红",40,100,2000);
         pet.print();
         master.cure(pet);
         pet.print();
    }
}
