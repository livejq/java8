package examples.chapter1;

import java.util.Collections;

/**
 * @author livejq
 * @since 2019/8/1
 */
public class ThreadDemo {
    public static void threadPrint() {
        int x = 1, y = 2;
        new Thread( () -> {
            System.out.println("In Java8, Lambda expression rocks !!");
        } ).start();
    }
}
