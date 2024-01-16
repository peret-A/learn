public class NameSearchTest {
    public static void main(String[] args) {
        String[] names={"张三","李四","王五","赵六","奥特曼","小怪兽","烦死了"};
        System.out.println("结果为"+NameSearch.nameSearch(names, 1, 5, "张三"));
    }
}
