package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private final int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private final StatsService service = new StatsService();

    @Test
    void calculateSum() {

        assertEquals(180, service.calculateSum(managerSales));
    }

    @Test
    void maxSales() {

        assertEquals(8, service.maxSales(managerSales));
    }

    @Test
    void minSales() {

        assertEquals(9, service.minSales(managerSales));
    }

    @Test
    void averageAmount() {

        assertEquals(15, service.averageAmount(managerSales));
    }

    @Test
    void belowAverageSales() {

        assertEquals(5, service.belowAverageSales(managerSales));
    }

    @Test
    void aboveAverageSales() {

        assertEquals(5, service.aboveAverageSales(managerSales));
    }
}
