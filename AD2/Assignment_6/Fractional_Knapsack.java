import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Items:");
        int n = sc.nextInt();
        Item[] arr = new Item[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Item(sc.nextInt(), sc.nextInt());
        }
        System.out.print("Enter Total weight:");
        int total = sc.nextInt();
        Arrays.sort(arr);

        int i = 0;
        double profit = 0;
        while (total != 0 && i < n) {
            if (arr[i].weight <= total) {
                profit += (arr[i].profit);
                total -= arr[i].weight;
            } else {
                profit += (total * arr[i].ratio);
                total = 0;
            }
            i++;
        }
        System.out.println("Total Profit:" + profit);
    }

}

class Item implements Comparable<Item> {
    int profit;
    int weight;
    double ratio;

    Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
        this.ratio = (1.0 * profit) / weight;
    }

    public int compareTo(Item obj) {
        return (int) (obj.ratio - this.ratio);
    }
}

/*
 * Output--
 * Enter no. of Items:3
 * 100 20
 * 60 10
 * 120 30
 * Enter Total weight:50
 * Total Profit:240.0
 */