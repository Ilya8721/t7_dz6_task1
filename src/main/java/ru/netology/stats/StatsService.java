package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales){
        int sumSales = 0;

        for (long i : sales){
            sumSales += i;
        }

        return sumSales;
    }


    public int averageMonthlySales(long[] sales){
        int sumSales = sumSales(sales);

        return sumSales / 12;
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


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int monthlySalesBelowAverage(long[] sales){
        int averageMonthlySales = averageMonthlySales(sales);
        int minMonths = 0;
        for (long i : sales){
            if (i < averageMonthlySales) {
                minMonths += 1;
            }
        }
        return minMonths;
    }


    public int monthlySalesAboveAverage(long[] sales){
        int averageMonthlySales = averageMonthlySales(sales);
        int maxMonths = 0;
        for (long i : sales){
            if (i > averageMonthlySales) {
                maxMonths += 1;
            }
        }
        return maxMonths;
    }
}
