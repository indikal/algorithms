package lk.inli.algorithms;

public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int altitude = 0;
        int previousAltitude;
        int noOfValleys = 0;

        char[] path = s.toCharArray();

        for (char step : path) {
            previousAltitude = altitude;

            if (step == 'D') {
                altitude -= 1;
            } else {
                altitude += 1;
            }

            if (previousAltitude < 0 && altitude >= 0) noOfValleys++;
        }

        return noOfValleys;
    }

    public static void main(String[] args) {
        System.out.println(CountingValleys.countingValleys(8, "DDUUUUDD"));
        System.out.println(CountingValleys.countingValleys(8, "UDDDUDUU"));
        System.out.println(CountingValleys.countingValleys(12, "DDUUDDUDUUUD"));
    }
}
