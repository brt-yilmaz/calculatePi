import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to calculatePi!");
    System.out.println("Enter 1 : Leibniz Series");
    System.out.println("Enter 2 : Monte Carlo");

    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    System.out.println("Enter number of points");
    int points = sc.nextInt();
    sc.close();

    double start = System.currentTimeMillis();

    double result = switch (choice) {
      case 1:
        yield LeibnizSeries.calculatePi(points);
      case 2:
        yield new MonteCarlo().calculatePi(points);
      default:
        System.err.println("Invalid choice");
        System.out.print("Here is Java's Pi");
        yield Math.PI;
    };

    double end = System.currentTimeMillis();

    System.out.println("Pi : " + result);
    System.out.println("Time taken : " + (end - start) + " ms");

  }
}
