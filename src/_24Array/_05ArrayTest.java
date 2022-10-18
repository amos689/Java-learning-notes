package _24Array;

/*
    模拟一个系统, 假设这个系统要使用, 必须要输入用户名和密码, 没有用户名和密码不能运行
 */
public class _05ArrayTest {
    //用户名和密码输入到String[] args 数组当中
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("使用该系统时请输入程序参数, 参数中包含用户名和密码, 以空格分开");
            return;
        }
        System.out.println("程序执行成功!");
        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];

        //假设用户名是admin, 密码是123的时候表示登陆成功
        //如果用if(username.equals("admin") && password.equals("123")){}这种不好
        //因为无法避免空指针异常
        //正确做法如下:
        if("admin".equals(username) && "123".equals(password)) {
            System.out.println("登陆成功!");
        } else {
            System.out.println("登录失败");
        }
    }
    //至此, 恭喜你能完全看懂了HelloWorld程序...
}
