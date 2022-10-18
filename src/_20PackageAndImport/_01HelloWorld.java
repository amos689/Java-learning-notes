package _20PackageAndImport;

/*
    关于Java中的package和import机制
        1.为什么要使用package
            package是Java中的包机制. 包机制的作用就是为了方便程序的管理
            不同的类分别存放在不同包下(按照功能划分, 不同的软件包有不同的功能)
        2.package怎么用
            package是一个关键字, 后面加包名: package _19Interface
            注意: 这个语句只能出现在Java源码的第一行
        3.包名命名规范: 一般采用公司域名倒序(因为有全球唯一性)
            公司域名倒序 + 项目名 + 模块名 + 功能名
        4.对于带有package的Java程序应该怎么编译, 怎么运行
            编译:
                * 采用javac编译, java运行的方式行不通, 需要javac -d . HelloWorld.java
                * javac: 编译的命令; -d: 带包编译; .: 表示编译之后生成的东西放到当前目录; HelloWorld.java: 表示被编译的文件名
                *
            运行:
                运行: java _20PackageAndImport.HelloWorld
        5.关于import的使用:
            import什么时候使用: A类中使用B类, A类和B类在同一个包下, 不需要import, A类和B类不在同一个包下, 需要import
            import怎么用: * import只能出现在package语句之下和class语句之上
                         * import语句还能采用"import*"的形式, 如import _11This.*
                           来把这个包下的所有class文件全部导入
 */
public class _01HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world.");
    }
}
