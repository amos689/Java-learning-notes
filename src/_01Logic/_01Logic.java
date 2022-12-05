package _01Logic;

public class _01Logic {
    /*
    & 逻辑与 （两边都真是真）
    | 逻辑或 （两边都假是假）
    ! 逻辑非 （取反!true == false, !false == true）
    ^ 逻辑异或 （两边算子只要不一样，结果就是真）# 同正异负

    短路的运算结果除了在短路现象时其他运算结果都和逻辑相同
    && 短路与 （第一个表达式结果为false）
    || 短路或 （第一个表达式结果为true）
    # 逻辑运算符要求两边算子都是布尔类型，并且逻辑运算符最终运算结果也是布尔类型
     */
    public static void main(String[] args){
        //运算符优先级不确定时，加小括号
        System.out.println(5 > 3 & 5 > 2); //true
        System.out.println(5 > 3 & 5 > 6); //false
        System.out.println(5 > 3 | 5 > 6); //true
        // 逻辑与和短路与
        int x = 10;
        int y = 8;
        System.out.println(x < y & ++x < y); //false & false
        System.out.println(x); // 11 即 ++x 被执行了
        System.out.println(x < y && ++x < y); //false && false
        System.out.println(x); // 11 即 ++x 没有被执行，发生了短路现象
        // 短路现象指运算符的一边已经能得出该运算的结果，那么就不用再去算另一边的值
        // 短路与更加智能，执行效率较高，更常用
        // 但是当后面语句必须执行时，就必须用逻辑运算符
        
    }
}
