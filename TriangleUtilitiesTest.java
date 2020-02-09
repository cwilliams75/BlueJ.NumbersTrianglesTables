 


import org.junit.Assert;
import org.junit.Test;

public class TriangleUtilitiesTest {

    @Test
    public void testGetRow_ForSmallWidth(){
        //Given
        // This is the expected output; The output is String variable "*" defined by a int width =1
        String expected = "*";
        int width = 1;
        
        //When
        //When I call the method that I create(name) it should post my output
        String actual = TriangleUtilities.getRow(width);
        
        //Then = What I am comparing which is the expected and the actual to get the expected result
        
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testGetRow_ForBigWidth() {
        //Given
        String expected = "********************";
        int width = 20;
        
        //When
        String actual = TriangleUtilities.getRow(width);
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetTriangle_ForOneRow() {
        // Given
        String expected = "*\n";

        // When
        String actual = TriangleUtilities.getTriangle(1);
        
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTriangle_ForSmallTriangle() {
        // Given
        String expected =
                        "*\n" +
                        "**\n" +
                        "***\n";

        // When                
        String actual = TriangleUtilities.getTriangle(3);
        
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTriangle_ForBigTriangle() {
        String expected =
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******\n" +
                        "********\n" +
                        "*********\n" +
                        "**********\n";
        String actual = TriangleUtilities.getTriangle(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLargeTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";
        String actual = TriangleUtilities.getLargeTriangle();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSmallTriangle() {
        String expected =
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";
        String actual = TriangleUtilities.getSmallTriangle();
        Assert.assertEquals(expected, actual);
    }
}
