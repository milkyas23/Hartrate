import java.util.Scanner;

public class Hartrate {
    //private static Object maxHeartRate;

    public static void main (String[] args) {
        Scanner input = new Scanner( System.in);

        System.out.println("skriv dit namn");
        String namn = input.nextLine();

        System.out.println( "skriv din ålder");
        int  Ålder = Integer.parseInt(input.nextLine());

        int maxHeartRate = 220 - Ålder;

        System.out.printf("Calculations for %s  age %d\n",
                namn, Ålder );
        System.out.printf( "Max Heart rate: %d BPM (beats per minute)\n", maxHeartRate );
        input.close();
    }
}

