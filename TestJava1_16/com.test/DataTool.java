public class DataTool {
    /**
     * 3、定义一个日期工具类，在类中定义如下方法：
     * 	1）定义一个静态方法，实现判断指定年份是闰年还是平年的方法
     * 	2）定义一个静态方法，实现求一个指定日期是这一年的第几天
     * 	3）定义一个静态方法，实现求指定日期处于哪一个季节
     *
     */
    //定义一个静态方法，实现判断指定年份是闰年还是平年的方法
    public static boolean isLeapYear(int year){
        if((year%4==0&&year%100!=0)||year%400==0){
            return true;
        }
        return false;
    }

    //定义一个静态方法，实现求一个指定日期是这一年的第几天
    public static int yearDay(int year,int month,int day){
        //设置一个数据存储每个月的天数
        int[] monthDay={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(month>2){
            //如果超过了2月就判断是否为闰年，如果是就day+1，如果不是就不变
            if(isLeapYear(year)){
                day++;
            }
        }
        int sum=0;
        for (int i = 0; i < month; i++) {
            sum+=monthDay[month];
        }
        return sum+day;
    }

    //定义一个静态方法，实现求指定日期处于哪一个季节
    public static void dataSeason(int year,int month,int day){
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("处于冬天");
            case 3:
            case 4:
            case 5:
                System.out.println("处于春天");
            case 6:
            case 7:
            case 8:
                System.out.println("处于夏天");
            case 9:
            case 10:
            case 11:
                System.out.println("处于秋天");
        }

    }
}
