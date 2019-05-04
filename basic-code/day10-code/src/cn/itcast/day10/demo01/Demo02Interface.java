package cn.itcast.day10.demo01;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/3 21:09
 */

/**
 * 1. 接口的默认方法，可以通过接口实现类对象，直接调用。
 * 2. 接口的默认方法，也可以被接口实现类进行覆盖重写。
 * */
public class Demo02Interface {

    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); // 调用抽象方法，实际运行的是右侧实现类

        //调用默认方法，如果实现方法中没有，就会向上查找默认方法
        a.methodDefault(); //这是新添加的默认方法！
        System.out.println("===================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault(); //实现类B覆盖重写了接口的默认方法！
    }
}
