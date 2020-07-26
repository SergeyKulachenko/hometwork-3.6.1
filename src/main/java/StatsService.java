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

    public String numberMonthsOfMaxSales(int[] data) {    //3 Номер месяца, в котором был пик продаж
        int temp = 0, maxMonth = 0;
        String numberMonth = "";
        for (int month : data) {

            if (maxMonth < month) {
                maxMonth = month;
            }
        }
        for (int month : data) {
            temp++;
            if (maxMonth == month) {
                numberMonth += " в " + String.valueOf(temp);
            }
        }
        numberMonth += " мес.";
        return String.valueOf(numberMonth);
    }

    public int numberMonthsOfMinSales(int[] data) {
        int temp = 0, minMonth = data[0], numberMonth = 1;
        for (int month : data) {
            temp++;
            if (minMonth > month) {
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