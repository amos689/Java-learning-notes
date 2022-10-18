package _13Inherit;

public class _04Extend {
    public static void main(String[] args) {
        C c = new C();
        c.doSome();
    }

}

class A{
    //当B中也有一个一模一样的doSome时, 优先继承B中的, 否则继承A中的
    public void doSome() {
        System.out.println("Do some!");
    }
}

class B extends A{
    public void doSome() {
        System.out.println("~~~Do some!~~~");
    }
}

class C extends B{

}