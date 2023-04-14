package org.example;
import org.testng.annotations.Test;
public class GroupsEg {

    @Test(groups = "regression" )
    void test1() {
        System.out.println("this is test1");
    }
    @Test(groups = "critical")

    void test2() {
        System.out.println("this is test2");
    }
    @Test(groups = "regression")
    void test3() {

        System.out.println("this is test3");
    }
    @Test(groups = "critical")

    void test4() {

        System.out.println("this is test4");
    }
    @Test(groups = "regression")

    void test5() {

        System.out.println("this is test5");
    }
    @Test(groups = "critical")

    void test6() {
        System.out.println("this is test6");
    }
}
