package com.skywalker.udsjvm.gc;

/**
 * com.skywalker.udsjvm.gc
 * <p>
 * 演示对象在被GC的时候可以自我拯救，通过finalize（）方法
 *
 * @author quanlinlin
 * @version 0.1
 * @date 2020/7/27 19:32
 * @since 0.1
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();

        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no, i am dead :(");
        }

        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no, i am dead :(");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    private void isAlive() {
        System.out.println("yes, i am still alive :");
    }
}
