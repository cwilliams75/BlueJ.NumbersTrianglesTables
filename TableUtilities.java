 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        /*"  expected      1 |  2 |  3 |  4 |  5 |\n" +
                        "  2 |  4 |  6 |  8 | 10 |\n" +
                        "  3 |  6 |  9 | 12 | 15 |\n" +
                        "  4 |  8 | 12 | 16 | 20 |\n" +
                        "  5 | 10 | 15 | 20 | 25 |\n";
        */                
                        
        String table = "";
        int temp = 0;
        
        for(int i = 1; i <= 5; i++){
            
            for(int j = 1; j <= 5; j++){
                
                temp = i * j;
                
                if (temp < 10){
                table += "  " + temp + " |";
                }
                
                else if(temp >=10 && temp <=99){
                table += " " + temp + " |"; 
                }
            }
        table += "\n";
        }
        
        
        
        return table;
    }

    public static String getLargeMultiplicationTable() {
           String table = "";
        int temp = 0;
        
        for(int i = 1; i <= 10; i++){
            
            for(int j = 1; j <= 10; j++){
                
                temp = i * j;
                
                if (temp < 10){
                table += "  " + temp + " |";
                }
                
                else if(temp >=10 && temp <=99){
                table += " " + temp + " |"; 
                }
                else if(temp >99 && temp <=999){
                table +=  temp + " |"; 
                }
                
            }
        table += "\n";
        
        
    }
            return table;

}

    public static String getMultiplicationTable(int tableSize) {        
                  String table = "";
        int temp = 0;
        
        for(int i = 1; i <= tableSize; i++){
            
            for(int j = 1; j <= tableSize; j++){
                
                temp = i * j;
                
                if (temp < 10){
                table += "  " + temp + " |";
                }
                
                else if(temp >=10 && temp <=99){
                table += " " + temp + " |"; 
                }
                else if(temp >99 && temp <=999){
                table +=  temp + " |"; 
                }
                
            }
        table += "\n";
        
        
    }  
        
        
        return table;
    }
}

