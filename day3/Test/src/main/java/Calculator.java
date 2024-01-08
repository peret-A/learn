public class Calculator {
    //定义两个字符型数据的相加
    public String add(String x,String y){
        int num1=Integer.parseInt(x);
        int num2=Integer.parseInt(y);
        String num3=String.valueOf(num1+num2);
        return num3;
    }
    //定义两个字符型数据的相减
    public String sub(String x,String y){
        int num1=Integer.parseInt(x);
        int num2=Integer.parseInt(y);
        String num3=String.valueOf(num1-num2);
        return num3;
    }
    //定义两个字符型数据的相乘
    public String mul(String x,String y){
        int num1=Integer.parseInt(x);
        int num2=Integer.parseInt(y);
        String num3=String.valueOf(num1*num2);
        return num3;
    }
    //定义两个字符型数据的相除
    public String div(String x,String y){
        int num1=Integer.parseInt(x);
        int num2=Integer.parseInt(y);
        //排除除数是0的情况
        if(num2==0)
            return null;
        String num3=String.valueOf(num1/num2);
        return num3;
    }
}
