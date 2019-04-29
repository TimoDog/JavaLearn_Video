package demo11;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/4/29 21:35
 */

/**
 * 抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
 * 抽象类：抽象方法所在的类必须是一个抽象类。在class前写上abstract即可。
 *
 * 如何使用抽象类和抽象方法：
 * 1. 不能直接创建new抽象类对象；
 * 2. 必须用一个子类来继承抽象父类；
 * 3. 子类必须覆盖重写抽象父类中的所有抽象方法；
 * 4. 创建子类对象进行使用；
 * */

public abstract class Animal {

    // 这是一个抽象方法，代表吃东西，但是具体吃什么（大括号中的内容）不确定。
    public abstract void eat();

    // 这是普通的成员方法
    public void normalMethod() {

    }

}
