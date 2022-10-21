package _31Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    深入try...catch
        1.catch后面的小括号的异常类型, 可以是具体的异常类型, 也可以是该类型的父类型
        2.catch可以写多个, 建议catch的时候精确的一个一个处理, 这样有利于程序的调试
          但是如果异常涉及父类子类, 则子类必须写在父类上面, 不然会报错, 也不符合计算机和人类的逻辑
        3.如果希望异常被调用者处理, 那么就用throws, 其他用try...catch
 */
public class _05Exception {
    public static void main(String[] args) {
        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\Tencent");
            System.out.println("出现异常, 这里无法执行");
            //读入文件
            fis.read();
        } catch (FileNotFoundException e) { //由于多态机制: 可以写FileNotFoundException, 也可以写它的父类: IOException, 或者更高级父类: Exception
            System.out.println("文件不存在");
        } catch(IOException e) { //IOException必须写在FileNotFoundException下面
            System.out.println("输入流错误");
        }
        //即便发生异常, 以下程序依旧正执行, 反映到项目上就是系统不会宕机
        System.out.println("Hello world!");
    }
}
