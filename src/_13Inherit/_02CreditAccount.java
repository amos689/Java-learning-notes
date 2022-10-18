package _13Inherit;

public class _02CreditAccount extends _01Account{
    //需要actnum/balance/credit
    //继承之后只需要再创建一个credit就行了
    private double credit;

    public _02CreditAccount() {
        super();
    }

    public _02CreditAccount(String actnum, double balance, double credit) {
        super(actnum, balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
