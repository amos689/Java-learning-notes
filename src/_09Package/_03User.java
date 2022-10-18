package _09Package;
/*
    封装的步骤：
        1.所有步骤私有化，使用private关键字进行修饰，private表示私有的，修饰的所有数据
          只能在本类中访问
        2.对外提供简单的操作入口，也就是说，以后外部程序想要访问age属性，必须要通过这些简单的入口
          进行访问【get和set方法】，想读取age属性用get方法，想修改age数据用set方法
        3.set方法的命名规范：
            public void setAge(int a) {
                age = a;
            }
        4.get方法的命名规范：
            public int getAge() {
                return age;
            }
 */

/*
    背会以下内容：
       setter and getter方法没有static关键字
       有static关键字的方法怎么调用：类名.方法名(实参);
       没有static关键字的方法怎么调用：引用.方法名(实参);
 */
//set和get方法自动生成快捷键：alt + ins
public class _03User {
    private int age;
    //set方法没有返回值，因为set方法只负责修改数据
    public void setAge(int age){
        //不能用age = age;来试图赋值，因为Java有就近原则，所以并没有给age赋值
        //要用this.age = age;赋值
        //在这里可以编写业务逻辑代码进行安全控制
        if(age < 0 || age > 150) {
            System.out.println("年龄不合法!");
            return;
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
