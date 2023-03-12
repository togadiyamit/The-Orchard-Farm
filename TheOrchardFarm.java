import java.util.*;
import java.io.*;

public class TheOrchardFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 1;
        while(t-- > 0) {
            int tree = sc.nextInt();
            int days = sc.nextInt();
            int max_percentage = 40;
            int max_tree = (tree * max_percentage) / 100;
            int apple_days = 10;
            int apple_tree_income = 12000;
            int orange_days = 6;
            int orange_tree_income = 10000;
            int mango_days = 15;
            int mango_tree_income = 27500;
            int lemon_days = 5;
            int lemon_tree_income = 7500;
            int coconut_days = 15;
            int coconut_tree_income = 8000;
            int[] income = new int[5];
            int totalIncome = 0;
            income[0] = (days / apple_days) * apple_tree_income;
            income[1] = (days / orange_days) * orange_tree_income;
            income[2] = (days / mango_days) * mango_tree_income;
            income[3] = (days / lemon_days) * lemon_tree_income;
            income[4] = (days / coconut_days) * coconut_tree_income;
            for(int x : income) totalIncome += x;
            tree -= 5;
            Arrays.sort(income);
            int i = 4;
            while(tree > 0 && i >= 0) {
                int temp = Math.min(tree, max_tree - 1);
                totalIncome += (income[i] * temp);
                tree -= temp;
                i--;
            }
            System.out.print("Case #" + a + ": ");
            System.out.println(totalIncome);
            a++;
        }
    }
}
