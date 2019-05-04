package cn.itcast.day10.demo01;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/3 21:31
 */

public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
