public class Main {
    public static void main(String[] args) {
        System.out.println ("задание № 1") ;
        int currentMonth = 15000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            total = total + currentMonth;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("задание № 2") ;
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i +" ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i +" ");
        }


        System.out.println("задание №3") ;
        int population = 12000000;
        int birthRate = 1000 / 17;
        int mortality = 1000 / 8;
        for (int y = 1; y <= 10; y++) {
            int births = (int) (population * birthRate);
            int death = (int) (population * mortality);
            population = births - death;
            System.out.println("Год " + y + ", численность населения составляет " + population);
        }


        System.out.println ("задание № 4") ;
        int salary = 15000;
        double total1 = 0;
        int months = 1;
        double percent = 0.07;
        for (; total1 < 12000000; months++) {
            total1 = (int) (total1 + salary);
            total1 = (int) (total1 + total1 * percent);
            System.out.println("Месяц " + months + ", накопления: " + total1);
        }

        System.out.println("задание № 5") ;
        int salary2 = 15000;
        double total2 = 0;
        int months2 = 1;
        double percent2 = 0.07;
        for (; total2 < 12000000; months2++) {
            total2 = (int) (total2 + salary2);
            total2 = (int) (total2 + total2 * percent2);
            if (months2 % 6 == 0) {
                System.out.println("Месяц " + months2 + ", накопления: " + total2);
            }
        }
        System.out.println ("задание № 6") ;
        int salary3 = 15000;
        double total3 = 0;
        int months3 = 1;
        double percent3 = 0.07;
        int yearSpent = 9;
        int monthsSpent = yearSpent * 12;
        for (; months3 <= monthsSpent; months3++) {
            total3 = (int) (total3 + salary3);
            total3 = (int) (total3 + total3 * percent3);
            if (months3 % 6 == 0) {
                System.out.println("Месяц " + months3 + ", накопления: " + total3);
            }

        }
        System.out.println ("задание № 7");
        int firstFriday = 3;
        for (int day = 1; day <= 31; day++) {
            if (day % 7 == firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println ("задание № 8") ;
        int ourTime = 2023;
        int endYear = ourTime + 200;
        int periodStart = ourTime - 200;
        int periodEnd = endYear + 100;
        System.out.println("годы за последние 200 лет, когда появлялась комета");
        for (int j = periodStart; j <= periodEnd; j++) {
            if (j % 79 == 0) {
                System.out.println(j);
                System.out.println("следующий год ее появления (ближайшие 100 лет)." );
            }
        }
    }
}










