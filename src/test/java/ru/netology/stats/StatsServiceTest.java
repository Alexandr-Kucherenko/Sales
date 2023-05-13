package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ShouldFindMinBetweenEnds() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void ShouldFindMaxBetweenEnds() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void ShouldTotal() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotal = 180;
        int actualTotal = service.totalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);

    }

    @Test
    public void Shouldaveragesalesamount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedaveragesalesamount = 15;
        int actualaveragesalesamount = service.averagesalesamount(sales);

        Assertions.assertEquals(expectedaveragesalesamount, actualaveragesalesamount);

    }

    @Test
    public void Shouldthelowermiddlemount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedlowermiddlemount = 5;
        int actuallowermiddlemount = service.thelowermiddle(sales);

        Assertions.assertEquals(expectedlowermiddlemount, actuallowermiddlemount);

    }
    @Test
    public void Shouldtheabovemiddlemount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedabovemiddlemount = 5;
        int actualabovemiddlemount = service.thelowermiddle(sales);

        Assertions.assertEquals(expectedabovemiddlemount, actualabovemiddlemount);

    }


}


