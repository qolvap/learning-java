import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int seconds = scanner.nextInt();

            // Calculate hours, minutes, and remaining seconds
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int remainingSeconds = seconds % 60;

          hours = hours % 24; // To ensure hours are within 0 to 23 range

            // Format and print the time
            System.out.printf("%d:%02d:%02d%n", hours, minutes, remainingSeconds);
        }
    }

