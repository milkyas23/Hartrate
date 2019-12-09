import java.util.Scanner;

public class Hartrate {
    public static void main (String[] args) {
        Scanner input = new Scanner( System.in);

        System.out.println("skriv dit namn");
        String namn = input.nextLine();

        System.out.println( "skriv din ålder");
        String Ålser = input.nextLine();

        Hartrate person1 = new Hartrate();

        System.out.printf("Calculations for %s %s age %d\n",
                person1.Namn(), person1.ålder() );
        System.out.printf( "Max Heart rate: %d BPM (beats per minute)\n", person1.getMaxHeartRate() ); // Here, you haven't set the maxHeartRate yet, so it will be 0.
        input.close();
    }
    private int ålder, maxHeartRate;
    private String Namn;

    public void displayTargetHeartRateRange() {

    }

    public Object getMaxHeartRate() {
        return maxHeartRate;
    }

    public Object ålder() {
        return ålder;
    }

    public Object Namn() {
        return Namn;
    }




}
