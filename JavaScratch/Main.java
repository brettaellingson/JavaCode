public class Main {
    // create Java code that does shows the current date and time
    public static void main(String[] args) {
        System.out.println("The current date and time is: ");
        System.out.println(new java.util.Date());

        System.out.println();

        System.out.println("The current date and time is: ");
        System.out.println(new java.text.SimpleDateFormat("MMMM dd, yyyy HH:mm:ss").format(new java.util.Date()));

        // format java.util.Date() to show month name, day name, time in 24 hour format
        // with minutes and hours only and do not show a colon
        System.out.println();
        System.out.println("The current date and time is: ");
        System.out.println(new java.text.SimpleDateFormat("EEEE MMMM dd, yyyy HHmm").format(new java.util.Date()));

    }
}
