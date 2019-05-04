package cn.itcast.day10.demo01;

/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/5/3 21:51
 */

/**
 * 接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰
 * 从效果上看，其实就是接口的【常量】。
 * 格式：
 * public static final 数据类型 常量名称 = 数据值；
 * 备注：
 * 一旦使用final关键字修饰，说明不可改变。
 *
 * 注意事项：
 * 1. 接口当中的常量，可以省略public static final，注意：不写也照样是这样。
 * 2. 接口中的常量必须进行赋值；
 * 3. 接口中常量的名称，使用完全大写的字母，用下划线进行分隔。（推荐明明规则）
 * */
public interface MyInterfaceConst {

    //这就是一个常量，一旦赋值，不可修改
    public static final int NUM_OF_MY_CLASS = 10;

}
