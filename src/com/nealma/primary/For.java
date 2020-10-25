package com.nealma.primary;

import java.lang.management.ManagementFactory;

/**
 * 循环 for
 *
 * @author neal.ma
 * @date 2020/10/7
 * @blog nealma.com
 */
public class For {
    public static void main(String[] args) {

        // 1 初始化放在 for 内部
        for (int i=0, j=0; i + j < 100; i++, j++ ) {
            System.out.println("i=" + i + " j=" + j + ", 执行 for 循环");
        }

        // 2 初始化放在 for 外部（不推荐）
        int i=0, j=0;
        for ( i=0, j=0; i + j < 100; i++, j++ ) {
            System.out.println("i=" + i + " j=" + j + ", 执行 for 循环");
        }
        System.out.println("最终结果 i=" + i + " j=" + j );

        // 遍历集合
        int[] array = {1, 2, 3, 4};
        for (int item : array) {
            System.out.println("item: " + item);
        }

        // 死循环 与 while(true) 一样的效果
        byte counter = 10;
        for (;;) {

            // 继续下一次循环
            if (counter == 10) {
                counter++;
                continue;
            }

            System.out.println("counter: " + counter + ", 执行 for 循环");
            // 终止循环
            break;
        }

    }
}