import java.util.*;

class OpenAddressing {
    int arr[];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        OpenAddressing ob = new OpenAddressing();
        ob.create();
        ob.display();
        ob.search();
        ob.delete();
        ob.display();

    }

    void create() {

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        arr = new int[n];
        int hit = 0;
        System.out.print("Enter elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hit = 0;
            int h = num % n;
            while (arr[h] != 0) {
                hit++;
                h = (num + hit) % n;
            }
            arr[h] = num;
        }
    }

    void display() {
        System.out.println("HashTable data--");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0)
                System.out.println("Key: " + i + "\tValue: " + arr[i]);
        }
    }

    void search() {
        System.out.print("Enter value to search: ");
        int num = sc.nextInt(), n = arr.length;
        int hit = 0;
        int h = num % n;
        while (arr[h] != num && hit < n) {
            hit++;
            h = (num + hit) % n;
        }
        if (arr[h] == num) {
            System.out.println("Found at key: " + h);
        } else {
            System.out.println("Not Found");
        }
    }

    void delete() {
        System.out.print("Enter value to delete: ");
        int num = sc.nextInt(), n = arr.length;
        int hit = 0;
        int h = num % n;
        while (arr[h] != num && hit < n) {
            hit++;
            h = (num + hit) % n;
        }
        if (arr[h] == num) {
            System.out.println("Deleted value: " + arr[h]);
            arr[h] = 0;
        } else {
            System.out.println("Not Found");
        }
    }

    // int key(int num) {
    // int hit = 0, n = arr.length;
    // int h = num % n;
    // while (arr[h] != 0 && hit < n) {
    // hit++;
    // h = (num + hit) % n;
    // }
    // if (hit < n)
    // return h;
    // return -1;
    // }
}

// Pair arr[] = new Pair[n];
// int hit = 0;
// for (int i = 0; i < n; i++) {
// System.out.println("E");
// int key = sc.nextInt();
// int value = sc.nextInt();
// Pair temp = new Pair(key, value);
// hit = 0;
// int h = key % n;
// while (arr[h] == null) {
// hit++;
// h = (key + hit) % n;
// }
// arr[h] = temp;
// System.out.println("h: " + h);
// }
// for (Pair i : arr) {
// System.out.print(i + " ");
// }

// class Pair {
// int key;
// int value;

// Pair(int key, int value) {
// this.key = key;
// this.value = value;
// }

// public String toString() {
// return "Key: " + this.key + "\tValue: " + this.value;
// }
// }