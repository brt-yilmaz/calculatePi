public class LeibnizSeries {

  public static double calculatePi(int points) {
    double result = 0.0;
    for (int i = 0; i < points; i++) {
      result += Math.pow(-1, i) / (2 * i + 1);
    }

    return 4 * result;
  }

}
