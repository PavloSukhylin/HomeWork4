import java.util.Random;

public class massive_operations {

    public static void main(String[] args) {
     int[] array =  new int[400];
     int sum = 0, average = 0;
    double sgeom = 1;
    int quantity = array.length;
     Random random = new Random();
        for (int i = 0; i <= quantity - 1 ; i++) {
             array[i] = random.nextInt(100);
             if( array[i] == 0) {                              //уменьшаем вероятность нулевых компонентов массива
                 array[i] = random.nextInt(100);        // просто, чобы среднегеом было ненулевым
             }
             sum = sum + array[i];
             sgeom = sgeom * Math.sqrt(Math.abs(array[i]));
        }
        System.out.println("Среднеарифметическое значение массива = " + sum/quantity);
        System.out.println("Среднегеометрическое значение массива = " + sgeom );

        //задание 2 найти все простые числ массива

        int[] simple_number = new int[1000];
        int lenght2 = simple_number.length;
        int counter = 1000;
        Random random2 = new Random();

        for (int i = 0; i < lenght2 - 1; i++){
            simple_number[i] = random2.nextInt(1000);
            for (int j = 2; j < simple_number[i]- 1; j++) { // задаем кличество делителей от 2 до числа-1
                if ( simple_number[i] % j == 0){             //проверяем остаток от деления. Если =0 -число
                    counter = counter - 1;                  //не является простым

                } break;                                   // выходим из цикла, т.к. число массива не явл. простым

            }
        }
        System.out.println("В образованном массиве находится " + counter + " простых чисел");


               // Задание 3 проверка на присутствие составных чисел в массиве

         int[] composite_number = new int[1000];
         int lenght = composite_number.length;
         int composite_counter = 0, i = 0;
         Random random3 = new Random();
         while (i < lenght - 1 ){
              composite_number[i] = random3.nextInt(500);
            for (int j = 2; j < composite_number[i] - 1; j++) { // задаем кличество делителей от 2 до числа-1
                if (composite_number[i] % j == 0) {             //проверяем остаток от деления. Если =0 -число
                    composite_counter = composite_counter + 1;                  //считаем составным
                }
                break;                                          // выходим из цикла, т.к. число массива составное
            }i++;
        }
         System.out.println("В массиве находится " + composite_counter + " составных чисел");

           //задание 4 массив 2000 элементов, все четные в '0'
        int[] parity_number0 = new int[2000];
        int lenght4 = parity_number0.length;
        Random random4 = new Random();
        for (int j = 0; j < lenght4-1; j++) {
            parity_number0[j] = random4.nextInt(500);
            if(parity_number0[j] % 2 ==0){
                parity_number0[j] = 0;
            }

        } System.out.println("Массив с зануленными четными числами создан");

        // задание 5 отсортировать массив(1000) в обратном порядке методом вставки

        int[] insertion_sort_mas = new int[1000];
        int lenght5 = insertion_sort_mas.length;
        Random random5 = new Random();
        for (int j = 0; j < lenght5 -1; j++) {
            insertion_sort_mas[j] = random5.nextInt(500);
        }
        for (int j = 1; j < lenght5 ; j++) {
            int temp = insertion_sort_mas[j];
            int k = j - 1;
            while((k > -1) && (insertion_sort_mas[k] < temp)){
                insertion_sort_mas[k+1] = insertion_sort_mas[k];
                k--;
            }
            insertion_sort_mas[k+1] = temp;
        }
    }

}
