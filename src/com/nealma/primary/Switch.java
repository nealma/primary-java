package com.nealma.primary;

/**
 * 多重选择 switch
 *
 * @author neal.ma
 * @date 2020/10/7
 * @blog nealma.com
 */
public class Switch {
    public static void main(String[] args) {

        int option = 1;
        System.out.println("不使用 break");
        //1 没有使用 break，一旦匹配上，后面的 case 出现穿透情况（fall-through）
        switch (option) {
            case 1:
                System.out.println("红灯");
            case 2:
                System.out.println("绿灯");
            case 3:
                System.out.println("黄灯");
            default:
                System.out.println("故障");
        }

        //2 墙裂推荐加上 break，否则出现诡异的 BUG，很难发现。
        System.out.println("\n加上 break");
        switch (option) {
            case 1:
                System.out.println("红灯");
                break;
            case 2:
                System.out.println("绿灯");
                break;
            case 3:
                System.out.println("黄灯");
                break;
            default:
                System.out.println("故障");
        }

        //3 没有匹配任何 case 条件，执行 default
        System.out.println("\n没有匹配任何 case，执行 default");
        option = 10;
        switch (option) {
            case 1:
                System.out.println("红灯");
                break;
            case 2:
                System.out.println("绿灯");
                break;
            case 3:
                System.out.println("黄灯");
                break;
            default:
                System.out.println("故障");
        }

        // 字符串
        String optionString = "red";
        System.out.println("\n字符串类型");
        switch (optionString) {
            case "red":
                System.out.println("红灯");
                break;
            case "green":
                System.out.println("绿灯");
                break;
            case "yellow":
                System.out.println("黄灯");
                break;
            default:
                System.out.println("故障");
        }

        // 枚举
        System.out.println("\n枚举类型");
        Color color = Color.GREEN;
        switch (color) {
            // Color.RED java: 枚举 switch case 标签必须为枚举常量的非限定名称
            case RED:
                System.out.println("红灯");
                break;
            case GREEN:
                System.out.println("绿灯");
                break;
            case YELLOW:
                System.out.println("黄灯");
                break;
            default:
                System.out.println("故障");
        }

        // jdk 14+ lambda
        System.out.println("\nlambda jdk 14");

        switch (color) {
            case RED -> System.out.println("红灯");
            case GREEN -> {
                System.out.println("绿灯");
                System.out.println("前进");
            }
            case YELLOW -> System.out.println("黄灯");
            default -> System.out.println("故障");
        }

        // 赋值
        System.out.println("\n赋值操作");

        String myColor = switch (color) {
            case RED -> "红灯";
            case GREEN -> "绿灯";
            case YELLOW -> "黄灯";
            default -> "故障";
        };
        System.out.println("myColor: " + myColor);

        // 使用 yield 返回数据
        System.out.println("\n赋值操作");

        String result = switch (color) {
            // 多个 case 可以合并
            case RED,YELLOW -> "颜色";
            default -> {
                // 多行代码，使用 yield 返回
                String className = Switch.class.getName();
                yield "默认 " + className;
            }
        };
        System.out.println("result: " + result);
    }
}
enum Color {
    RED(1), GREEN(2),YELLOW(3);

    int code;
    Color(int code) {
        this.code = code;
    }
}