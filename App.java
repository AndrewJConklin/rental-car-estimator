import java.util.Scanner;
import java.io.*;

class App {
  private static String pickUpDate;
  private static int rentalDays;
  private static boolean tollTag;
  private static boolean GPS;
  private static boolean roadSide;
  private static int age;

  private static float baseCost;

  public static void main(String args[]) {
    enterPickUpDate();
    enterRentalDays();
    tollTagOption();
    gpsOption();
    roadSideOption();
    enterAge();

    String baseCostStatement = String.format("The base cost of the rental is $%f", baseCost);

    System.out.println(baseCostStatement);
  }

  private static void enterPickUpDate() {
    System.out.println("Enter pick-up date");
    Scanner pickup = new Scanner(System.in);
    pickUpDate = pickup.next();
  }

  private static void enterRentalDays() {
    System.out.println("Enter rental days");
    Scanner days = new Scanner(System.in);
    rentalDays = Integer.parseInt(days.next());
  }

  private static void tollTagOption() {
    System.out.println("Would you like a toll tag for $3.95 a day? Yes or no?");
    Scanner tag = new Scanner(System.in);
    if (tag.next().equals("Yes")) {
      tollTag = true;
    } else {
      tollTag = false;
    }
  }

  private static void gpsOption() {
    System.out.println("Would you like a GPS for $2.95 a day? Yes or no?");
    Scanner gps = new Scanner(System.in);
    if (gps.next().equals("Yes")) {
      GPS = true;
    } else {
      GPS = false;
    }
  }

  private static void roadSideOption() {
    System.out.println("Would you like roadside assistance for $3.95 a day? Yes or no?");
    Scanner assistance = new Scanner(System.in);
    if (assistance.next().equals("Yes")) {
      roadSide = true;
    } else {
      roadSide = false;
    }
  }

  private static void enterAge() {
    System.out.println("Enter your age");
    Scanner ageScanner = new Scanner(System.in);
    age = Integer.parseInt(ageScanner.next());
  }

  private static void getBasicCost() {
    float basePerDay = (float) 29.99;
    if (age < 25) {
      baseCost = (float) (basePerDay * 1.30) * rentalDays;
    } else {
      baseCost = (float) basePerDay * rentalDays;
    }
  }
}