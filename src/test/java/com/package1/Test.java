package com.package1;
import org.testng.Assert;
public class Test {

        @org.testng.annotations.Test
        public void example1() {
            Assert.assertEquals(2, 2, "This test should be failed");
        }

        @org.testng.annotations.Test
        public void example2() {
            Assert.assertEquals(2, 2);
        }

        @org.testng.annotations.Test(dependsOnMethods = "example1")
        public void skippedByDependencyTest() {

        }
}
