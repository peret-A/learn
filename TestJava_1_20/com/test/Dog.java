package test;

public class Dog extends Pet{
    //特殊属性
    private String variety;

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Dog(String name, int health, int love, String variety) {

        super(name, health, love);
        this.variety = variety;
    }

    public Dog() {
    }

    //重写方法

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("品种: " + this.getVariety());
    }

    @Override
    public void toCure() {
        if(this.getHealth()<60){
            System.out.println("宠物生病.......经过治疗，健康值到80");
            this.setHealth(80);
        }

    }

    @Override
    public void m1() {
        System.out.println("ssssssssssssssss");
    }

    //特殊方法
    public void eat(){
        System.out.println("宠物正在吃饭");
    }
}
