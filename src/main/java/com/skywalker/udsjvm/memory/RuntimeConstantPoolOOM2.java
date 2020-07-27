package com.skywalker.udsjvm.memory;

/**
 * com.skywalker.udsjvm.memory
 *
 * @author quanlinlin
 * @date 2020/7/26 22:34
 * @since 0.1
 */
public class RuntimeConstantPoolOOM2 {
    public static void main(String[] args) {
        /*
         * 在JDK6中，str.intern()会把首次遇到的字符串实例复制到永久代的字符串常量池存储，返回的是永久代对字符串实例的引用
         * 而由StringBuilder创建的实例在堆上，所以必然不是同一个引用，结果为false
         *
         * 在JDK7中，字符串常量池已经移动到了堆上，只需要在常量池中记录一下首次出现的实例引用
         * str.intern()返回的引用和StringBuilder创建的字符串实例就是同一个
         */
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
