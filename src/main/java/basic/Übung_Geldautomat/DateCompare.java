package basic.Übung_Geldautomat;

import java.util.Calendar;

public class DateCompare {


    public DateCompare() {
    }

    public static boolean isBefore(String date1, String date2)
    {
        Calendar oDate1 = generateString2Calendar(date1);
        Calendar oDate2 = generateString2Calendar(date2);
        return oDate1.before(oDate2);
    }

    private static Calendar generateString2Calendar(String sString2Date)
    {
        Calendar oCalendar = null;
        oCalendar = Calendar.getInstance();
        oCalendar.set(Calendar.YEAR, (new Integer(sString2Date.substring(0, 4)).intValue()));
        oCalendar.set(Calendar.MONTH, ((new Integer(sString2Date.substring(5, 7)).intValue())-1));
        oCalendar.set(Calendar.DATE, (new Integer(sString2Date.substring(8, 10)).intValue()));
        return oCalendar;
    }

}