import java.util.Scanner;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Задача 1: Четное или нечетное число
        //Условие:
        //Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.
        /*System.out.print("Введите число: ");
        int x = in.nextInt();
        if (x %2 == 0){
            System.out.println("чётное");
        }
        else System.out.println("нечётное");*/

        //Задача 2: Минимальное из трех чисел
        //Условие:
        //Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.

        /*int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int min = x;
        if(min > y){
            min = y;}
        if(min > z){
            min = z;}
        System.out.print("минимальное число: "+ min);*/

        //Задача 3: Таблица умножения
        //Условие:
        //Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).

        /*for (int i = 1; i < 11; i++) {
            System.out.println("5 * "+i+ " = "+ i*5);
        }*/

        //Задача 4: Сумма чисел от 1 до N
        //Условие:
        //Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.

        /*int x = in.nextInt();
        int sum = 0;
        for (int i = 0; i < x+1; i++) {
            sum += i;
        }
        System.out.println(sum);*/


        //Задача 5: Число Фибоначчи
        //Условие:
        //Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.

        /*int x = in.nextInt();
        int first = 0;
        int sec = 1;
        int next1 = 0;
        System.out.print(first + " " + sec + " ");
        for (int i = 2; i < x; i++) {
            next1 = first + sec;
            System.out.print(next1 + " ");
            first = sec;
            sec = next1;
        }*/

        //Задача 6: Проверка простого числа
        //Условие:
        //Пользователь вводит целое число. Программа должна проверить, является ли это число
        // простым (делится только на 1 и само на себя).

        /*int x = in.nextInt();
        boolean simpl = true;
        for (int i = 2; i*i <= x; i++) {
            if (x % i == 0) {
                simpl = false;
                break;
            }
        }                           // true     true           false
        System.out.println(simpl ? "простое число" : "не является простым числом");*/


        //Задача 7: Обратный порядок чисел
        //Условие:
        //Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.

        /*int x = in.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(x-i+" ");
        }*/

        //Задача 8: Сумма четных чисел
        //Условие:
        //Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел
        // в диапазоне от A до B (включительно).

        /*int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;}
            }

            System.out.print(sum);*/

        //Задача 9: Реверс строки
        //Условие:
        //Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.

        /*String x = in.nextLine();
        String otv = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            otv += x.charAt(i);
        }
        System.out.println(otv);*/

        //Задача 10: Количество цифр в числе
        //Условие:
        //Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.

        /*int x = in.nextInt();
        int count = 0;
        if (x == 0) {
            count = 1;
        }
        else {
            while (x != 0) {
                x /= 10;
                count++;
            }
        }
        System.out.println(count);*/

        //Задача 11: Факториал числа
        //Условие:
        //Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).

        /*int x = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        System.out.println(fact);*/

        //Задача 12: Сумма цифр числа
        //Условие:
        //Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.

        /*int x = in.nextInt();
        int count = 0;
        while (x != 0) {

            count+= x % 10;
            x /= 10;
        }
        System.out.println(count);*/

        //Задача 13: Палиндром
        //Условие:
        //Пользователь вводит строку. Программа должна проверить,
        // является ли эта строка палиндромом (читается одинаково слева направо и справа налево).

        /*String x = in.nextLine();
        String otv = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            otv += x.charAt(i);
        }
        System.out.println(otv.equals(x)? "это палиндром" : "это НЕ палиндром" );*/


        //Задача 14: Найти максимальное число в массиве
        //Условие:
        //Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести
        // максимальное число в массиве.

        /*int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);*/



        //Задача 15: Сумма всех элементов массива
        //Условие:
        //Пользователь вводит размер массива и его элементы. Программа должна вычислить
        // и вывести сумму всех элементов массива.

        /*int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.stream(arr).sum());*/

        //Задача 16: Количество положительных и отрицательных чисел
        //Условие:
        //Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести
        // количество положительных и отрицательных чисел в массиве.

        /*int size = in.nextInt();
        int pol = 0;
        int otr = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > 0){ pol++;}
            if (arr[i] < 0){ otr++;}
        }
        System.out.println("положительных: "+ pol);
        System.out.println("отрицательных: "+ otr);*/


        //Задача 17: Простые числа в диапазоне
        //Условие:
        //Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).

        /*int a = in.nextInt();
        int b = in.nextInt();
        boolean flag = true;
        for (int i = a; i <= b; i++) {
            if (i <= 1) {
                flag = false;
            }
            for (int n = 2; n <= Math.sqrt(i); n++) {
                if (i % n == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true;
        }*/


        //Задача 18: Подсчет гласных и согласных в строке
        //Условие:
        //Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных
        // и согласных букв в этой строке.


        /*int glasn = 0;
        int sogl = 0;
        String input = in.nextLine().toLowerCase();
        for (char ch : input.toCharArray()) {
            if ("аеёиоуыэюя".indexOf(ch) != -1) {
                glasn++;
            } else if (Character.isLetter(ch)) {
                sogl++;
            }
        }
        System.out.println("Гласных: " + glasn);
        System.out.println("Согласных: " + sogl);*/

        //Задача 19: Перестановка слов в строке
        //Условие:
        //Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести
        // слова в обратном порядке.


        /*String[] words = in.nextLine().split(" ");
        StringBuilder otv = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            otv.append(words[i]).append(" ");
        }
        System.out.println(otv.toString().trim());*/

        //Задача 20: Число Армстронга
        //Условие:
        //Пользователь вводит целое число. Программа должна проверить, является ли это число
        //числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).

        /*int num = in.nextInt();
        int num1 = num;
        int countDigit = String.valueOf(num).length();
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, countDigit);
            num /= 10;
        }
        System.out.println( sum == num1? "Это число Армстронга":"Это НЕ число Армстронга");*/


    }




}
