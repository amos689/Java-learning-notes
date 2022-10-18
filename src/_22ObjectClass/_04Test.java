package _22ObjectClass;

//String对象在比较的时候必须要使用equals方法
public class _04Test {
    public static void main(String[] args) {
        Student s1 = new Student(11, "CN");
        Student s2 = new Student(11, "CN");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
    }
}

class Student {
    //学号
    int no;
    //所在学校
    String school; //引用数据类型比较时使用equals方法

    public Student() {
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    //重写toString方法
    public String toString() {
        return "学号: " + no + ", 学校: " + school;
    }
    //重写equals方法
    //需求: 学校相等, 学号相同时, 表示同一个学生
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student)) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        Student s = (Student)obj;
        if(this.no == s.no && this.school.equals(s.school)) {
            //注意对于字符串一定要用equals! ! ! ! ! !
            //"=="比较普通创建的字符串可能没关系, 但是比较new创建的String对象就必错
            return true;
        }
        return false;
    }
}