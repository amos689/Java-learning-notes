public class _03ProcessControl {
    public static void main(String[] args) {
        //接收用户键盘输入
        /*
            1、接收输入：年龄【数字】
            2、根据需求进行逻辑判断
         */
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入年龄:");
        int age = s.nextInt();
        System.out.println("age = " + age);
        String str = "老年";
        if (age < 0 || age > 150) {
            str = "不合法";
        } else if (age <= 5) {
            str = "幼儿";
        } else if (age <= 10) {
            str = "少年";
        } else if (age <= 18) {
            str = "青少年";
        } else if (age <= 35) {
            str = "青年";
        } else if (age <= 55) {
            str = "中年";
        }
        System.out.println("您属于" + str);
        int sum = 0;
        a:for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                sum += i * j;
                if (sum > 15) {
                    break a; // 直接终止指定的a循环
                }
            }
        }
        System.out.println(sum);
    }

}
