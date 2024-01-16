public class NameSearch {
    //方法作用是根据name去names里面的start到end区间查找
    public static boolean nameSearch(String[] names,int start,int end,String name){
        //先避免越界访问
        if(start<0||end>names.length-1){
            return false;
        }
        //通过循环的方式去查找name是否在names
        for (int i=start;i<end;i++){
            if(name.equals(names[i])){
                return true;
            }
        }
        return false;
    }
}
