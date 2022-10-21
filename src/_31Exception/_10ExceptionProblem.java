package _31Exception;

/*
    finally面试题
    运行结果: 100, hello
 */
public class _10ExceptionProblem {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result); //100
    }

    /*
        Java语法规则(有一些规则不能被破坏)
            有这样的规则:
                方法体中的代码必须遵守自上而下的顺序依次逐行执行(亘古不变的语法)
            还有一条规则:
                return一旦执行, 整个方法必须结束(亘古不变的语法)
     */
    public static int m() {
        int i = 100;
        try {
            //这行代码出现在int i = 100;的下面, 所以最终结果必须返回100
            //但是也会执行hello, 证明return一定是最后执行的
            /*
                其实这里反编译的底层是
                int i = 100;
                int j = i;
                i++;
                System.out.println("hello")
                return j; //返回的是j, 不违背从上到下依次执行的规则
                虽然诡异, 但是用心良苦.
             */
            return i;
        } finally {
            i++; //i不赋初值的情况下, 不能用++
            System.out.println("hello");
        }
    }
}
