package com.nealma.primary;

/**
 * 字符和字符串
 *
 * @author neal.ma
 * @date 2020/10/5
 * @blog nealma.com
 */
public class CharAndString {
    public static void main(String[] args) {

        // 字符
        char c1 = '人';
        int i1 = c1;
        System.out.println(i1);

        // 字符串拼接 +
        String s1 = "abcd";
        String s2 = "1234";
        String s = s1 + s2;
        System.out.println(s);

        // 字符串中的转义字符 \
        System.out.println("abc" + "\\" + "bcd");
    }
}
