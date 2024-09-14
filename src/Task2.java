import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.lang.Exception;

public class Task2 {
    public static void main(String[] args) {


    // БУДЬТЕ ВНИМАТЕЛЬНЫ
    // сначала идут проверки, а потом функции

 //------------------------------------------------------

//1
        try {
            System.out.println(max(8, 8));
            System.out.println(max(6, 2));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
//2
        try {
            System.out.println(delenie(8, 8));
            System.out.println(delenie(6, 0));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
//3
        try {
            System.out.println(convertToInt("8"));
            System.out.println(convertToInt("восемь"));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
//4
        try {
            ageCheck(5);
            ageCheck(150);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//5
        try {
            System.out.println(koren(8));
            System.out.println(koren(-2));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//6
        try {
            System.out.println(factorial(8));
            System.out.println(factorial(-2));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//7
        try {
            zeroCheck(new int[]{1, 2, 3, 4});
            zeroCheck(new int[]{0, 1, 2, 3, 4});
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//8
        try {
            System.out.println(stepen(8, 2));
            System.out.println(stepen(8, -2));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//9
        try {
            System.out.println(obrezStr("кхе, кхе, .. дорогие друзья!", 10));
            System.out.println(obrezStr("спасибо за внимание", 40));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//10
        try {
            System.out.println(findElem(new int[]{1, 2, 3, 4}, 5));
            System.out.println(findElem(new int[]{1, 2, 3, 4}, 4));
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
        }
//11
        try {
            System.out.println(convertToBin(8));
            System.out.println(convertToBin(-8));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//12
        try {
            System.out.println(delimCheck(5, 5));
            System.out.println(delimCheck(5, 0));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
//13
        List<String> list = new ArrayList<>();
        list.add("дед");
        list.add("Терентий");
        list.add("подметает");
        list.add("избушку");
        try {
            System.out.println(readElem(list, 1));
            System.out.println(readElem(list, 10));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
//14
        try {
            passCheck("пароль");
            passCheck("пароль123456");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//15
        try {
            dateCheck("05.09.2005");
            dateCheck("2005.09.05");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//16
        try {
            System.out.println(sumStr("я", "бетмен"));
            System.out.println(sumStr("спайдермен", null));
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
//17
        try {
            System.out.println(ostatokOtDelen(8, 5));
            System.out.println(ostatokOtDelen(8, 0));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
//18
        try {
            System.out.println(coren(8));
            System.out.println(coren(-8));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//19
        try {
            System.out.println(converterOfTemperature(26));
            System.out.println(converterOfTemperature(-600));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
//20
        try {
            checkString("моему счастью нет предела, я наконец закончила :)  ");
            checkString("");
            checkString(null);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

//1. Функция для нахождения максимума
//Напишите функцию, которая принимает два числа и возвращает максимальное из них.
// Если числа равны, выбрасывайте исключение с сообщением об ошибке.

    public static int max(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны");
        }
        return Math.max(a, b);
    }
//2. Калькулятор деления
//Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте
// ArithmeticException с сообщением о недопустимости деления на ноль.

    public static int delenie(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }
//3. Конвертер строк в числа
//Напишите функцию, которая принимает строку и пытается конвертировать её в целое число.
// Если строка не может быть конвертирована, выбрасывайте NumberFormatException.

    public static int convertToInt(String a) {
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Строка не может быть конвертирована");
        }
    }
//4. Проверка возраста
//Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException,
// если возраст меньше нуля или больше 150.

    public static void ageCheck(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст меньше нуля или больше 150");
        }
        System.out.println("Проверка на возраст пройдена");
    }
//5. Нахождение корня
//Реализуйте функцию, которая находит корень из числа. Если число отрицательное,
// выбрасывайте IllegalArgumentException.

    public static double koren(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        }
        return Math.sqrt(a);
    }
//6. Факториал    
//Напишите функцию, которая вычисляет факториал числа. Если число отрицательное,
// выбрасывайте исключение.

    public static double factorial(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        }
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
//7. Проверка массива на нули
//Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули,
// выбрасывайте исключение.

    public static void zeroCheck(int[] arr) {
        for (int elem : arr)       // foreach
        {
            if (elem == 0) {
                throw new IllegalArgumentException("В массиве есть ноль");
            }
        }
        System.out.println("В массиве нет нулей");
    }
//8. Калькулятор возведения в степень
//Реализуйте функцию, которая возводит число в степень. Если степень отрицательная,
// выбрасывайте исключение.

    public static double stepen(double a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Степень отрицательная");
        }
        return Math.pow(a, b);
    }

//9. Обрезка строки
//Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку,
// обрезанную до указанного числа символов. Если число символов больше длины строки,
// выбрасывайте исключение.

    public static String obrezStr(String a, int length) {
        if (length > a.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return a.substring(0, length);
    }

//10. Поиск элемента в массиве
//Напишите функцию, которая ищет элемент в массиве. Если элемент не найден,
// выбрасывайте исключение с сообщением об ошибке.

    public static int findElem(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        throw new NoSuchElementException("Элемент не найден");
    }

//11. Конвертация в двоичную систему
//Создайте функцию, которая конвертирует целое число в двоичную строку.
// Если число отрицательное, выбрасывайте исключение.

    public static String convertToBin(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        }
        return Integer.toBinaryString(a);
    }

//12. Проверка делимости
//Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе.
// Если второе число равно нулю, выбрасывайте ArithmeticException.

    public static boolean delimCheck(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Второе число равно нулю");
        }
        return a % b == 0;
    }


//13. Чтение элемента списка
//Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит
// за пределы списка, выбрасывайте IndexOutOfBoundsException.

    public static <T> T readElem(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }


//14. Парольная проверка
//Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов,
// выбрасывайте исключение WeakPasswordException.

    public static void passCheck(String a) {
        if (a.length() < 8) {
            throw new IllegalArgumentException("Пароль содержит менее 8 символов");
        }
    }


//15. Проверка даты
//Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
// Если формат неверен, выбрасывайте DateTimeParseException.

    public static void dateCheck(String a) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(a, formatter);
        } catch (DateTimeException ex) {
            throw new IllegalArgumentException("формат неверен");
        }
    }


//16. Конкатенация строк
//Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null,
// выбрасывайте NullPointerException.

    public static String sumStr(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException("одна из строк равна null");
        }
        return a + b;
    }


//17. Остаток от деления
//Создайте функцию, которая возвращает остаток от деления двух чисел.
// Если второе число равно нулю, выбрасывайте исключение.


    public static int ostatokOtDelen(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("второе число равно нулю");
        }
        return a % b;
    }

//18. Квадратный корень
//Реализуйте функцию, которая находит квадратный корень числа.
// Если число отрицательное, выбрасывайте исключение.


    public static double coren(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("число отрицательное");
        }
        return Math.sqrt(a);
    }
//19. Конвертер температуры
//Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт.
// Если температура меньше абсолютного нуля, выбрасывайте исключение.


    public static double converterOfTemperature(double a) {
        if (a < -273.15) {
            throw new IllegalArgumentException("температура меньше абсолютного нуля");
        }
        return a * 9 / 5 + 32;
    }

    //20. Проверка строки на пустоту
//Создайте функцию, которая проверяет, является ли строка пустой или null.
// Если строка пустая или равна null, выбрасывайте исключение.
    public static void checkString(String a) {
        if (a == null || a.isEmpty()) {
            throw new IllegalArgumentException("cтрока пустая или равна null");
        }
    }
}

