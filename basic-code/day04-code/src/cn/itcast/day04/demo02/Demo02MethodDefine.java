package cn.itcast.day04.demo02;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/3/10 21:06
 */
/**
方法其实就是若干语句的功能集合
 参数：进入方法的数据；
 返回值：从方法中出来的数据；

 定义方法的完整格式：
 修饰符 返回值类型 方法名称（参数类型 参数名称，....) {
 方法体
 return 返回值；
 }
*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10, 20);
        System.out.println("===========");

        //打印调用
        System.out.println(sum(10, 20));
        System.out.println("===========");

        //赋值调用
        int number = sum(15, 25);
        System.out.println("变量的值：" + number);
    }

    public static int sum(int a, int b) {
        System.out.println("方法执行啦！");
        int result = a + b;
        return result;
    }
}
