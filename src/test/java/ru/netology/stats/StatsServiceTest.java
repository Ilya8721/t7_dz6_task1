package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageMonthlySales() {
        StatsService service = new StatsService();

        long expectedSum = 15;
        long actualSum = service.averageMonthlySales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long expectedSum = 8;
        long actualSum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long expectedSum = 9;
        long actualSum = service.minSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void shouldFindMonthlySalesBelowAverage() {
        StatsService service = new StatsService();

        long expectedSum = 5;
        long actualSum = service.monthlySalesBelowAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void shouldFindMonthlySalesAboveAverage() {
        StatsService service = new StatsService();

        long expectedSum = 5;
        long actualSum = service.monthlySalesAboveAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
}
