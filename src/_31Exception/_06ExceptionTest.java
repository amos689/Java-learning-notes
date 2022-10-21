package _31Exception;

/*
    异常对象有两个非常重要的方法:
        exception.getMessage(); 获取异常简单的描述信息
        exception.printStackTrace(); 打印异常追踪的堆栈信息
    异常追踪信息跳过SUN的代码, 找到自己的代码, 然后从上往下看, 可以快速调试程序
 */
public class _06ExceptionTest {
    public static void main(String[] args) {
        //只是new异常, 但是没有抛出(throw关键字)就不会结束程序, JVM认为这就是个普通的对象
        NullPointerException e = new NullPointerException("空指针异常");
        //获取简单的异常描述信息, 信息就是构造方法中的String参数
        String msg = e.getMessage();
        System.out.println(msg);
        //打印异常信息
        //Java后台打印异常堆栈追踪信息的时候, 采用了异步线程的方式进行打印
        //在实际的开发中建议使用这个
        //看printStackTrace的技巧: 找到自己文件下的异常, 然后从上往下看
        e.printStackTrace();

    }
}
