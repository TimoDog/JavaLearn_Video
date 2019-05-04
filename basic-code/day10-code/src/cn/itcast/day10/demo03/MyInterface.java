package cn.itcast.day10.demo03;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/4 14:41
 */

/**
 * 这个子接口中有四个方法：
 * methodA 来源于接口A
 * methodB 来源于接口B
 * methodCommon 同时来源于接口A和B
 * method 来源于自己
 * */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
