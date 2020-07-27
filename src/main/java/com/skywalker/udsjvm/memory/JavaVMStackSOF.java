package com.skywalker.udsjvm.memory;

/**
 * com.skywalker.udsjvm.memory
 *
 * <p>VM args: -Xss160k
 *
 * <p>default result: 17887
 *
 * <p>128 result: 774
 *
 * @author quanlinlin
 * @date 2020/7/26 21:26
 * @since 0.1
 */
public class JavaVMStackSOF {
  private int stackLength = 1;

  public static void main(String[] args) {
    JavaVMStackSOF oom = new JavaVMStackSOF();
    try {
      oom.stackLeak();
    } catch (Throwable e) {
      System.out.println("stack length:" + oom.stackLength);
      throw e;
    }
  }

  private void stackLeak() {
    stackLength += 1;
    stackLeak();
  }
}
