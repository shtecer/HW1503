public class Main {
    public static void main(String[] args) {

        int total = 0;
        int zp = 15_000;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + zp;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a);
        }
        System.out.println();
        int b = 10;
        while (b > 0) {
            System.out.print(" " + b);
            b = b - 1;
        }
        System.out.println();


        int population = 12_000_000;
        int c = 0;
        while (c < 10) {
            c = c + 1;
            population = population + (17 * (population/1000)) - (8 * (population/1000));
            System.out.println("Год " + c + ", численность населения составляет " + population);
        }

        int month = 0;
        int savingsAccount = 15_000;
        int deposit = 15_000;
        while (savingsAccount < 12_000_000) {
            month = month + 1;
            savingsAccount = savingsAccount + (savingsAccount / 100 * 7) + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + savingsAccount);
        }

        int month2 = 0;
        int savingsAccount2 = 15_000;
        int deposit2 = 15_000;
        while (savingsAccount2 < 12_000_000) {
            month2 = month2 + 1;
            savingsAccount2 = savingsAccount2 + (savingsAccount2 / 100 * 7) + deposit2;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений составляет " + savingsAccount2);
            }
        }

        int month3 = 0;
        int savingsAccount3 = 15_000;
        int deposit3 = 15_000;
        while (month3 <= 108) {
            month3 = month3 + 1;
            savingsAccount3 = savingsAccount3 + (savingsAccount3 / 100 * 7) + deposit3;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений составляет " + savingsAccount3);
            }
        }

        int firstFriday = 2;
        int day = 1;
        while (day <= 31) {
            if (day == firstFriday || (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
            day = day + 1;
        }

        int startYaer = 2025 - 200;
        int endYear = 2025 + 100;
        for (int n = startYaer; n < endYear; n++) {
            if (n % 79 == 0) {
                System.out.println(n);
            }
        }
    }
}