package _24Array;

/*
    使用一维数组模拟栈数据结构
        1.这个栈中可以存放Java中任何引用类型数据
        2.在栈中提供push方法模拟压栈(满栈要进行提示)
        3.在栈中提供pop方法模拟弹栈(栈空了要进行提示)
        4.编写测试程序, new栈对象, 调用push和pop方法来模拟压栈和弹栈
 */
public class _12Homework {
    public static void main(String[] args) {
        Stack st = new Stack();
        for(int i = 0; i < st.sum + 2; i++) {
            st.push(new Object());
        }
        System.out.println("============");
        for(int i = 0; i < st.sum + 2; i++) {
            st.pop();
        }
    }
}

class Stack{
    private Object[] objs;
    //满栈只能有20个变量, 栈帧永远指向最后一个变量
    private int sf;
    final int sum = 20;

    /*
        不提供有参数构造方法, 使用默认数组长度为20
        public Stack(Object[] objs) {
            this.objs = objs;
        }
    */

    public Stack() {
        //默认创建一个长度为一个默认栈帧总长度的Object数组
        objs = new Object[sum];
    }

    public Object[] getObjs() {
        return objs;
    }

    public int getSf() {
        return sf;
    }

    public void setSf(int sf) {
        this.sf = sf;
    }

    public void setObjs(Object[] objs) {
        this.objs = objs;
    }

    public void push(Object obj) {
        if(objs[objs.length - 1] != null) {
            System.out.println("栈已满, 压栈失败");
            return;
        }
        for(int i = 0; i < objs.length; i++) {
            if(objs[i] == null) {
                objs[i] = obj;
                sf = i;
                System.out.println("压栈成功, 栈帧指向第" + (sf + 1) + "个元素");
                return;
            }
        }
    }

    public void pop() {
        if(objs[0] == null) {
            System.out.println("弹栈失败, 栈已经为空");
            return;
        }
        for(int i = objs.length - 1; i >= 0; i--) {
            if(objs[i] != null) {
                objs[i] = null;
                sf = i-1;
                System.out.println("弹栈成功, 栈帧指向第" + (sf + 1) + "个元素");
                return;
            }
        }
    }
}
