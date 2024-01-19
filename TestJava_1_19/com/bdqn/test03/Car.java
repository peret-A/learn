package bdqn.test03;

public class Car {
    /*
    26：创建一个汽车类（Car）
    （1）为其定义两个属性：颜色和型号。每个属性都使用private进行封装，为每个属性设置set、get方法。
    （2）为该类创建两个构造方法。第一个为无参的构造方法。第二个为带参构造方法
    （3）重写toString方法，通过toString输出汽车信息。
    （4）重写equals方法，如果汽车的颜色和型号相同就认为是同一辆车。
    （5）实例化两个对象，输出两个对象的信息，比较两个对象是否是同一个对象。
     */
    private String color;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    //（3）重写toString方法，通过toString输出汽车信息。
    public String toString(){
        return "车的颜色: "+this.getColor()+"，品牌: "+this.getModel();
    }
    //（4）重写equals方法，如果汽车的颜色和型号相同就认为是同一辆车。
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object instanceof Car car){
            return this.getColor().equals(car.getColor())&&this.getModel().equals(car.getModel());
        }
        return false;
    }
}
