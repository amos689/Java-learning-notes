package _21ControlPermissions.Test;
import _21ControlPermissions.*;

public class _00Test extends _02User {
    public void main(String[] args) {
        age = 1; //想直接访问, main方法不能加static, 因为不能从静态上下文中引入非静态变量
        _02User u1 = new _02User();
        _00Test t1 = new _00Test();
        //System.out.println(u1.age); u1中的无法被访问
        System.out.println(t1.age); //age可以在子类中被访问
        //System.out.println(t1.name); default修饰的都无法访问
        //System.out.println(u1.name);
    }
}
