package _26WrapperClass;

/*
    Integer类中的常用方法

 */
public class _06IntegerTest {
    public static void main(String[] args) {
        //自动装箱
        int a = 12;
        Integer b = a;
        System.out.println(b);

        // 手动装箱(已弃用)
        //Integer x = new Integer(1000);
        Integer x = 1000;

        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

        //编译的时候没问题, 符合Java语法, 但是运行时会报错
        //不是一个数组不能包装成Integer
        //报错: java.lang.NumberFormatException(数字格式化异常)
        //Integer a = new Integer("中文");

        /*
            public static int parseInt(String s)静态方法, 字符串转换成int
            * Parses the string argument as a signed decimal integer.
              The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value or an ASCII plus sign '+' ('\u002B') to indicate a positive value.
            * Parameters: s - a String containing the int representation to be parsed
            * Returns: the integer value represented by the argument in decimal.
            * Throws: NumberFormatException - if the string does not contain a parsable integer.
         */
        int retValue = Integer.parseInt("123");
        System.out.println(retValue); //123
        System.out.println(retValue + 100);
        //照葫芦画瓢: double retValue = Double.parseDouble("123.0");

        /*
            String, int, Integer相互转化: valueOf
            public static Integer valueOf(int i) int转化为Integer

            public static Integer valueOf(String s) String转化为Integer
         */
    }
}
