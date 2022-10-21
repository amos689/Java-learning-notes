package _31Exception;

public class _09FinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println("try...");

            //退出JVM
            System.exit(0);
        } finally {
            System.out.println("finally..."); //这里这句话就不再执行
        }
    }
}
