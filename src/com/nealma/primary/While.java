package com.nealma.primary;

import java.lang.management.ManagementFactory;

/**
 * 循环 while
 *
 * @author neal.ma
 * @date 2020/10/7
 * @blog nealma.com
 */
public class While {
    public static void main(String[] args) {

        // 进程号
        final long pid = ManagementFactory.getRuntimeMXBean().getPid();

        // while
        // -128 ~ 127
        byte counter = 10;
        while (counter > 0) {
            counter++;
            System.out.println("counter: " + counter + ", 执行 while 循环");
        }
        System.out.println("结束 while 循环");

        // do while
        // counter = -127
        do {
            // 至少执行一次循环
            System.out.println("do while 至少执行一次循环");
            System.out.println("pid: " + pid);
        } while (counter < 0);

    }
}