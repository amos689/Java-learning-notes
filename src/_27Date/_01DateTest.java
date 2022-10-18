package _27Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Java中对日期的处理, 因为不是java.lang包下的, 所以必须导包
    String和Date之间通过SimpleDateFormat相连
        String --SimpleDateFormat.parse(String)--> Date
        Date --SimpleDateFormat.format(Date)--> String
 */
public class _01DateTest {
    public static void main(String[] args) throws Exception {
        //获取系统当前时间(精确到毫秒)
        //直接调用无参数构造方法
        Date nowTime = new Date(); //alt + enter
        //java.util.Date类的toString()方法已经重写了
        //输出的不是对象的地址, 而是一个日期字符串
        //Tue Oct 18 13:27:09 CST 2022
        System.out.println(nowTime);

        //日期可以被格式化(Date --转化成有一定格式的日期字符串--> String)
        //SimpleDateFormat是java.text包下的, 专门负责日期格式化的
        /*
            字母的个数通过你想显示的位数决定
            月, 时, 星期大写(月食星)
            yyyy 年(年是4位)
            MM 月(月是两位)
            dd 日
            EEE 星期
            HH 时
            mm 分
            ss 秒
            SSS 毫秒
            除了JDK设定的有意义的字母之外, 其他的符号格式自己随意组织
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, EEE, HH:mm:ss");
        String now = sdf.format(nowTime);
        System.out.println(now);

        //假设现在有一个日期字符串String, 怎么转换成Date类型呢
        String time = "1970-1-1 00:00:00 000";
        //这里格式不能随便写, 要与日期字符串格式相同, 否则出现java.text.ParseException解析异常
        //注意: 字符串的日期格式一定要和SimpleDateFormat对象指定的日期格式一致
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time); //其实上面可以不用new SimpleDateFormat
        System.out.println(dateTime);
    }
}
