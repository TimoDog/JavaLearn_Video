package cn.itcast.day09.demo12;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/4/29 21:51
 */
public class Zi extends Fu {

    public Zi() {
        // super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
