package com.skywalker.udsjvm.gc;

/**
 * vm parameter:-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * @author skywalker create on 2020/8/2 19:46
 * @version 1.0
 */
public class MinorGC {
  private static final int _1MB = 1024 * 1024;

  public static void testAllocation() {
    byte[] allocation1, allocation2, allocation3, allocation4;
    allocation1 = new byte[2 * _1MB];
    allocation2 = new byte[2 * _1MB];
    allocation3 = new byte[2 * _1MB];
    allocation4 = new byte[4 * _1MB];
  }

  public static void main(String[] args) {
    testAllocation();
  }
}
