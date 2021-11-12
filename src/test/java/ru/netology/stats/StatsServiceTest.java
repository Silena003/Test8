package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
            StatsService service = new StatsService();
            int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 180;
            int actual = service.calculateSum(managerSales);
            assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void averageAmount() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void belowAverageSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(managerSales);
        assertEquals(expected, actual);
    }
}