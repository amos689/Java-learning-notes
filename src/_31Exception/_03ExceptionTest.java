package _31Exception;

/*
    分析为什么报错
        因为doSome()方法声明位置上使用了: throws ClassNotFoundException
        而ClassNotFoundException是编译时异常, 必须编写代码时处理, 没有处理编译器报错
 */

public class _03ExceptionTest {
    /*
        //第一种方式, 在方法声明的位置上继续使用throws, 来完成异常的继续上抛, 抛给调用者
        public static void main(String[] args) throws ClassNotFoundException{
            //main中调用doSome方法
            //因为doSome方法声明中有throws ClassNotFoundException
            //我们在调用doSome方法的时候必须对这种异常进行预先的处理
            //doSome(); //不预处理, 编译器报错: Unhandled exception: java.lang.ClassNotFoundException
            doSome(); //main方法throws之后没有报错

        }
    */

    //第二种处理方式: try...catch进行捕捉
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * doSome方法在方法声明的位置上使用了throws ClassNotFoundException
     * 这个代码表示doSome方法在执行过程可能出现ClassNotFoundException异常
     * 叫做类没找到异常, 这个类的直接父类是Exception, 所以ClassNotFoundException属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("doSome!");
    }
}
