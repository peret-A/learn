public class TherMometer {
    /*
    小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
    它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
    提示：摄氏度与芈氏度的转换公式为：摄氏度 = 5/9.0*(华氏度-32)
     */
    public double conversion(double x){
        return 5/9.0*(x-32);
    }
}
