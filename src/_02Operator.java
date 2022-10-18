public class _02Operator {
    public static void main(String[] args) {
        System.out.println(2 << 2);
        /*
            1、赋值运算符
                赋值类运算符包括两种：基本赋值运算符和扩展的赋值运算符
                    基本：=
                    扩展：+= -= *= /= %=
                先运算等号右边，将结果赋值给左边
         */
        int i = 10;
        System.out.println(i);
        i += 5;
        System.out.println(i);
        i *= 2;
        System.out.println(i);
        i %= 5;
        System.out.println(i);

        //-------------------------------
        // 10和15都没有超过byte范围
        byte b = 10;
        //b = b + 5;但是这句话会报错，因为两个数据类型不一样
        // 大容量向小容量转换要加强制转换符
        //b += 5; // 这就没有错，可见其与b = b + 5不完全相等
        //相反其等于以下：
        b = (byte) (b + 5);
        System.out.println(b);
        byte z = 0;
        z += 128;
        //扩展类的运算符不改变运算结果类型
        System.out.println(z);//-128，损失精度
        /*
            "+"运算符在Java中的两个作用
                1、求和：两边都是数字时
                2、字符串的连接：两边的数据有一个是字符串时就是连接，连接后依然是字符串
                    数字 + 数字 = 数字
                    数字 + "字符串" = "字符串"
                3、在一个表达式中可以出现多个加号，没有小括号默认从左向右
         */
        int a = 10;
        int k = 20;
        System.out.println("10 + 20 = " + (a + k));// 不能动态输出a和k的值
        System.out.println(a + "+" + k + "=" + (a + k));
        System.out.println(10 + "20");//println会把数字变成字符
        /*
            引用类型String
            String是SUN在JavaSE中提供的字符串类型
            String.class字节码文件
         */
        String s = "abc";//s是变量名，"abc"是字面值
        System.out.println(s);
        /*
            三目运算符
                1、语法规则：
                    布尔表达式 ? 表达式1（表达式正确） : 表达式2（表达式错误）
                2、三目运算符的执行原理：
                    当bool表达式结果是true时，选择表达式1
                    当bool表达式结果是false是，选择表达式2
         */
        boolean sex = false;
        char gen = sex ? 'B' : 'G'; //注意必须是单引号，因为对应的是char
        System.out.println(gen);
        System.out.println(sex ? "nan" : "nv");
        
    }
}
