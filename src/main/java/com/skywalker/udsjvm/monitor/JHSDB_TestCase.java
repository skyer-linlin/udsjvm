package com.skywalker.udsjvm.monitor;

/**
 * vm param:-Xmx10m -XX:+UseSerialGC -XX:-UseCompressedOops
 * <p>
 * 问题：staticObj, instanceObj, localObj这三个变量本身存放在哪里？
 * <p>
 * 答案：base64解码
 * ICogc3RhdGljT2Jq6ZqPVGVzdOexu+Wei+S/oeaBr+WtmOWcqOaWueazleWMugogKiBpbnN0YW5jZU9iauWcqOmaj1Rlc3Tlr7nosaHlrp7kvovlrZjlnKjloIbkuIoKICogbG9jYWxPYmrlnKhmb2/mlrnms5XmoIjluKfnmoTlsYDpg6jlj5jph4/ooag=
 *
 * @author skywalker create on 2020/8/3 23:06
 * @version 1.0
 */
public class JHSDB_TestCase {
  public static void main(String[] args) {
    Test test = new JHSDB_TestCase.Test();
    test.foo();
  }

  static class Test {
    static ObjectHolder staticObj = new ObjectHolder();
    ObjectHolder instanceObj = new ObjectHolder();

    void foo() {
      ObjectHolder localObj = new ObjectHolder();
      System.out.println("done");
    }
  }

  private static class ObjectHolder {
  }
}
