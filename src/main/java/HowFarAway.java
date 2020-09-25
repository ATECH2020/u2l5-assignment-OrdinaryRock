import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double lat1;
        double long1;
        double lat2;
        double long2;
        double distance;
        GeoLocation locStart;
        GeoLocation locEnd;
        
        System.out.print("Enter the latitude of the starting location: ");
        lat1 = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        long1 = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        lat2 = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        long2 = in.nextDouble();

        locStart = new GeoLocation(lat1, long1);
        locEnd = new GeoLocation(lat2, long2);
        distance = locStart.distanceFrom(locEnd);

        System.out.print("The distance is " + distance + " miles.");

    }
}
