import java.util.Scanner;
import java.lang.Math;

public class Milk {
    public static void main(String[] args) {
        final double CARTON_CAPACITY = 3.78;
        final double COST_PER_LITER = 0.38;
        final double PROFIT_PER_CARTON = 0.27;

        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter the total number of produced milk in liters: ");
        double liters = prompt.nextDouble();
        
        double cartons_needed = liters/CARTON_CAPACITY;
        System.out.println("Cartons needed: " + Math.round(cartons_needed));
        double production_cost = liters * COST_PER_LITER;
        System.out.println("Production cost: $" + production_cost);
        System.out.printf("Profit: $%.2f", cartons_needed * PROFIT_PER_CARTON);
        
        prompt.close();
    }
}
