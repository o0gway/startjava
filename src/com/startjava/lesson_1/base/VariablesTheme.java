package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n\t\tЗадачки на тему");
        System.out.println("\t“Переменные: примитивные типы данных”");

        // Вывод значений переменных на консоль
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte numCpu = 1;
        short numCores = 12;
        int sizeRam = 16_271_176;
        long sizeSsd = 220_554_056L;
        float frequencyCpu = 2.4F;
        double sizeHdd = 1_441_013_740;
        char seriesLaptop = 'A';
        boolean isLinux = true;
        System.out.println("Количество процессоров у компьютера: " + numCpu);
        System.out.println("Количество ядер у компьютера: " + numCores);
        System.out.println("Размер оперативной памяти у компьютера: " + sizeRam);
        System.out.println("Объём SSD у компьютера: " + sizeSsd);
        System.out.println("Частота процессора у компьютера: " + frequencyCpu);
        System.out.println("Объём HDD у компьютера: " + sizeHdd);
        System.out.println("Серия компьютера: " + seriesLaptop);
        System.out.println("Операционная система Linux?: " + isLinux);

        // Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int sumDiscount = (penPrice + bookPrice) / 100 * discount;
        System.out.println("Общая сумма скидки: " + sumDiscount);
        int discountPrice = penPrice + bookPrice - sumDiscount;
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        // Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("""
                   J    a  v     v  a                                                  
                   J   a a  v   v  a a                                                 
                J  J  aaaaa  V V  aaaaa                                                
                 JJ  a     a  V  a     a
                """);

        // Вывод min и max значений целых числовых типов
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;
        System.out.println("***Byte***\nПервоначальное значение: " + numByte);
        System.out.println("Значение после инкремента: " + ++numByte);
        System.out.println("Значение после декремента: " + --numByte);
        System.out.println("***Short***\nПервоначальное значение: " + numShort);
        System.out.println("Значение после инкремента: " + ++numShort);
        System.out.println("Значение после декремента: " + --numShort);
        System.out.println("***Int***\nПервоначальное значение: " + numInt);
        System.out.println("Значение после инкремента: " + ++numInt);
        System.out.println("Значение после декремента: " + --numInt);
        System.out.println("***Long***\nПервоначальное значение: " + numLong);
        System.out.println("Значение после инкремента: " + ++numLong);
        System.out.println("Значение после декремента: " + --numLong);

        // Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("***С помощью третьей переменной***");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходное значение первой переменной: " + num1);
        System.out.println("Исходное значение второй переменной: " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Значение первой переменной после: " + num1);
        System.out.println("Значение второй переменной после: " + num2);
        System.out.println("***С помощью арифметических операций***");
        System.out.println("Исходное значение первой переменной: " + num1);
        System.out.println("Исходное значение второй переменной: " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Значение первой переменной после: " + num1);
        System.out.println("Значение второй переменной после: " + num2);
        System.out.println("***С помощью побитовой операции ^***");
        System.out.println("Исходное значение первой переменной: " + num1);
        System.out.println("Исходное значение второй переменной: " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Значение первой переменной после: " + num1);
        System.out.println("Значение второй переменной после: " + num2);

        // Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        // 35, 38, 64, 94, 95
        char lattice = '#';
        char ampersand = '&';
        char at = '@';
        char cap = '^';
        char undersore = '_';
        System.out.println("Код символа\tСимвол из ASCII-таблицы");
        System.out.printf("%s%15s\n", (int) lattice, lattice);
        System.out.printf("%s%15s\n", (int) ampersand, ampersand);
        System.out.printf("%s%15s\n", (int) at, at);
        System.out.printf("%s%15s\n", (int) cap, cap);
        System.out.printf("%s%15s\n", (int) undersore, undersore);

        //Вывод количества сотен, десятков и единиц числа
        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 987;
        System.out.printf("Число %s содержит:\n", srcNum);
        System.out.printf("%d сотен\n", srcNum / 100 % 10);
        System.out.printf("%d десятков\n", srcNum / 10 % 10);
        System.out.printf("%d единиц\n", srcNum % 10);

        // Вывод в консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char roundBracketLeft = '(';
        char roundBracketRight = ')';
        System.out.printf("    %s%s\n", slash, backSlash);
        System.out.printf("   %s  %s\n", slash, backSlash);
        System.out.printf("  %s%s%s %s%s\n", slash, undersore, roundBracketLeft, roundBracketRight, backSlash);
        System.out.printf(" %s      %s\n", slash, backSlash);
        System.out.printf("%s%s%s%s%s%s%s%s%s%s\n", slash, 
                undersore, undersore, undersore, undersore,
                slash, backSlash,
                undersore, undersore, backSlash);

        // Вывод произведения и суммы цифр числа
        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        srcNum = 345;
        int ones = srcNum % 10;
        int tens = srcNum / 10 % 10;
        int hundreds = srcNum / 100 % 10;
        System.out.printf("Сумма цифр числа %d = %d\n", srcNum, (ones + tens + hundreds));
        System.out.printf("Произведение цифр числа %d = %d\n", srcNum, (ones * tens * hundreds));

        // Вывод времени
        System.out.println("\n10. Вывод времени");
        int totalSeconds = 86399;
        int second = 86399 % 60;
        int minute = (86399 / 60) % 60;
        int hour = 86399 / 3600;
        System.out.printf("%d:%d:%d\n", hour, minute, second);
    }
}