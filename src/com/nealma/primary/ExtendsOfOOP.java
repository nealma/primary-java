package com.nealma.primary;

/**
 * 面向对象: 继承
 *
 * @author neal.ma
 * @date 2020/10/7
 * @blog nealma.com
 */
public class ExtendsOfOOP {
    public static void main(String[] args) {

        int score = 90;

        if ( score > 90) {
            System.out.println("执行了");
        } else {
            System.out.println("没有执行");
        }

        // 从大到小顺序
        if (score > 90) {
            System.out.println("等级：A");
        } else if (score > 80) {
            System.out.println("等级：B");
        } else if (score > 60) {
            System.out.println("等级：C");
        } else {
            System.out.println("等级：D");
        }

        // 从小到大顺序
        if (score < 60) {
            System.out.println("等级：D");
        } else if (score < 80) {
            System.out.println("等级：C");
        } else if (score < 90) {
            System.out.println("等级：B");
        } else {
            System.out.println("等级：A");
        }

        // 注意边界值

        // 引用类型 判断相等

        String s1 = new String("a");
        String s2 = new String("a");

        // 判断的引用是内存地址
        System.out.println("s1 == s2 " + s1 == s2);

        // 内容相等
        System.out.println("s1.equals(s2) " + s1.equals(s2));

        String str = null;

        // 把 已知赋值的变量放在前面
         if ("OK".equals(str)) {

         }

         // NullPointerException
         if (str.equals("OK")) {

         }

    }
}
