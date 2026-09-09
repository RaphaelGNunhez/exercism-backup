public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    
    public int expectedMinutesInOven(){
        return 40;    
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int x){
        int exp = expectedMinutesInOven();
        return exp - x;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int x){
        return 2 * x;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int x, int y){
        int prep =  preparationTimeInMinutes(x);
        int rema =  remainingMinutesInOven(y);
        return prep + y ;
    }
    
}

