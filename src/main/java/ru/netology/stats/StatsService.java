package ru.netology.stats;


public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int totalSales(int[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];

        }
        return total;
    }

    public int averagesalesamount(int[] sales) {


        return totalSales(sales) / sales.length;
    }

    public int thelowermiddle(int[] sales) {

        int lowermonth = 0;
        for (int sale : sales) {
            if (sale < averagesalesamount(sales)) {
                lowermonth++;
            }
        }
        return lowermonth;
    }

    public int aboveaveragee(int[] sales) {

        int highmonth = 0;
        for (int sale : sales) {
            if (sale > averagesalesamount(sales)) {
                highmonth++;
            }
        }
        return highmonth;
    }
}