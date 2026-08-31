import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your name.");
        String userName = s1.nextLine();
        System.out.println( "Hi " + userName + ", welcome to AP CSA!");

        System.out.println("please give me three names.");
        System.out.println("Please write name 1: ");
        String nameOne = s1.nextLine();
        System.out.println("Please write name 2: ");
        String nameTwo = s1.nextLine();
        System.out.println("Please write name 3: ");
        String nameThree = s1.nextLine();
        System.out.println( nameThree + ", " + nameTwo + ", " +nameOne);
        
        System.out.println("How much do you wiegh in lbs?");
        Double weight = s1.nextDouble();
        Double mercuryWeight = (weight * .4);
        Double venusWeight = (weight * .9);
        Double marsWeight = (weight * .38);
        Double jupiterWeight = (weight * 2.3);
        Double saturnWeight = (weight * 1.1);
        Double uranusWeight = (weight * .92);
        Double neptuneWeight = (weight * 1.2);
        System.out.println("This how much you wiegh on each plant in lbs:");
        System.out.println("Mercury: " + mercuryWeight);
        System.out.println("Venus: " + venusWeight);
        System.out.println("Mars: " + marsWeight);
        System.out.println("Jupiter: " + jupiterWeight);
        System.out.println("saturn: " + saturnWeight);
        System.out.println("Uranus: " + uranusWeight);
        System.out.println("Neptune: " + neptuneWeight);

        System.out.println("Give me any amount of seconds:");
        double time = s1.nextDouble();
        double hours = time / 3600;
        double minutes = (time % 3600) / 60;
        double seconds = (time % 3600) % 60 ;
        System.out.println("Hours: " + (int)hours + " Minutes: " + (int)minutes + " Seconds: " + (int)seconds);

        


    }
}
