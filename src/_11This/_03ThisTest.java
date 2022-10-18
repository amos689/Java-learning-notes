package _11This;

public class _03ThisTest {
    int i = 10;

    public static void main(String[] args) {
        //System.out.println(i); 错, 实例变量i要用引用.
        //System.out.println(this.i); 错, 类名调用的方法中没有当前对象
        //想访问的话
        _03ThisTest tt = new _03ThisTest();
        System.out.println(tt.i);
    }
}
