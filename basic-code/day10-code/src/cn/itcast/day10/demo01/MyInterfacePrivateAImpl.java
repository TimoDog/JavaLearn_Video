package cn.itcast.day10.demo01;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/3 21:40
 */
public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {


    public void methodAnother() {

        //直接访问到了接口中的默认方法，这样是错误的
 //       methodCommon();
    }
}
