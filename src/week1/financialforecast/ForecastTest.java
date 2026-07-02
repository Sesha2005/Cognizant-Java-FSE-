package week1.financialforecast;

public class ForecastTest {

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double future = FinancialForecast.futureValue(currentValue, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, future);

        System.out.println();
        System.out.println("Time Complexity : O(n)");
        System.out.println("Space Complexity : O(n)");
        System.out.println("Optimization : Iterative approach or Dynamic Programming can avoid recursive stack calls.");
    }
}