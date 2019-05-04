package cn.itcast.day10.demo02;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/4 14:12
 */
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("默认方法AAA");
    }

}
