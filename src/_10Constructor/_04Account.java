package _10Constructor;
//这是一个账户类
//tips: 按alt + 7可以查看整个类里面的所有方法和变量
public class _04Account {
    //账号
    private String actnum;
    //余额
    private double balance;
    //当一个类显示的将构造方法定义出来了, 那么系统将不再默认为这个类提供缺省构造器
    //想调用必须自己写
    public _04Account() {

    }

    public _04Account(double d) {
        balance = d;
    }

    public _04Account(String s) {
        actnum = s;
    }

    public _04Account(double d, String s) {
        balance = d;
        actnum = s;
    }

    public String getActnum() {
        return actnum;
    }

    public void setActnum(String actnum) {
        this.actnum = actnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
