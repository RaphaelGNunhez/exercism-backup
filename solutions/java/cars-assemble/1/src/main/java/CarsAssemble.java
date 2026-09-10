public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prod = speed * 221;
        if(speed >= 5 && speed <= 8){
            prod = prod * 90/100;
        } else if (speed == 9){
            prod = prod * 80/100;
        } else if (speed == 10){
            prod = prod * 77/100;
        }
        return prod;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) /60;
    }
}
