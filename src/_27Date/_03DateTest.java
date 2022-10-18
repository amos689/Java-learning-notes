package _27Date;

import java.util.Date;
import java.text.SimpleDateFormat;

/*
    通过毫秒构造Date对象
 */
public class _03DateTest {
    public static void main(String[] args) {
        //这个时间是1970/01/01 00:00:00 001
        Date time = new Date(1); //参数是一个毫秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        //格林尼治时间
        System.out.println(strTime); //1970-01-01 08:00:00 001 百京是东八区捏, 差半个小时

        //获取昨天此时的时间

        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime2 = sdf.format(time2);
        System.out.println(strTime2);
    }
}
