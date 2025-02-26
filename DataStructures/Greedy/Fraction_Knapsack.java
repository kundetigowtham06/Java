import java.util.*;

 class Item {
    int weight;
    int profit;
    double ratio;

    Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        this.ratio = (double) profit / weight;
    }
}

public class Fraction_Knapsack {

    public static double MaxProfit(Item[] items, int m) {
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double profit = 0.0;
        for (Item i : items) {
            if (i.weight <= m) {
                profit += i.profit;
                m -= i.weight;
            } else {
                double fraction = (double) m / i.weight;
                profit += i.profit * fraction;
                m -= i.weight * fraction;
                break;  // All capacity used up
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of Objects=");
        int n = sc.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+" object weight=");
            int w = sc.nextInt();
            System.out.println("Enter "+i+" object profit=");
            int p = sc.nextInt();
            items[i] = new Item(w, p);
        }
        double maxProfit = MaxProfit(items, 15);
        System.out.println("Max profit: " + maxProfit);
        sc.close();
    }
}
