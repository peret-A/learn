public class GeometryTools {
    /**
     * 1、定义一个几何图形工具类，在类中定义如下方法：
     * 	1）定义一个静态方法，实现返回正方形周长
     * 	2）定义一个静态方法，实现返回正方形面积
     * 	3）定义一个静态方法，实现返回长方形周长
     * 	4）定义一个静态方法，实现返回长方形面积
     * 	5）定义一个静态方法，实现返回圆形周长
     * 	6）定义一个静态方法，实现返回圆形面积
     * 	7）定义一个静态方法，实现返回正方体面积
     * 	8）定义一个静态方法，实现返回正方体体积
     * 	9）定义一个静态方法，实现返回长方体面积
     * 	10）定义一个静态方法，实现返回长方体体积
     * 	11）定义一个静态方法，实现返回圆柱体面积
     * 	12）定义一个静态方法，实现返回圆柱体体积
     */
    //定义一个静态方法，实现返回正方形周长
    public static double squareCircumference(double side){
        return side*4;
    }
    //定义一个静态方法，实现返回正方形面积
    public static double squareArea(double side){
        return side*side;
    }
    //定义一个静态方法，实现返回长方形周长
    public static double rectangleCircumference(double lenght,double weight){
        return lenght*2+weight*2;
    }
    //定义一个静态方法，实现返回长方形面积
    public static double rectangleArea(double lenght,double weight){
        return lenght*weight;
    }
    //定义一个静态方法，实现返回圆形周长
    public static double circularCircumference(double radius){
        return Math.PI*radius*2;
    }
    //定义一个静态方法，实现返回圆形面积
    public static double circularArea(double radius){
        return Math.PI*radius*radius;
    }
    //定义一个静态方法，实现返回正方体面积
    public static double theAreaOfTheCube(double side){
        return side*side*6;
    }
    //定义一个静态方法，实现返回正方体体积
    public static double cubeVolume(double side){
        return side*side*side;
    }
    //定义一个静态方法，实现返回长方体面积
    public static double boxArea(double lenght,double weight,double height){
        return lenght*weight*2+lenght*height*2+weight*height*2;
    }
    //定义一个静态方法，实现返回长方体体积
    public static double boxVolume(double lenght,double weight,double height){
        return lenght*weight*height;
    }
    //定义一个静态方法，实现返回圆柱体面积
    public static double cylinderArea(double radius,double height){
        return Math.PI*radius*radius+Math.PI*radius*2*height;
    }
    //定义一个静态方法，实现返回圆柱体体积
    public static double cylinderVolume(double radius,double height){
        return Math.PI*radius*radius*height;
    }
}
