package cn.itcast.day04.demo02;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/3/11 9:25
 */
/**
 * 题目要求：定义一个方法，用来求出两个数字之和。
 * 题目变形：定义一个方法，用来打印两个数字之和。
 * */
public class Demo04MethodReturn {

    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("返回值是：" + num);
        System.out.println("===============");

        printSum(100, 200);
        System.out.println("===============");

        System.out.println(getSum(2, 3));
        getSum(3, 5);
        System.out.println("===============");

    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }

}
