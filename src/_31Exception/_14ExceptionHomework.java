package _31Exception;

public class _14ExceptionHomework {
    public static void main(String[] args) {
        Stack st = new Stack();
        for(int i = 0; i < st.sum + 1; i++) {
            try {
                st.push(new Object());
            } catch (MyStackOperationException e){
                e.printStackTrace();
            }
        }
        System.out.println("============");
        for(int i = 0; i < st.sum + 1; i++) {
            try {
                st.pop();
            } catch (MyStackOperationException e) {
                e.printStackTrace();
            }
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

    public void push(Object obj) throws MyStackOperationException {
        if(objs[objs.length - 1] != null) {
            /*
                //创建异常对象
                MyStackOperationException e = new MyStackOperationException("栈已满, 压栈失败");
                //手动抛出, 因为是编译时异常, 那么必须要对异常进行处理
                throw e;
            */

            //合并写法
            throw new MyStackOperationException("栈已满, 压栈失败");
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

    public void pop() throws MyStackOperationException {
        if(objs[0] == null) {
            throw new MyStackOperationException("弹栈失败, 栈已空");
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

class MyStackOperationException extends Exception {

    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}
