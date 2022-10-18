package _11This;

//this在用于区分局部变量和实例变量时不能省略

public class _05User {
    //属性
    private int id;
    private String name; //实例变量

    //构造函数

    public _05User() {

    }
    //用于初始化名字和id
    public _05User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //用于修稿名字和id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        //等号前面的this.id是实例变量的id
        //等号后面的id是局部变量的id
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
