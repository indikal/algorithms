package lk.inli.algorithms;

public class AmPmTo24HourConversion {

    static String timeConversion(String s) {
        int hh = Integer.parseInt(s.substring(0,2));

        if (s.endsWith("AM") && hh == 12) {
            return "00" + s.substring(2, 8);
        } else if (s.endsWith("PM") && hh < 12) {
            return (hh + 12) + s.substring(2, 8);
        } else {
            return s.substring(0, 8);
        }

    }

    public static void main(String[] args) {
        System.out.println(AmPmTo24HourConversion.timeConversion("12:00:00AM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("12:00:00PM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("02:00:00AM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("02:00:00PM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("10:00:00AM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("10:00:00PM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("12:30:00AM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("12:30:00PM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("11:00:00AM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("11:00:00PM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("05:00:00AM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("05:00:00PM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("01:00:00AM"));
        System.out.println(AmPmTo24HourConversion.timeConversion("01:00:00PM"));
    }
}
