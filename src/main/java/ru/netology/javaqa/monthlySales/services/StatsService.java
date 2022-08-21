package ru.netology.javaqa.monthlySales.services;

public class StatsService {

    //  1. Сумма всех продаж
    public long allSumMonthlySales(long[] sales) {
        long sumAllSales = 0;

        for (int month = 0; month < sales.length; month++) {
            sumAllSales += sales[month];
        }
        return sumAllSales;
    }

    //  2. Средняя сумма продаж в месяц
    public long averageSumAllMonthlySales(long[] sales) {

        long sumAverageAllSales = allSumMonthlySales(sales) / sales.length;

        return sumAverageAllSales;
    }

    //  3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int numberPeakMonthlySales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int numberMinMonthlySales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    public int amountMonthlyLowAverageSales(long[] sales) {
        long sumAverageAllSales = averageSumAllMonthlySales(sales);
        int countMonthLow = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < sumAverageAllSales) {
                countMonthLow += 1;
            }
            month += 1;
        }
        return countMonthLow;
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    public int amountMonthlyUpAverageSales(long[] sales) {
        long sumAverageAllSales = averageSumAllMonthlySales(sales);
        int countMonthUp = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sumAverageAllSales) {
                countMonthUp += 1;
            }
            month += 1;
        }
        return countMonthUp;
    }
}
