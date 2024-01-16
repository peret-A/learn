public class Test {
    public static void main(String[] args) {
        //对于几何图形工具类的测试
        System.out.println("------------对于几何图形工具类的测试-------------");
        System.out.println("边长为2的正方形的周长为:" + GeometryTools.squareCircumference(2));
        System.out.println("边长为2的正方形的面积为:" + GeometryTools.squareArea(2));
        System.out.println("长为2，宽为3的长方形的周长为:" + GeometryTools.rectangleCircumference(2, 3));
        System.out.println("长为2，宽为3的长方形的周长为:" + GeometryTools.rectangleArea(2, 3));
        System.out.println("半径为2圆的周长:" + GeometryTools.circularCircumference(2));
        System.out.println("半径为2圆的面积:" + GeometryTools.circularArea(2));
        System.out.println("边长为2的正方体的周长为:" + GeometryTools.theAreaOfTheCube(2));
        System.out.println("边长为2的正方体的面积为:" + GeometryTools.cubeVolume(2));
        System.out.println("长为2，宽为3，高为5的长方形的周长为:" + GeometryTools.boxArea(2, 3, 4));
        System.out.println("长为2，宽为3，高为5的长方形的面积为:" + GeometryTools.boxVolume(2, 3, 4));
        System.out.println("半径为2，高为3圆柱体面积为" + GeometryTools.cylinderArea(2, 3));
        System.out.println("半径为2，高为3圆柱体体积为" + GeometryTools.cylinderVolume(2,3));

        System.out.println("------------对于数组工具类的测试-------------");
        System.out.println("初始化数组为 10,5,3,8,1,6,4,2,7,9");
        int[] nums={10,5,3,8,1,6,4,2,7,9};
        System.out.print("取出初始化数组的最大值:");
        System.out.println(ArraysTool.arraysMax(nums));
        System.out.print("取出初始化数组的最小值:");
        System.out.println(ArraysTool.arraysMin(nums));
        System.out.print("取出初始化数组的数据之和:");
        System.out.println(ArraysTool.arraysSum(nums));
        System.out.print("对初始化数组的升序排序:");
        ArraysTool.arraysSort(nums);
        //遍历
        for (int element:nums){
            System.out.print(element);
        }
        System.out.println();
        System.out.print("对数组的降序排序:");
        ArraysTool.arraysReSort(nums);
        //遍历
        for (int element:nums){
            System.out.print(element);
        }
        System.out.println();
        System.out.print("对数组的降序打印:");
        ArraysTool.arraysRePrint(nums);
        System.out.println("判断数组是否存在5:" + ArraysTool.arraysSearch(nums, 5));
        System.out.println("------------对于日期工具类的测试-------------");
        System.out.println("初始化日期为 2008 9 20");
        System.out.println("初始化日期是为闰年:"+DataTool.isLeapYear(2008));
        System.out.println("初始化日期是为本年的第:"+DataTool.yearDay(2008, 9, 20)+"天");
        DataTool.dataSeason(2008,9,20);
    }
}
