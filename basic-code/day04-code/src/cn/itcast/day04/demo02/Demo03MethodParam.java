package cn.itcast.day04.demo02;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/3/10 22:18
 */
public class Demo03MethodParam {

    public static void main(String[] args) {
        method1(10, 20);
        System.out.println("=================");
        method2();
    }

    //例如打印输出固定10次文本字符串
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, world!" + i);
        }
    }

    //两个数字相乘，做乘法，必须知道两个数字各自是多少，否则无法进行计算
    //有参数
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }
}
