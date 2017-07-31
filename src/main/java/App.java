import models.Parcel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Guest on 7/31/17.
 */
public class App {
    public static void main(String[] args) {

        ArrayList<Parcel> allParcels = new ArrayList<>();

        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Parcel Services! What would you like to do?  Add package, calculate volume, calculate cost to ship, add gift wrapping, exit.");

            try {
                String navigationChoice = bufferedReader.readLine();
                if (navigationChoice.equals("Add package")) {
                    System.out.println("Height: ");
                    float inputHeight = Float.parseFloat(bufferedReader.readLine());
                    System.out.println("Width: ");
                    float inputWidth = Float.parseFloat(bufferedReader.readLine());
                    System.out.println("Length: ");
                    float inputLength = Float.parseFloat(bufferedReader.readLine());
                    System.out.println("Weight: ");
                    float inputWeight = Float.parseFloat(bufferedReader.readLine());
                    Parcel newParcel = new Parcel(inputHeight, inputWidth, inputLength, inputWeight);
                    allParcels.add(newParcel);
                } else if (navigationChoice.equals("calculate volume")) {
                    for (Parcel oneParcel : allParcels) {
                        Float parcelVol = oneParcel.volume();
                        System.out.println("----------------------");
                        System.out.println("Package Height: " + oneParcel.parcelHeight);
                        System.out.println("Package Length: " +oneParcel.parcelLength);
                        System.out.println("Package Width: " +oneParcel.parcelWidth);
                        System.out.println("Package Weight: " +oneParcel.parcelWeight);
                        System.out.println("Package volume: " + parcelVol);
                    }
                } else if (navigationChoice.equals("calculate cost to ship")) {
                    for (Parcel oneParcel : allParcels) {
                        System.out.println("Distance: ");
                        float inputDistance = Float.parseFloat(bufferedReader.readLine());
                        double parcelCost = oneParcel.costToShip(inputDistance);
                        System.out.println("----------------------");
                        System.out.println("Package Height: " + oneParcel.parcelHeight);
                        System.out.println("Package Length: " +oneParcel.parcelLength);
                        System.out.println("Package Width: " +oneParcel.parcelWidth);
                        System.out.println("Package Weight: " +oneParcel.parcelWeight);
                        System.out.println("Distance: " + inputDistance);
                        System.out.println("Cost to Ship: " + parcelCost);
                    }
                } else if (navigationChoice.equals("Exit")) {
                    System.out.println("Goodbye!");
                    programRunning = false;
                }


            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
