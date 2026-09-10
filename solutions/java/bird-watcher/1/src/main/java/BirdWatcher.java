
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int bird : birdsPerDay){
            if (bird == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        for (int i=0; i< Math.min(numberOfDays, birdsPerDay.length); i++){
            total = total + birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int busy : birdsPerDay){
            if (busy >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
