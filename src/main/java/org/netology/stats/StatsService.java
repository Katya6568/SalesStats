package org.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    public int allSales(long[] sales) {
        int salesSum = 0;

        for (int i = 0; i < sales.length; i++) {
            salesSum += sales[i];
        }
        return salesSum;
    }
    public int averageSales(long[] sales) {
        int avSales = allSales(sales);

        return avSales / sales.length;
    }

    public int belowAverageSales(long[] sales) {
        int belowAvSales = averageSales(sales);
        int monthsBelowAvSales = 0;
        for (long amount : sales) {
            if (amount < belowAvSales) {
                monthsBelowAvSales = monthsBelowAvSales + 1;
            }
        }
        return monthsBelowAvSales;
    }
    public int aboveAverageSales(long[] sales) {
        int aboveAvSales = averageSales(sales);
        int monthsAboveAvSales = 0;
        for (long amount : sales) {
            if (amount > aboveAvSales) {
                monthsAboveAvSales = monthsAboveAvSales + 1;
            }
        }
        return monthsAboveAvSales;
    }
}
