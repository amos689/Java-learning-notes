package _31Exception;

/*
    finally语句
        try语句和finally语句可以直接连用, 可以没有catch
        *** 放在finally语句块中的语句一定会执行, 除了(System.exit(0);)
 */
public class _08FinallyTest {
    public static void main(String[] args) {
        /*
            以下代码的执行顺序:
                先执行try...
                再执行finally...
                最后执行return, 方法结束
         */
        try {
            System.out.println("try...");
            return;
        } finally {
            System.out.println("finally...");
        }

        //System.out.println("hello"); //报错: Unreachable statement
    }
}
