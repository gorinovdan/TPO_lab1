package com.lasat;
import com.lasat.task1.Task1;
import com.lasat.task2.SplayTree;
import com.lasat.task2.SplayTreeTest;
import com.lasat.task3.DomainModelTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result_task1 = JUnitCore.runClasses(Task1.class);
        if (result_task1.wasSuccessful()) {
            System.out.println("--> Task_1: All tests passed successfully!");
        } else {
            System.out.println("--> Task_1: Test failures:");
            for (Failure failure : result_task1.getFailures()) {
                System.out.println(failure.toString());
            }
        }

        Result result_task2 = JUnitCore.runClasses(SplayTreeTest.class);
        if (result_task2.wasSuccessful()) {
            System.out.println("--> Task_2: All tests passed successfully!");
        } else {
            System.out.println("--> Task_2: Test failures:");
            for (Failure failure : result_task2.getFailures()) {
                System.out.println(failure.toString());
            }
        }
        System.out.println();
        Result result_task3 = JUnitCore.runClasses(DomainModelTest.class);
        if (result_task3.wasSuccessful()) {
            System.out.println("--> Task_3: All tests passed successfully!");
        } else {
            System.out.println("--> Task_3: Test failures:");
            for (Failure failure : result_task3.getFailures()) {
                System.out.println(failure.toString());
            }
        }

    }
}
