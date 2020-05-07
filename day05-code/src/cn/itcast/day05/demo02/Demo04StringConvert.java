package cn.itcast.day05.demo02;
/*
* String当中与转换相关的常用方法有：
*
* public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值
* public byte[] getBytes()：获得当前字符串底层的字节数组
* public String replace(CharSequence oldString, CharSequence newString)：
*   将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
*   备注：CharSequence意思就是说可以接收字符串类型
* */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //转换称为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);   //H
        System.out.println(chars.length);   // 字符数组.length - 没有括号
        System.out.println("===================");

        //转换称为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===================");

        //字符串的内容替换
        String str1 = "How do you do";
//        String str2 = str1.replace("ow", "*");    //也对
//        String str3 = str1.replace('o', '*');     //也对
        String str4 = str1.replace("o", "*");
        System.out.println(str1);   //How do you do
        System.out.println(str4);   //H*w d* y*u d*


    }

}
