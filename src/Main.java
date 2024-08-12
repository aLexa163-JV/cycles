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
        task9();
        task10();
    }

    public static void task1(){

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void task2(){

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }

    public static void  task3(){

        for (int i = 0; i < 17; i = i + 2){
            System.out.println(i);
        }
    }

    public static void task4(){

        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
    }

    public static void task5(){

        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6(){

        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }
    }

    public static void task7(){

        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
    }

    public static void task8(){

        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9(){

        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10(){

        int number = 0;
        for (int i = 1; i <= 10; i++){
            number = number + 2;
            System.out.println("2*" + i + "=" + number);
        }
    }
}