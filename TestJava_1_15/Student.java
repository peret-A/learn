public class Student {
    private String sname;
    private int sid;
    private int sage;
    private String sgender;
    private int sheight;
    private int swight;

    public Student(){
        this.sname="小明";
        this.sid=1001;
        this.sage=18;
        this.sgender="男";
        this.sheight=176;
        this.swight=150;
    }

    public Student(String sname, int sid, int sage, String sgender, int sheight, int swight) {
        this.sname = sname;
        this.sid = sid;
        this.sage = sage;
        this.sgender = sgender;
        this.sheight = sheight;
        this.swight = swight;
    }

    @Override
    public String toString() {
        return "学生{" +
                "学生姓名='" + sname + '\'' +
                ", 学生学号=" + sid +
                ", 学生年龄=" + sage +
                ", 学生性别='" + sgender + '\'' +
                ", 学生身高=" + sheight +
                ", 学生体重=" + swight +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public int getSheight() {
        return sheight;
    }

    public void setSheight(int sheight) {
        this.sheight = sheight;
    }

    public int getSwight() {
        return swight;
    }

    public void setSwight(int swight) {
        this.swight = swight;
    }
}
