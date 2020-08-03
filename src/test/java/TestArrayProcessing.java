import com.geekbrains.ArrayProcessing;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayProcessing {
    ArrayProcessing arrayProcessing;
    @Before
    public void beforeArrayProcessing(){
        arrayProcessing = new ArrayProcessing();
    }


@Test
    public void  testNewArray1(){
    int[] arrIn = new int[]{2,3,5,6,4,8,9,4,5,6};
    int[] arrOut = new int[]{5,6};
    Assert.assertArrayEquals(arrOut,arrayProcessing.newArray(arrIn));
}
    @Test
    public void  testNewArray2(){
        int[] arrIn = new int[]{2,3,5,6,4,8,9,5,4};
        int[] arrOut = new int[]{};
        Assert.assertArrayEquals(arrOut,arrayProcessing.newArray(arrIn));
    }
    @Test(expected = RuntimeException.class)
    public void  testNewArray3(){
        int[] arrIn = new int[]{2,3,5,6,8,9,5};
        arrayProcessing.newArray(arrIn);
    }


@Test
    public  void testCheckArray1(){

    int[] arr = new int[]{4,1,4,4,1};
    Assert.assertTrue(arrayProcessing.checkArray(arr));
}

    @Test
    public  void testCheckArray2(){

        int[] arr = new int[]{1,1,1,1,1};
        Assert.assertFalse(arrayProcessing.checkArray(arr));
    }
    @Test
    public  void testCheckArray3(){

        int[] arr = new int[]{4,1,5,1,1};
        Assert.assertFalse(arrayProcessing.checkArray(arr));
    }
    @Test
    public  void testCheckArray4(){

        int[] arr = new int[]{4,4,4,4,4};
        Assert.assertFalse(arrayProcessing.checkArray(arr));
    }
}
