package com.ttp;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Hello World!");

        String str = null;
        str = String.format("Hi,%s", "飞龙");          // 格式化字符串

        double n = 3.1415926;
        String s = String.format("%f %n");
        System.out.println(s);
    }
}
