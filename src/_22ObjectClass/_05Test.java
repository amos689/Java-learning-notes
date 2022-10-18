package _22ObjectClass;

public class _05Test {
    public static void main(String[] args) {
        User u1 = new User("zhangsan", new Address("郑州", "二七区", "111"));
        User u2 = new User("zhangsan", new Address("郑州", "二七区", "111"));
        System.out.println(u1.equals(u2)); //true
    }
}

class User {
    //用户名
    String name;
    //用户住址
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }
    //重写equals方法, 当一个用户的用户名和家庭住址都相同时, 表示同一个用户
    //这个equals判断的是User对象和User对象是否相等
    public boolean equals(Object obj) {
        //用户名和住址分别相同, 认定是同一个用户
        if(obj == null || !(obj instanceof User)) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        User u = (User)obj;
        return this.name.equals(u.name) && this.addr.equals(u.addr);
    }
}

class Address {
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    // 注意: 这里并没有重写equals方法.
    // 这里的equals方法判断的是: Address对象和Address对象是否相等
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Address)) {
            return false;
        }
        if(this == obj){
            return true;
        }
        Address addr = (Address)obj;
        return this.city.equals(addr.city) && this.street.equals(addr.street) && this.zipcode.equals(addr.zipcode);
    }
}