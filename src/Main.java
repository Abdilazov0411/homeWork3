import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.2, 2.3, -6.7, 1.9, -5.6, -6.7, 8.7, -4.5, -1.3, 1.5, 2.5, -3.4, 9.8, -7.3, -4.3};
        int index = 0;
        int count = 0;
        double sum = 0;

        for (double number : numbers) {
            if (index < 3){
                index++;
                continue;
            }
            sum += number;
            count++;
    }

        if (count>0){
            double average = (double) sum / count;
            System.out.println("Среднее арифметическое положительных чисел: " + (average));
        }else{
            System.out.println("Нет положительных чисел");
        }

    }
}