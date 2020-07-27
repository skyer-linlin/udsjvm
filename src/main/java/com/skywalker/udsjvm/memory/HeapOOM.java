package com.skywalker.udsjvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * com.skywalker.udsjvm.memory
 *
 * <p>VM Args: -Xms20m -Xmx20m -XX:+HeadDumpOnOutOfMemoryError
 *
 * <p>-XX:+HeadDumpOnOutOfMemoryError: 当内存溢出的时候可以Dump内存堆转储快照进行分型
 *
 * @author quanlinlin
 * @date 2020/7/25 19:01
 * @since 0.1
 */
public class HeapOOM {
  public static void main(String[] args) {
    List<OOMObject> list = new ArrayList<>();
    while (true) {
      list.add(new OOMObject());
    }
  }

  static class OOMObject {}
}
