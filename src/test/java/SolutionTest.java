import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] arr = {0,1,1,0,1,0,1,1,0,0};
        int expected = 5;
        int actual = new Solution().maxTurbulenceSize(arr);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] arr = {9,4,2,10,7,8,8,1,9};
        int expected = 5;
        int actual = new Solution().maxTurbulenceSize(arr);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] arr = {8,8,9,10,6,8,2,4,2,2,10,6,6,10,10,2,3,5,1,2,10,4,2,0,9,4,9,3,0,6,3,2,3,10,10,6,4,6,4,4,2,5,1,4,1,1,9,8,9,5,3,5,5,4,5,5,6,5,3,3,7,2,0,10,9,7,7,3,5,1,0,9,6,3,1,3,4,4,3,6,3,2,1,4,10,2,3,4,4,3,6,7,6,2,1,7,0,6,8,10};
        int expected = 7;
        int actual = new Solution().maxTurbulenceSize(arr);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        int[] arr = {37,199,60,296,257,248,115,31,273,176};
        int expected = 5;
        int actual = new Solution().maxTurbulenceSize(arr);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        int[] arr = {1,1,2};
        int expected = 2;
        int actual = new Solution().maxTurbulenceSize(arr);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        int[] arr = {1,1,1};
        int expected = 1;
        int actual = new Solution().maxTurbulenceSize(arr);

        Assert.assertEquals(expected, actual);
    }
}
