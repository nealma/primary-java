package com.nealma.primary;

import java.util.Date;

/**
 * 基本数据类型
 *
 * @author neal.ma
 * @date 2020/9/28
 * @blog nealma.com
 */
public class PrimaryDataType {

    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    char aChar;
    boolean aBoolean;
    String aString;

    @Override
    public String toString() {
        return "PrimaryDataType{" + "\n" +
                "aByte=" + aByte + " " + Byte.MIN_VALUE + "-" + Byte.MAX_VALUE + "\n" +
                ", aShort=" + aShort + " " + Short.MIN_VALUE + "-" + Short.MAX_VALUE + "\n" +
                ", anInt=" + anInt + " " + Integer.MIN_VALUE + "-" + Integer.MAX_VALUE + "\n" +
                ", aLong=" + aLong + " " + Long.MIN_VALUE + "-" + Long.MAX_VALUE + "\n" +
                ", aFloat=" + aFloat + " " + Float.MIN_VALUE + "-" + Float.MAX_VALUE + "\n" +
                ", doubleVar=" + aDouble + " " + Double.MIN_VALUE + "-" + Double.MAX_VALUE + "\n" +
                ", aChar=" + (Character.MIN_VALUE == aChar) + " " + Character.MIN_VALUE + "-" + Character.MAX_VALUE + "\n" +
                ", aBoolean=" + aBoolean + " " + Boolean.TYPE + "-" + Byte.MAX_VALUE + "\n" +
                ", string=" + aString  +
                '}';
    }

    public static void main(String[] args) {
        Date date;
        System.out.println("基本数据类型 - 默认值 - 包装类 - 二进制比特位数 - 最小值 - 最大值");
        System.out.println(new PrimaryDataType().toString());
    }


}
