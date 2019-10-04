public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean wake = false;

        if(hourOfDay > 23 || hourOfDay < 0){
            return false;
        } else if(barking) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                wake = true;
            }
        }
        return wake;
    }
}
