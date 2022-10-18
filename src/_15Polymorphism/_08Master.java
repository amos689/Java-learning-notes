package _15Polymorphism;
/*
    public class _08Master {
        //主人喂宠物
        public void feed(_07Cat c) {
            c.eat();
        }
        public void feed(_09Dog d) {
        d.eat();
    }
    }
    这种方式没有使用Java语言中的多态机制, 存在机制缺点: Master的扩展能力差, 只要加一个
    新宠物, Master就要加入一个新的方法
    Master和cat, dog的关联程度很强, 耦合度很高, 扩展力差
*/

//提高程序的扩展力, 就要降低程序的耦合度[解耦合]
public class _08Master {
    //Muster面向的不应该是Cat/Dog, 应该是Pet
    //提倡面向抽象编程, 不要面向具体编程
    //面向抽象编程的好处是: 耦合度低, 扩展力强
    public void feed(_10Pet pet) { //_10Pet pet是一个父类型的引用
        pet.eat();
    }
}
