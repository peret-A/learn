package bdqn.test02;

public class Car extends Vehicle{
    /*
     小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
     */
    private int loader;

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public Car() {
    }
    //（2）每个类都输出相关数据的toString方法
    public String toString(){
        return "车轮个数： "+this.getWheels()+"车重: "+this.getWeight()+"载人数: "+this.getLoader();
    }
}
