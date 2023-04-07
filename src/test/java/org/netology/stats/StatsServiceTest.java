package org.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinSales = 9;
        long actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAllSales = 180;
        long actualAllSales = service.allSales(sales);

        Assertions.assertEquals(expectedAllSales,actualAllSales);

    }
    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSales = 15;
        long actualAverageSales = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldFindMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthsBelowAverageSales = 5;
        long actualMonthsBelowAverageSales = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedMonthsBelowAverageSales, actualMonthsBelowAverageSales);
    }
    @Test
    public void shouldFindMonthsAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthsAboveAverageSales = 5;
        long actualMonthsAboveAverageSales = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedMonthsAboveAverageSales, actualMonthsAboveAverageSales);
    }
}
