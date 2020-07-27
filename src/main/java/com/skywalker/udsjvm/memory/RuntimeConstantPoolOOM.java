package com.skywalker.udsjvm.memory;

import java.util.HashSet;

/**
 * com.skywalker.udsjvm.memory
 * <p>
 * -Xmx6M
 * <p>
 * Java 7以后，将原本存放在永久带的字符串常量池转移到了Java堆上，此处限制堆的最大值来确认是否如此
 *
 * @author quanlinlin
 * @date 2020/7/26 22:21
 * @since 0.1
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
