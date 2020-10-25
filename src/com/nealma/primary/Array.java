package com.nealma.primary;

import java.util.Arrays;

/**
 * 数组
 *
 * @author neal.ma
 * @date 2020/10/5
 * @blog nealma.com
 */
public class Array {
    public static void main(String[] args) {

        // 元素默认值

        char[] c = new char[5];
        System.out.println("字符 类型数组 默认值：");
        for(int item :  c){
            System.out.print( item + ",");
        }
        int[] i = new int[5];
        System.out.println("\n整数 类型数组 默认值：");
        for(int item :  i){
            System.out.print( item + ",");
        }
        double[] d = new double[5];
        System.out.println("\n浮点数 类型数组 默认值：");
        for(double item : d ){
            System.out.print(item + ",");
        }
        boolean[] b = new boolean[5];
        System.out.println("\n布尔 类型数组 默认值：");
        for(boolean item : b ){
            System.out.print(item + ",");
        }
        String[] s = new String[5];
        System.out.println("\n对象（字符串）类型数组 默认值：");
        for(String item : s ){
            System.out.print(item + ",");
        }

        // 以元素下标索引进行元素遍历， 下标以 0 开始，以 length - 1 结束，超出 长度范围会抛出异常

        System.out.println();
        // 创建一个长度为 3 的元素为int类型的数组，元素为默认值
        int[] score = new int[3];
        score[0] = 100;
        score[1] = 99;
        score[2] = 98;
//        score[3] = 97;
        for(int item : score ){
            System.out.print(item + ",");
        }
        System.out.println("\n第一个元素：" + score[0]);
        System.out.println("最后一个元素：" + score[2]);

        System.out.println();
        // 创建一个长度为 3 的元素为int类型的数组，元素为指定值
        score = new int[]{87, 98, 67};
//        score[3] = 97;
        for(int item : score ){
            System.out.print(item + ",");
        }
        System.out.println("\n第一个元素：" + score[0]);
        System.out.println("最后一个元素：" + score[2]);

        // deepToString 打印数组，对象数组或者二维及二维以上的数据
        int[][] arr = {
                {1,2},
                {3,4}
        };
        System.out.println("" + Arrays.deepToString(arr));
    }
}
