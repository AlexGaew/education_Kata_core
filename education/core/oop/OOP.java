package oop;



import java.lang.String;

public  class OOP {

    final int a = 12;
    public static void main(String[] args) {
        Robot robot = new Robot(3,2,Direction.UP);
        JavaStudent javaStudent = new JavaStudent();
        LazyStudent lazyStudent = new LazyStudent();
        javaStudent.study();
        lazyStudent.study();
//





    }
    String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public static boolean isWeekend(String dayName) {
        return dayName.equals("Sunday") || dayName.equals("Saturday");
    }

    public static int weekendCount(String[] days) {

        int count = 0;
        for(String day : days) {
            if(isWeekend(day)) {
                count +=1;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);

    }
}
