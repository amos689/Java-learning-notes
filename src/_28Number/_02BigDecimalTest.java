package _28Number;

import java.math.BigDecimal;

/*
    1.BigDecimal属于大数据, 精度极高, 不属于基本数据类型, 属于Java对象(引用数据类型)
      专门出现在财务软件当中

    2.财务软件中double是不够用的, 处理财务类型用BigDecimal类型
 */
public class _02BigDecimalTest {
    public static void main(String[] args) {
        //这个100, 不是普通的100, 精度极高
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);

        //求和, v1和v2都是引用, 不能直接"+"
        BigDecimal v3 = v1.add(v2);
        System.out.println();
    }
}
