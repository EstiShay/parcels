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
                    int inputHeight = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Width: ");
                    int inputWidth = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Length: ");
                    int inputLength = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Weight: ");
                    int inputWeight = Integer.parseInt(bufferedReader.readLine());
                    Parcel newParcel = new Parcel(inputHeight, inputWidth, inputLength, inputWeight);
                    allParcels.add(newParcel);
                } else if (navigationChoice.equals("calculate volume")) {
                    for (Parcel oneParcel : allParcels) {
                        int parcelVol = oneParcel.volume();
                        System.out.println("Package volume: " + parcelVol);
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
