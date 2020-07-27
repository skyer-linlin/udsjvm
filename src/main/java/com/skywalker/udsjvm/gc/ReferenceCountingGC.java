package com.skywalker.udsjvm.gc;

/**
 * com.skywalker.udsjvm.gc
 *
 * @author quanlinlin
 * @version 0.1
 * @date 2020/7/27 18:25
 * @since 0.1
 */
public class ReferenceCountingGC {
    public Object instance = null;

    public static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}
