package com.nealma.primary;

// 单行注释
/*
 * 多行注释
 */

// 类（Class） 包含一切
// 成员（member）
// 成员属性
// 成员方法
// 访问修饰符（public、private）
// static 不需要实例化就能访问到类型的成员

public class MyFirstJavaProgram { // 类名，必须跟java文件名保持一致

    // 类的构造函数

    public MyFirstJavaProgram (){

    }

    // 成员属性 （property），存储事物的特征（has something）
    // 变量名 name （variable）

    private String name;

    // 成员方法 事物的动作行为 (do something)

    // 参数 who （parameter）

    public static String say(String who){
        return who +", Good morning.";
    }

    // arguments
    public static void main(String[] args) {
        System.out.println(say(args[0]));

    }
}
