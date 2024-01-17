public class Person {
    private String name;
    private int age;
    private String gender;
    private String tel;
    private String adder;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }

    public Person(String name, int age, String gender, String tel, String adder) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
        this.adder = adder;
    }
}
