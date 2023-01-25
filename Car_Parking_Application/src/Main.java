import java.io.*;
import java.nio.Buffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            String enteredTime;
            int choice=0;
            Scanner keyboard = new Scanner(System.in);
            FileWriter fw = new FileWriter("garage.txt",true );
            PrintWriter pw = new PrintWriter(fw);
            File file = new File("garage.txt");
            Scanner scan = new Scanner(file);
            mainMenu();
            choice = keyboard.nextInt();
            switch (choice){
                case 1:
                    System.out.println("What kind of vehicle you parking?");
                    System.out.println("-------------------");
                    System.out.println("1-Car");
                    System.out.println("2-Bicycle");
                    System.out.println("3-Truck");
                    System.out.println("-------------------");
                    choice = keyboard.nextInt();

                    if(choice==1){
                        Car car = new Car();
                        System.out.println("Please enter the model of your car");
                        keyboard.nextLine();
                        car.setModel(keyboard.nextLine());
                        pw.print("Model: "+ car.getModel()+ " ");

                        System.out.println("Please enter the military time you entered (use the xx:xx format)");
                        enteredTime = keyboard.nextLine();
                        if(!Time.errorCheck(enteredTime))break;
                        Time checkTime = new Time(enteredTime);
                        car.setEnteredTime(enteredTime);
                        pw.print("-" + " "+ "Entered Time: " +new Time(enteredTime));

                        System.out.println("Please enter the duration you will park");
                        car.setDuration(keyboard.nextDouble());
                        pw.println("-" + " " + "Duration: " +car.getDuration());
                        pw.close();

                        System.out.println("Your pay is: " + car.getDuration() * car.priceCar+"$" );

                    } else if (choice==2) {
                        Bicycle bike = new Bicycle();
                        System.out.println("Please enter the model of your bike");
                        keyboard.nextLine();
                        bike.setModel(keyboard.nextLine());
                        pw.print("Model: " + bike.getModel()+ " ");

                        System.out.println("Please enter the military time you entered (use the xx:xx format)");
                        enteredTime = keyboard.nextLine();
                        Time checkTime = new Time();
                        if(!checkTime.errorCheck(enteredTime))break;
                        checkTime = new Time(enteredTime);
                        bike.setEnteredTime(enteredTime);
                        pw.print("-" + " "+ "Entered Time: " +new Time(enteredTime));

                        System.out.println("Please enter the duration you will park");
                        bike.setDuration(keyboard.nextDouble());
                        pw.println("-" + " " + "Duration: "+bike.getDuration());
                        pw.close();

                        System.out.println("Your pay is: " + bike.getDuration() * bike.priceBicycle+"$" );
                    } else if (choice==3) {
                        Truck truck = new Truck();
                        System.out.println("Please enter the model of your truck");
                        keyboard.nextLine();
                        truck.setModel(keyboard.nextLine());
                        pw.print("Model: " + truck.getModel()+ " ");

                        System.out.println("Please enter the military time you entered (use the xx:xx format)");
                        enteredTime = keyboard.nextLine();
                        Time checkTime = new Time();
                        if(!checkTime.errorCheck(enteredTime))break;
                        checkTime = new Time(enteredTime);
                        truck.setEnteredTime(enteredTime);
                        pw.print("-" + " " + "Entered Time: " +new Time(enteredTime));

                        System.out.println("Please enter the duration you will park");
                        truck.setDuration(keyboard.nextDouble());
                        pw.println("-" + " " + "Duration: " +truck.getDuration());
                        pw.close();

                        System.out.println("Your pay is: " + truck.getDuration() * truck.priceTruck+"$" );
                    }else {
                        System.out.println("You entered wrong number");
                    } break;
                case 2:
                    System.out.println();
                    System.out.println("List of the vehicles");
                    System.out.println("-----------------------------------------------------------------------------");
                    while (scan.hasNextLine()){
                        System.out.println(scan.nextLine());
                    }
                    System.out.println("-----------------------------------------------------------------------------");
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Prices");
                    System.out.println("--------------------------");
                    System.out.println("Car == 10$ per hour");
                    System.out.println("Bicycle == 5$ per hour");
                    System.out.println("Truck == 20$ per hour");
                    System.out.println("---------------------------");

            }
        }
        catch (Exception e){
            System.out.println();
            System.out.println("Something went wrong. ");
        }

    }
    static void mainMenu(){

        System.out.println("---------------------");
        System.out.println("Welcome to our Garage");
        System.out.println("---------------------");
        System.out.println("1-Parking");
        System.out.println("2-Show the Garage");
        System.out.println("3-About the Price");
        System.out.println("---------------------");
        System.out.println();
        System.out.print("Please choose your option: ");

    }
}