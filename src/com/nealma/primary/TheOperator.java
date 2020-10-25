package com.nealma.primary;

/**
 * 运算符
 *
 * @author neal.ma
 * @date 2020/9/30
 * @blog nealma.com
 */
public class TheOperator {
    public static void main(String[] args) {
        // 数学运算符
        int a = 7;
        int b = 10;
        System.out.println("数学运算符") ;
        System.out.println("a = " + a + ", b = " + b) ;
        System.out.println("a + b = " + (a + b)) ;
        System.out.println("a - b = " + (a - b)) ;
        System.out.println("a * b = " + (a * b)) ;
        System.out.println("a / b = " + (a / b)) ;
        System.out.println("a % b = " + (a % b)) ;// 取模，相除取余
        System.out.println("a++ = " + (a++)) ; // 自增1 该行代码不参与计算
        System.out.println("a-- = " + (a--)) ; // 自减1
        System.out.println("++b = " + (++b)) ; // 参与计算，操作数自增1并且赋值改行代码

        // 逻辑运算符
        System.out.println("逻辑运算符") ;
        System.out.println("a = " + a + ", b = " + b) ;
        System.out.println("a == b = " + (a == b)) ;
        System.out.println("a > b = " + (a > b)) ;
        System.out.println("a >= b = " + (a >= b)) ;
        System.out.println("a < b = " + (a < b)) ;
        System.out.println("a <= b = " + (a <= b)) ;
        System.out.println("a != b = " + (a != b)) ;

        // 赋值运算符
        System.out.println("赋值运算符") ;
        System.out.println("a = " + a + ", b = " + b) ;
        a = b;
        System.out.println("a = " + a) ;
        a += b; // a = a + b
        System.out.println("a = " + a) ;

        // instanceof 运算符
        System.out.println("instanceof 运算符") ;
        Object o = new String("a");
        System.out.println("o instanceof String " + (o instanceof String)) ;

        // 逻辑运算符
        System.out.println("逻辑运算符") ;
        System.out.println("(a > b) && (a < b) = " + ((a > b) && (a < b))); // 逻辑 与
        System.out.println("(a > b) || (a < b) = " + ((a > b) || (a < b)));// 逻辑 或
        System.out.println("!(a < b) = " + (!(a > b)));// 逻辑 非

        // 短路场景

        // 位运算符
        System.out.println("位运算符") ;
        a = 12;
        b = 10;
        int c = -1; // 0001 负数表示：1 操作数的绝对值（000000000000000000000000000000000001），2 反码（11111111111111111111111111111110），3 反码+1（11111111111111111111111111111111）
        System.out.println("a = " + a + ", b = " + b + ", c = " + c) ;
        System.out.println("a = " + Integer.toBinaryString(a)) ;
        System.out.println("b = " + Integer.toBinaryString(b)) ;
        System.out.println("c = " + Integer.toBinaryString(c)) ;

        System.out.println("a & b = " + Integer.toBinaryString(a & b)) ;
        System.out.println("a | b = " + Integer.toBinaryString(a | b)) ;
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b)) ;
        System.out.println("~a = " + Integer.toBinaryString(~a));
        System.out.println("a>>1 = " + Integer.toBinaryString(a>>1)) ; // >> 右移 高位不变
        System.out.println("c>>1 = " + Integer.toBinaryString(c>>1)) ;
        System.out.println("c>>>1 = " + Integer.toBinaryString(c>>>1)) ;// >>> 右移 高位补0
        System.out.println("a<<1 = " + Integer.toBinaryString(a<<1)) ;

    }
}
