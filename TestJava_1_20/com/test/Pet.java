package test;

public abstract class Pet {
    private String name;
    private int health;
    private int love;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                '}';
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    //打印信息
    public void print(){
        System.out.println("宠物信息");
        System.out.println("名字: " + this.getName() + "， 健康值: " + this.getHealth() + ", 亲密值: " + this.getLove());
        return;
    }
    //治疗
    public void toCure(){
        System.out.println("宠物在治疗");
        return;
    }
    //特殊功能
    public void run() {
        System.out.println("宠物跑");
        return;
    }

    public abstract void m1();

    }
