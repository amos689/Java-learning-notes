package _17Super;

/*
    1.在恰当的时间使用super(实际参数列表);
    2.注意: 在构造方法执行中一连调用了父类的构造方法, 父类的构造方法又继续向下调用它的
      构造方法, 但是事实上对象只创建了一个.
    3.super(实参)到底干什么?
        super(实参)的作用是: 初始化当前对象的父类型特征, 并不是创建新的对象
        super关键字代表的就是"当前对象"的那部分父类型特征:
            (我继承了父亲的特征, super代表的就是这些特征, 但是终究是长在我身上的)
 */
public class _03SuperTest {
    public static void main(String[] args) {
        _02CreditAccount ca1 = new _02CreditAccount();
        _02CreditAccount ca2 = new _02CreditAccount("1111", 10000, 0.99);
        System.out.println(ca1.getCredit() + "," + ca1.getBalance() + "," + ca1.getActnum());
        System.out.println(ca2.getCredit() + "," + ca2.getBalance() + "," + ca2.getActnum());
    }
}

//账户
class _01Account {
    private String actnum;
    private double balance;

    public _01Account() {

    }
    public _01Account(String actnum, double balance) {
        this.actnum = actnum;
        this.balance = balance;
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

//信用账户
class _02CreditAccount extends _01Account{
    //需要actnum/balance/credit
    //继承之后只需要再创建一个credit就行了
    private double credit;

    public _02CreditAccount() {
        super();
    }

    public _02CreditAccount(String actnum, double balance, double credit) {
        /*
            不能使用
            this.actnum = actnum;
            this.balance = balance;
            因为是私有的属性, 无法被继承
            只能使用super来创建_01Account对象
         */
        super(actnum, balance);//调用super的含参构造方法
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}

