package cn.itcast.day10.demo02;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/4 14:33
 */
public interface MyInterface {

    public default void method(){

        System.out.println("接口的默认方法");

    }

}
