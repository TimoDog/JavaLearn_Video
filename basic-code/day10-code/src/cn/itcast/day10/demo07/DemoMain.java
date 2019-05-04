package cn.itcast.day10.demo07;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/4 20:56
 */
public class DemoMain {

    public static void main(String[] args) {
        // 首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        // 准备一个鼠标供电脑使用
//        Mouse mouse = new Mouse();
        // 首先进行向上转型
        USB usbMouse = new Mouse();
        // 参数是USB类型，正好传递进去的是USB鼠标
        computer.useDevice(usbMouse);

        // 创建一个USB键盘
        // 没有使用多态写法
        Keyboard keyboard = new Keyboard();
        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard); // 正确写法！这里也发生了向上转型

        computer.powerOff();

    }

}
