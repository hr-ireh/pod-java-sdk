package com.fanap.podBaseService.util;


import org.opentest4j.AssertionFailedError;

import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class MyOptional {
    public static CountDownLatch cdl = new CountDownLatch(1);
    public static final Optional<AssertionFailedError>[] optionalThrowable = new Optional[]{Optional.empty()};

    public static boolean countDownLatch() {
        boolean result = false;
        try {

            result = cdl.await(15, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void optional(boolean result) {
        if (!result)
            System.out.println("test failed");
        else if (optionalThrowable[0].isPresent()) {
            AssertionFailedError exp = optionalThrowable[0].get();
            throw exp;
        }
    }
}
