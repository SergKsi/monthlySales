import ru.netology.javaqa.monthlySales.services.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.print("sales = {");
        for (int i = 0; i < sales.length; i++) {
            System.out.print(" " + sales[i]);
        }
        System.out.println(" }");

        //  1. Сумма всех продаж
        StatsService service = new StatsService();
        long sumAllSales = service.allSumMonthlySales(sales);
        System.out.println("1. sumAllSales = " + sumAllSales);

        //  2. Средняя сумма продаж в месяц
        long sumAverageAllSales = service.averageSumAllMonthlySales(sales);
        System.out.println("2. sumAverageAllSales = " + sumAverageAllSales);

        //  3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
        int maxMonth = service.numberPeakMonthlySales(sales);
        System.out.println("3. maxMonth = " + maxMonth);

        // 4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
        long minMonth = service.numberMinMonthlySales(sales);
        System.out.println("4. minMonth = " + minMonth);

        // 5. Кол-во месяцев, в которых продажи были ниже среднего
        int countMonthLow = service.amountMonthlyLowAverageSales(sales);
        System.out.println("5. countMonthLow = " + countMonthLow);

        // 6. Кол-во месяцев, в которых продажи были выше среднего
        int countMonthUp = service.amountMonthlyUpAverageSales(sales);
        System.out.println("6. countMonthUp = " + countMonthUp);
    }

}
