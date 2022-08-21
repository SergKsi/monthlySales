package ru.netology.javaqa.monthlySales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import ru.netology.javaqa.monthlySales.services.StatsService;

public class StatsServiceTest {

    //  1. Сумма всех продаж
    @Test
    public void testAllSumMonthlySalesEquals() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.allSumMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    //  2. Средняя сумма продаж в месяц
    @Test
    public void testAverageSumAllMonthlySales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.averageSumAllMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    //  3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    @Test
    public void testNumberPeakMonthlySales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        long actual = service.numberPeakMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    // 4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    public void testNumberMinMonthlySales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long actual = service.numberMinMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    public void testAmountMonthlyLowAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.amountMonthlyLowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    @Test
    public void testAmountMonthlyUpAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.amountMonthlyUpAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
