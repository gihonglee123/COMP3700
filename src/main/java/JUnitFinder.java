import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JUnitFinder{


    @Test
    public void test_findMaxTrivial() {
        Finder find = new Finder();
        int a[] = {2,8,6,4,1,9,8,4,4,2,5};
        int expectedResult = 9;
        int actualResult = find.findMax(a);
        // test
        assertEquals(actualResult,expectedResult);
    }



    @Test
    public void test_findMaxNull() {
        Finder find = new Finder();
        int a[] = null;
        Object expectedResult = null;
        Object actualResult = find.findMax(a);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_findMaxEmpty() {
        Finder find = new Finder();
        int a[] = {};
        Object expectedResult = null;
        Object actualResult = find.findMax(a);
        // test
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test_findMinTrivial() {
        Finder find = new Finder();
        int a[] = {2,8,6,4,1,9,8,4,4,2,5};
        int expectedResult = 1;
        int actualResult = find.findMin(a);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_findMinNull() {
        Finder find = new Finder();
        int a[] = null;
        Object expectedResult = null;
        Object actualResult = find.findMin(a);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_findMinEmpty() {
        Finder find = new Finder();
        int a[] = {};
        Object expectedResult = null;
        Object actualResult = find.findMin(a);
        // test
        assertEquals(actualResult,expectedResult);
    }

}
