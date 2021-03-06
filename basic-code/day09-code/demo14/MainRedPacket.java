package cn.itcast.day09.demo14;

import java.util.ArrayList;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/1 21:01
 */
public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=====================");

        // 群主总共发20块钱，分成3个红包
        ArrayList<Integer> redList = manager.send(20, 3);
        // 三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show(); // 100 - 20 = 80
        // 6、6、8，随机分给三个人
        one.show();
        two.show();
        three.show();
    }

}
