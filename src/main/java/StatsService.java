public class StatsService {
    public int sum(int[] data) {
        int totalSum = 0;
        for (int sum : data) {
            totalSum += sum;
        }
        return totalSum;
    }

    public float averageSum(int[] data) {
        int sum = 0, temp = 0;
        float average = 0;
        for (int b : data) {
            sum += b;
            temp++;
        }
        average = (float) sum / temp;
        return average;
    }

    public int numberMonthsOfMaxSales(int[] data) {    //3 Номер месяца, в котором был пик продаж
        int a = 0, max_month = 0, number_month = 0;
        for (int month : data) {
            a++;
            if (max_month <= month) {
                max_month = month;
                number_month = a;
            }
        }
        return number_month;
    }

    public int numberMonthsOfMinSales(int[] data) {
        int temp = 0, minMonth = data[0], numberMonth = 1;
        for (int month : data) {
            temp++;
            if (minMonth >= month) {
                minMonth = month;
                numberMonth = temp;
            }
        }
        return numberMonth;
    }


    public int numberOfMonthsSalesBelowAverage(int[] data) {           //5
        int sum = 0, temp = 0, numberOfMonths = 0;
        float average = 0;
        for (int b : data) {
            sum += b;
            temp++;
        }
        average = (float) sum / temp;
        for (int b : data) {
            if (b < average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int numberOfMonthsSalesAboveAverage(int[] data) {
        int sum = 0, temp = 0, numberOfMonths = 0;
        float average = 0;
        for (int b : data) {
            sum += b;
            temp++;
        }
        average = (float) sum / temp;
        for (int b : data) {
            if (b > average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}