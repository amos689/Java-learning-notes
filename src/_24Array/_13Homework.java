package _24Array;

/* 致命问题: 断电就寄! */
/*
    为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
	1、该系统的用户是：酒店前台。
	2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
	3、酒店中的每一个房间应该是一个java对象：Room
	4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
	5、系统应该对外提供的功能：
		可以预定房间：用户输入房间编号，订房。
		可以退房：用户输入房间编号，退房。
		可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
 */
public class _13Homework {
    public static void main(String[] args) {
        //编写测试程序
        Hotel ht = new Hotel();
        /*
            首先输出欢迎界面
         */
        System.out.println("Welcome to hotel management system, please read our guidance.");
        System.out.println("[1] to check rooms, [2] to order, [3] to check out, [0] to check out.");
        java.util.Scanner s = new java.util.Scanner(System.in);
        //加入死循环, 0才能退出
        while (true) {
            System.out.println("请输入功能编号对应功能: ");
            int input = s.nextInt();
            if (input == 1) {
                //查看列表
                ht.print();
            } else if (input == 2) {
                //订房
                System.out.println("请输入预订的房间编号: ");
                int roomNum = s.nextInt();
                ht.order(roomNum);
            } else if (input == 3) {
                //退房
                System.out.println("请输入退房的房间编号: ");
                int roomNum = s.nextInt();
                ht.checkOut(roomNum);
            } else if (input == 0) {
                //退出
                System.out.println("Goodbye! ");
                return;
            } else {
                //错误
                System.out.println("Error, input again.");
            }
        }
    }
}

//酒店对象: 酒店中有二维数组, 二维数组模拟大厦
class Hotel {
    //二维数组, 模拟大厦中所有的房间
    private Room[][] rooms;

    //盖楼通过构造方法
    public Hotel() {
        //几层, 每层的类型, 每层房间编号, 可以写死
        //假如三层, 一层单人间, 二层标间, 三层总统套房
        rooms = new Room[3][10]; //三层楼, 每层十个房间(这里只是相当于有建筑的蓝图, 并没有建起来)
        //创建30个Room对象, 放到数组当中去, 遍历二维数组
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "Single room", true);
                }
                if (i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "Standard room", true);
                }
                if (i == 2) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "President room", true);
                }
            }
        }
    }

    //在酒店对象上提供一个打印房间列表的方法
    public void print() {
        //打印所有房间状态, 就是遍历二维数组
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.println(rooms[i][j]);
                System.out.println("=================");
            }
        }
    }

    //订房方法(需要传递一个房间编号)
    public void order(int roomNum) {
        //订房最主要的是将房间对象的status修改为false
        //假设207(rooms[1][6])
        rooms[roomNum / 100 - 1][roomNum % 100 - 1].setStatus(false);
        System.out.println("订房成功! ");
    }

    //退房方法(需要传递一个房间编号)
    public void checkOut(int roomNum) {
        //订房最主要的是将房间对象的status修改为true
        rooms[roomNum / 100 - 1][roomNum % 100 - 1].setStatus(true);
        System.out.println("退房成功! ");
    }
}

//房间信息
//查看某个类的属性和方法: ctrl + F12
class Room {
    /*
        定义房间编号(1 2 3楼 101...), 类型(标间, 单间...), 状态(是否空闲)
     */
    private int num;
    private String type;
    private boolean status;

    //构造方法
    public Room() {
    }

    public Room(int rum, String type, boolean status) {
        this.num = rum;
        this.type = type;
        this.status = status;
    }

    //set/get方法
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //IDEA对于布尔类型的变量生成的get方法名字是is, 不喜欢可以修改
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals方法重写, 比较内容, 房间号为主码, 相同即可判定相同
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Room r = (Room) obj;
        return this.getNum() == r.getNum();
    }

    //toString方法重写, 返回房间信息, 力求简单明了
    public String toString() {

        return "[" + this.getNum() + ", " + this.getType() + ", " + (this.isStatus() ? "空闲" : "占用") + "]";

    }
}