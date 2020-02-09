 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        
          for (int i = 0; i < numberOfStars; i++){
            row = row + "*";
            }  
        
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "" ;
        
            for(int i = 0; i < numberOfRows; i++){
                triangle = triangle + getRow(i) + "*\n";
            }
        return triangle;
    }


    public static String getSmallTriangle() {
        String getSmallTriangle = "";
        
        
        getSmallTriangle = "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";
        
        
        return getSmallTriangle ;
    }

    public static String getLargeTriangle() {
        String largeTriangle = "";
        
        largeTriangle = getTriangle(9);
        
        
        return largeTriangle;
    }
}
