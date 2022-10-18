public class _08OO04 {
    public static void main(String[] args) {
        //创建_08OO03对象
        //u是一个局部变量，是一个引用，是一个保存内存地址指向堆内存的_08OO03对象
        _08OO03 u = new _08OO03();

        //输出_08OO03对象内部实例变量的值
        System.out.println(u.num); //0
        System.out.println(u.name); //null
        System.out.println(u.addr); //null

        //修改_08OO03对象内部实例变量的值
        u.num = 110;
        //String特殊，不用new
        u.name = "jack"; //Jack是一个java对象，属于String对象
        u.addr = new _08OO02(); //new创建一个_08OO02堆内存
        /*
            也可以这样写
            _08OO02 a = new _08OO02();
            u.addr = a;
         */

        //查看addr中内部实例变量的值
        System.out.println(u.name + "居住在" + u.addr.city + "城市"); //null
        System.out.println(u.name + "居住在" + u.addr.street + "街道"); //null
        System.out.println(u.name + "邮编是" + u.addr.zipcode); //null
        //赋值查看
        u.addr.city = "百京";
        u.addr.street = "昌平";
        u.addr.zipcode = "111111";
        System.out.println(u.name + "居住在" + u.addr.city + "城市"); //null
        System.out.println(u.name + "居住在" + u.addr.street + "街道"); //null
        System.out.println(u.name + "邮编是" + u.addr.zipcode); //null
    }
}
