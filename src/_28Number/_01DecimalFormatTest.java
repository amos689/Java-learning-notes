package _28Number;

import java.text.DecimalFormat;

/*
    关于数字的格式化

 */
public class _01DecimalFormatTest {
    public static void main(String[] args) {
        //DecimalFormat是专门负责数字格式化的
        //和SimpleTimeFormat一样, 需要一个字符串的构造方法
        /*
            数字的格式有哪些:
                # 代表任意数字
                , 代表千分位
                . 代表小数点
                0 代表不够时补充0
         */
        //表示加入千位分隔符, 保留两位小数
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.56);
        System.out.println(s); //"1,234.56"
    }
}
