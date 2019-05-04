package cn.itcast.day10.demo03;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/4 14:40
 */
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("AAA");
    }


}
