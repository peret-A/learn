package bdqn.test01;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        // 准备数据
//        Student student1 =new Student("小明",25);
//        Student student2 =new Student("小黑",26);
//        Student student3 =new Student("小米",27);
//        Student student4 =new Student("小侯",28);
//        Student student5 =new Student("小红",29);
//
//        // 准备容器
//        HashSet hashSet =new HashSet<>();
//
//        //插入数据
//        hashSet.add(student1);
//        hashSet.add(student2);
//        hashSet.add(student3);
//        hashSet.add(student4);
//        hashSet.add(student5);
//        hashSet.add(student2);
//
//        //遍历数据
//        System.out.println(hashSet.toString()+"长度："+hashSet.size());
//        Iterator iterator = hashSet.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println(hashSet.toString()+"是空:"+hashSet.isEmpty());
//
//        System.out.println(student1.toString()+"存在:"+hashSet.contains(student1));
//
//        hashSet.remove(student3);
//
//        //遍历数据
//        System.out.println(hashSet.toString()+"长度："+hashSet.size());
//        iterator = hashSet.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        hashSet.clear();
//        //遍历数据
//        System.out.println(hashSet.toString()+"长度："+hashSet.size());
//        iterator = hashSet.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //准备容器
        HashMap hashMap =new HashMap<>();
        //准备数据
        Student student1 =new Student("小明",25);
        Student student2 =new Student("小黑",26);
        Student student3 =new Student("小米",27);
        Student student4 =new Student("小侯",28);
        Student student5 =new Student("小红",29);

        //插入数据
        hashMap.put(student1.getName(),student1.getAge());
        hashMap.put(student4.getName(),student4.getAge());
        hashMap.put(student2.getName(),student2.getAge());
        hashMap.put(student3.getName(),student3.getAge());
        hashMap.put(student4.getName(),student4.getAge());
        hashMap.put(student5.getName(),student5.getAge());

        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.get(student1.getName()));

//        //遍历数据
//        Set keySet = hashMap.keySet();
//        for (Object obj : keySet){
//            String key = (String) obj;
//            Object object = hashMap.get(key);
//            //转换成真实要输出的类型
//            int values =(int) object;
//            System.out.println(key+"---"+values);
//        }

        //遍历
        Set setKey = hashMap.entrySet();

        for (Object object:setKey){
            // //键键值对的类型转换为起真实类型Map.Entry
            //            Map.Entry me = (Map.Entry)object;
            //            //使用me对象调用方法获取键值对里的键
            //            Object keyObj =me.getKey();
            //            String key = (String)keyObj;
            //            //使用me对象调用方法获取键值对里的值
            //            Object valueObj =me.getValue();
            //            String value = (String) valueObj;
            //            System.out.println(key+"---"+value);

            //键值对的类型转换成真实类型Map.Entry
            Map.Entry me =(Map.Entry) object;
            //使用me对象调用方法获取键值对的值
            Object keyObj = me.getKey();
            String key =(String)keyObj;
            Object valueObj = me.getValue();
            int value = (int) valueObj;
            System.out.println(key + " -- " + value);

        }

    }
}
