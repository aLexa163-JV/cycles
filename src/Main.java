public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {

        int targetAmount = 2_459_000;
        int monthlyContribution = 15000;
        double percent = 1D / 100;
        int currentAmount = 0;
        int months = 0;

        while (currentAmount < targetAmount) {
            months++;
            currentAmount += monthlyContribution;
            currentAmount = (int) (currentAmount * (1 + percent));
            System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount);
        }
    }

    public static void task2() {

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int t = 10; t >= 1; t--) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void task3() {

        int population = 12_000_000;
        int birthRate1000 = 17;
        int deathRate1000 = 8;
        int year = 1;
        int yearBirth = population * birthRate1000 / 1000;
        int yearDeath = population * deathRate1000 / 1000;
        int diffPopulation = yearBirth - yearDeath;

        while (year <= 10) {
            population += diffPopulation;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
    }

    public static void task4() {

        int deposit = 15000;
        double percent = 7D / 100;
        int totalCash = deposit;
        int months = 0;

        while (totalCash < 12_000_000) {
            totalCash = (int) (totalCash * (1 + percent));
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalCash);
        }
    }

    public static void task5() {

        int deposit = 15000;
        double percent = 7D / 100;
        int totalCash = deposit;
        int months = 0;

        while (totalCash < 12_000_000) {
            totalCash = (int) (totalCash * (1 + percent));
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + totalCash);
            }
        }
    }

    public static void task6() {

        int deposit = 15000;
        double percent = 7D / 100;
        int totalCash = deposit;
        int totalMonths = 9 * 12;
        int month = 0;

        while (month < totalMonths) {
            totalCash = (int) (totalCash * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalCash);
            }
        }
    }

    public static void task7() {

        int firstFriday = 2;

        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {

        int year = 2024;
        int lastYear = year - 200;
        int futureYear = year + 100;
        for (int i = lastYear; i < futureYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}