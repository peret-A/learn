package bdqn.test02;

public class Truck extends Vehicle{
    /*
    卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
     */
    private double payload;

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public Truck(int wheels, double weight, double payload) {
        super(wheels, weight);
        this.payload = payload;
    }

    public Truck() {
    }
    //    //（2）每个类都输出相关数据的toString方法
    public String toString(){
        return "车轮个数： "+this.getWheels()+"车重: "+this.getWeight()+"载重量: "+this.getPayload();
    }
}
