import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sum() {                                     //#1
        StatsService servise = new StatsService();
        int exp = 180;
        int act = servise.sum(data);
        assertEquals(exp, act);
    }

    @Test
    void sverageSum() {                              //2 Среднюю сумму продаж в месяц
        StatsService servise = new StatsService();
        float exp = 15;
        float act = servise.averageSum(data);
        assertEquals(exp, act);
    }

    @Test
    void numberMonthsOfMaxSales() {                  //3 Номер месяца, в котором был пик продаж
        StatsService servise = new StatsService();
        int exp = 8;
        int act = servise.numberMonthsOfMaxSales(data);
        assertEquals(exp, act);
    }

    @Test
    void numberMonthsOfMinSales() {                   // 4 Номер месяца, в котором был минимум продаж
        StatsService servise = new StatsService();
        int exp = 9;
        int act = servise.numberMonthsOfMinSales(data);
        assertEquals(exp, act);
    }

    @Test
    void numberOfMonthsSalesBelowAverage() {             // 5 Кол-во месяцев, в которых продажи были ниже среднего
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.numberOfMonthsSalesBelowAverage(data);
        assertEquals(exp, act);
    }

    @Test
    void numberOfMonthsSalesAboveAverage() {             // 6 Кол-во месяцев, в которых продажи были выше среднего
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.numberOfMonthsSalesAboveAverage(data);
        assertEquals(exp, act);
    }

}