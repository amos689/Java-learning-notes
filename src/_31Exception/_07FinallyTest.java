package _31Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    关于Java中的finally字句:
        1.在finally字句中的代码时最后执行的, 并且是一定会执行的, 即使try语句块中的代码出现了异常
          finally字句必须和try一起出现, 不能单独编写
        2.finally语句通常使用在哪些情况下呢
            通常在finally语句块中完成资源的释放/关闭
            因为finally中的代码比较有保障
            即使try中的语句出现异常, finally语句块也会正常执行
 */
public class _07FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建输入流对象
            fis = new FileInputStream("E:\\Dapp1\\ticket-meteor-dapp-master\\README.md");

            String s = null;
            //这里一定会出现空指针异常, 如果不用finally, 流就不会关闭
            s.toString();

            //流使用完要关闭, 因为占用资源, 流用完不关, 将是非常危险的
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello 浩克!");

            //流的关闭放在这里比较保险
            //finally中的代码是一定会执行的, 即使try中出现了异常
            if(fis != null) {
                try {
                    //close()方法有异常, 采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("hello world");
    }
}
