
public class MonteCarlo {
  public double calculatePi(int points) {

    int insidePoints = 0;

    for (int i = 0; i < points; i++) {
      double x = Math.random();
      double y = Math.random();
      double distance = Math.sqrt(x * x + y * y);

      if (distance < 1) {
        insidePoints++;
      }

    }

    double monteCarloPi = (4.0 * insidePoints) / points;

    return monteCarloPi;
  }

}
