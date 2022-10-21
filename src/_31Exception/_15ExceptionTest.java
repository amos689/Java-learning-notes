package _31Exception;

/*
    之前讲过一个问题: 重写之后的方法不能比重写之前的方法抛出的异常更多/更宽泛, 可以更少/更不宽泛
 */
public class _15ExceptionTest {

}

class Animal {
    public void doSome() {

    }
}

class Cat extends Animal {
    /*
    编译报错
    public void doSome() throws Exception {

    }*/
}
