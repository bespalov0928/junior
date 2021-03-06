package ru.job4j.condition;

/**
 * class Greeting работа с календарем
 * @author bespalov
 */
public class Greeting {

    public static void main(String[] args) {
        String idea = "I like Java!";
        int year = getCurrentYear();
        System.out.println(idea + " But I am a newbie." + year);
    }

    /**
     * возвращает текущий год
     * @return возвращает год
     */
    public static int getCurrentYear() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }
}
