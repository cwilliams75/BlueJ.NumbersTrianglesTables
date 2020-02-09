


public class NumberUtilities {

    public static String getRange(int stop) {
       String Range = "";
       for (int i = 0; i < stop; i++){
           Range += i;
        }
        
        return Range;
    }

    public static String getRange(int start, int stop) {
        String Range = "";
        for (int i = start; i < stop; i++){
          Range += i;  
        
        }
        
        return Range;
    }


    public static String getRange(int start, int stop, int step) {
        String Range = "";
        for (int i = start; i < stop; i += step){
        Range += i;
        
        }
        return Range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String Range = "";
        for (int i = start; i < stop; i++){
        if(i % 2 == 0){
        Range += i;
        }
        }
        return Range;
    }


    public static String getOddNumbers(int start, int stop) {
        String Range = "";
        for (int i = start; i < stop; i++){
        if(i % 2 == 1){
        Range += i;
        }
        }
        return Range;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String Range = "";
        int pwr = 1;
        for (int i = start; i <= stop; i++){
            pwr = 1;
        for (int j = 1; j <= exponent; j++){
            pwr *= i;
        }
        Range += pwr;
        }
        
        return Range;
    }
}
