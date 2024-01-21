package test;

public class Pengui extends Pet{
    //特殊属性
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Pengui(String name, int health, int love, double weight) {
        super(name, health, love);
        this.weight = weight;
    }

    public Pengui() {
    }

    //重写方法

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void toCure() {
       if(this.getHealth()<60){
           System.out.println("宠物生病了.....经过治疗,健康值到90");
           this.setHealth(90);
       }

    }

    @Override
    public void m1() {
        System.out.println("烦死了");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("宠物重量: " + this.getWeight());
    }

    //特殊方法
    public void swimming(){
        System.out.println("宠物正在游泳");
    }
}
