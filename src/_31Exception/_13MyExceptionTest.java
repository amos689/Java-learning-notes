package _31Exception;

public class _13MyExceptionTest {
    public static void main(String[] args) {
        _12MyException e = new _12MyException("用户名不能为空");

        //获取异常堆栈信息
        e.printStackTrace();

        //获取异常的简单描述信息
        System.out.println(e.getMessage());
    }
}
