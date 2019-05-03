package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/1 20:54
 */

// 普通成员
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包中随便抽取一个，给自己
        // 随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合中删除，并且得到被删除的红包给我自己
        int delta = list.remove(index);
        // 当前成员自己本来有多少钱：
        int money = super.getMoney();
        // 加法，并且重新设置回去
        super.setMoney(money + delta);
    }
}
