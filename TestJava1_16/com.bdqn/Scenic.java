public class Scenic {
    public String name;
    public int age;
    public void play(){
        if(age>=12&&age<=65){
            System.out.println(name + "的年龄为" + age + "，门票是:20元");
        }else{
            System.out.println(name + "的年龄为" + age + "，门票免费");
        }
    }
}
