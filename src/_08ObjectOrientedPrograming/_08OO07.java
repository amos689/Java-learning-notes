package _08ObjectOrientedPrograming;

import _08ObjectOrientedPrograming._08OO05Husband;
import _08ObjectOrientedPrograming._08OO06Wife;

public class _08OO07 {
    public static void main(String[] args) {
        //创建一个丈夫对象
        _08OO05Husband hus = new _08OO05Husband();
        hus.name = "小明";
        //创建一个妻子对象
        _08OO06Wife wif = new _08OO06Wife();
        wif.name = "小红";
        //结婚
        hus.w = wif;
        wif.h = hus;
        //输出
        System.out.println(hus.name + "的妻子是" + hus.w.name);
        System.out.println(wif.name + "的丈夫是" + wif.h.name);
        /*
            空指针异常：java.lang.NullPointerError
            空指针访问实例相关的数据一定会出现空指针异常，编译能过，运行报异常
            实例相关的数据表示数据访问时必须有对象参与
            hus = null;
            System.out.println(hus.name);
         */
    }
}
