package _13Inherit;

public class _01Account {
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
