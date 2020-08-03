package com.skywalker.udsjvm.memory;

/**
 * com.skywalker.udsjvm.memory
 *
 * VM args: -Xmx20M -XX:MaxDirectMemorySize=10M
 *
 * @author quanlinlin
 * @version 0.1
 * @date 2020/7/27 17:56
 * @since 0.1
 */
public class DirectMemoryOOM {
    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        // Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        // unsafeField.setAccessible(true);
        // Unsafe unsafe = (Unsafe) unsafeField.get(null);
        // while (true) {
        //     unsafe.allocateMemory(_1MB);
        // }
    }
}
