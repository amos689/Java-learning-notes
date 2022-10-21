package _31Exception;

/*
    1.SUN提供的内置异常肯定是不够用的
      在实际开发中有很多业务出现异常之后, JDK中都是没有对应的异常的
      那么异常类程序员可以自定义, 依照SUN的源码照葫芦画瓢
    2.Java中怎么自定义异常呢
        - 编写一个类继承Exception(编译时异常)或者RuntimeException(运行时异常)
        - 提供两个构造方法: 一个无参数, 一个有String参数
 */
public class _12MyException extends Exception{
    public _12MyException() {
    }

    public _12MyException(String message) {
        super(message);
    }
}
