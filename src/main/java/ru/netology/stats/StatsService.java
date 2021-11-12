package ru.netology.stats;

public class StatsService {
        public int calculateSum(int[] sales) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;

            }
            return sum;
        }

        public int averageAmount(int[] sales) {
            return calculateSum(sales) / sales.length;
        }

        public int maxSales(int[] sales) {
            int maxMonth = 0;
            int month = 0;
            for (int sale : sales) {
                if (sale >= sales [maxMonth]) {
                    maxMonth = month;
                }
                    month = month + 1;
            }
            return maxMonth + 1;
        }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше

        }
        return minMonth + 1;
    }
    public int belowAverageSales(int[] sales) {
        int numberMonth = 0;
        int average = averageAmount(sales);
        for (int sale : sales) {

            if (sales[numberMonth] < average) {
                numberMonth++;
            }

        }
        return numberMonth + 1;
    }

    }
       // 1.Сумму всех продаж +
     //   2.Среднюю сумму продаж в месяц+
      //  3.Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*+
       // 4.Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*+
      //  5.Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
       // 6.Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

