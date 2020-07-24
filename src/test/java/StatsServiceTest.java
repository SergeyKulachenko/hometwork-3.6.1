import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void Sum() {                                     //#1
        StatsService servise = new StatsService();
        int exp = 180;
        int act = servise.Sum(data);
        assertEquals(exp, act);
    }
    @Test
    void AverageSum() {                              //2 Среднюю сумму продаж в месяц
        StatsService servise = new StatsService();
        float exp = 15;
        float act = servise.AverageSum(data);
        assertEquals(exp, act);
    }
    @Test
    void NumberMonthsOfMaxSales() {                  //3 Номер месяца, в котором был пик продаж
        StatsService servise = new StatsService();
        String exp = " в 6 в 8 мес.";                 //????????
        String act = String.valueOf(servise.NumberMonthsOfMaxSales(data));
        assertEquals(exp, act);
    }
    @Test
    void NumberMonthsOfMinSales() {                   // 4 Номер месяца, в котором был минимум продаж
        StatsService servise = new StatsService();
        int exp = 9;
        int act = servise.NumberMonthsOfMinSales(data);
        assertEquals(exp, act);
    }
    @Test
    void NumberOfMonthsSalesBelowAverage() {             // 5 Кол-во месяцев, в которых продажи были ниже среднего
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.NumberOfMonthsSalesBelowAverage(data);
        assertEquals(exp, act);
    }
    @Test
    void NumberOfMonthsSalesAboveAverage() {             // 6 Кол-во месяцев, в которых продажи были выше среднего
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.NumberOfMonthsSalesAboveAverage(data);
        assertEquals(exp, act);
    }

}