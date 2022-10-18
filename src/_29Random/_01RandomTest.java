package _29Random;

import java.util.Random;

/*
    随机数
 */
public class _01RandomTest {
    public static void main(String[] args) {
        //创建随机数对象
        Random rand = new Random();

        //随机产生一个int类型取值范围内的数字
        int num1 = rand.nextInt();
        System.out.println(num1);

        //产生0到100间的随机数
        int num2 = rand.nextInt(0, 101); //注意是前开后闭
        System.out.println(num2);
    }
}
