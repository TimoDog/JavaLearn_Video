package cn.itcast.day04.demo02;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/3/9 21:56
 */
public class Demo01Mehtod {

    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
