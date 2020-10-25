package com.nealma.primary;

/**
 * 数据类型
 *
 * @author neal.ma
 * @date 2020/9/29
 * @blog nealma.com
 */
public class JavaDataType {

    // 成员变量 有默认值 不需要初始化就可以使用

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
        return "JavaDataType{" +
                "aBtye=" + aByte + " " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE + " " + Byte.SIZE + "\n" +
                ", aShort=" + aShort + " " + Short.MIN_VALUE + "~" + Short.MAX_VALUE + " " + Short.SIZE + "\n" +
                ", anInt=" + anInt + " " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE + " " + Integer.SIZE + "\n" +
                ", aLong=" + aLong + " " + Long.MIN_VALUE + "~" + Long.MAX_VALUE + " " + Long.SIZE + "\n" +
                ", aFloat=" + aFloat + " " + Float.MIN_VALUE + "~" + Float.MAX_VALUE + " " + Float.SIZE + "\n" +
                ", aDouble=" + aDouble + " " + Double.MIN_VALUE + "~" + Double.MAX_VALUE + " " + Double.SIZE + "\n" +
                ", aChar=" + '\u0000' + " " + (Character.MIN_VALUE == aChar) +  " " + Character.MIN_VALUE + "~" + Character.MAX_VALUE + " " + Character.SIZE + "\n" +
                ", aBoolean=" + aBoolean + " " + " " + "\n" +
                ", aString=" + aString + " " +
                '}';
    }

    public static void main(String[] args) {
        // 局部变量 即方法变量

        // 为什么局部变量必须要手动初始化？？？？

        int i = 0;

        System.out.println(i);
        System.out.println("默认值 - 最小值 - 最大值 - 二进制比特位");
        JavaDataType javaDataType = new JavaDataType();
        System.out.println(javaDataType.toString());
    }

}
