package week_10.assignments.Question_10_14;

public class Question_10_14 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date1: " + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());

        System.out.println("Date2: " + date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
    }
}
