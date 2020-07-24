public class StatsService {
    public int Sum(int[] data) {
        int total_sum = 0;
        for (int sum : data) {
            total_sum += sum;
        }
        return total_sum;
    }

    public float AverageSum(int[] data) {
        int sum = 0, a = 0;
        float average = 0;
        for (int b : data) {
            sum += b;
            a++;
        }
        average = (float) sum / a;
        return average;
    }

    public String NumberMonthsOfMaxSales(int[] data) {    //3 Номер месяца, в котором был пик продаж
        int a = 0, max_month = 0, number_month_2 = 0;
        String number_month = "";
        for (int month : data) {

            if (max_month < month) {
                max_month = month;
                                // number_month = "В " + String.valueOf(a); //String b = String.valueOf(a);
            }
        }
        for (int month:data){
            a++;
            if (max_month == month){
                number_month += " в " + String.valueOf(a);
            }
        }
        number_month += " мес.";
        return String.valueOf(number_month);
    }
//    public int NumberMonthsOfMaxSales(int[] data) {    //3 Номер месяца, в котором был пик продаж
//        int a = 0, max_month = 0, number_month = 0;
//        for (int month : data) {
//            a++;
//            if (max_month < month) {
//                max_month = month;
//                number_month = a;
//            }
//        }
//        return number_month;
//    }

    public int NumberMonthsOfMinSales(int[] data) {
        int a = 0, min_month = data[0], number_month = 1;
        for (int month : data) {
            a++;
            if (min_month > month) {
                min_month = month;
                number_month = a;
            }
        }
        return number_month;
    }

    public int NumberOfMonthsSalesBelowAverage(int[] data) {           //5
        int sum = 0, a = 0, number_of_months = 0;
        float average = 0;
        for (int b : data) {
            sum += b;
            a++;
        }
        average = (float) sum / a;
        for (int b : data) {
            if (b < average) {
                number_of_months++;
            }
        }
        return number_of_months;
    }

    public int NumberOfMonthsSalesAboveAverage(int[] data) {
        int sum = 0, a = 0, number_of_months = 0;
        float average = 0;
        for (int b : data) {
            sum += b;
            a++;
        }
        average = (float) sum / a;
        for (int b : data) {
            if (b > average) {
                number_of_months++;
            }
        }
        return number_of_months;
    }
}