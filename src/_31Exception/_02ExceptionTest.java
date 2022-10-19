package _31Exception;

/*
    1.Java中异常是以类的形式存在, 每一个异常类都可以创建异常对象
    2.异常对应到现实生活是:
        火灾(异常类):
            2008.8.8小明家着火了(异常对象)
            2008.8.9小刚家着火了(异常对象)
            2008.9.8小红家着火了(异常对象)
            ...
        类是模板, 对象是实际存在的个体
 */
public class _02ExceptionTest {
    public static void main(String[] args) {
        //通过异常类创建异常对象
        NumberFormatException nfe = new NumberFormatException("数字格式化异常! ");
        System.out.println(nfe); //调用了toString方法

        //通过异常类创建异常对象
        NullPointerException npe = new NullPointerException("空指针异常!");
        System.out.println(npe);

    }
}
