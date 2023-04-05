import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (hourOfDay >= 0 && hourOfDay < 12) {
            System.out.println("Good morning! Welcome to the Computer Department.");
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            System.out.println("Good afternoon! Welcome to the Computer Science Department.");
        } else {
            System.out.println("Good evening! Welcome to the Computer Science Department.");
        }
    }
}

