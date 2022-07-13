import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
    

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the latitude of the starting location:");
        double startLat = input.nextDouble();
        
        System.out.println("Enter the longitude of the starting location:");
        double startLong = input.nextDouble();
        
        System.out.println("Enter the latitude of the ending location:");
        double endLat = input.nextDouble();
        
        System.out.println("Enter the longitude of the ending location:");
        double endLong = input.nextDouble();
        
        GeoLocation userInput = new GeoLocation(startLat, startLong);
        
        GeoLocation userInput2 = new GeoLocation(endLat, endLong);
        
        double totalDistance = userInput.distanceFrom(userInput2);
        System.out.println("The distance is " + totalDistance + " miles.");
    }
}
