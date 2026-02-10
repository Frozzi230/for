public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0)
                System.out.println(i);
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i++) {
            if (i % 7 == 0)
                System.out.println(i);
        }

        System.out.println("Задача 7");
        for (int i = 0; i <= 100; i++) {
            double result = Math.pow(2, i);
            if (result <= 512)
                System.out.println(result);
        }

        System.out.println("Задача 8");
        int money = 29000;
        for (int i = 1; i <= 12; i++) {
            if (i != 1)
                money = money * 2;
            switch (i) {
                case 1: {
                    String month = "январь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 2: {
                    String month = "февраль";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 3: {
                    String month = "март";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 4: {
                    String month = "апрель";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 5: {
                    String month = "май";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 6: {
                    String month = "июнь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 7: {
                    String month = "июль";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 8: {
                    String month = "август";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 9: {
                    String month = "сентябрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 10: {
                    String month = "октябрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 11: {
                    String month = "ноябрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
                case 12: {
                    String month = "декабрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
                    break;
                }
            }
        }
        System.out.println("Задача 9");
        int money2 = 29000;
        for (int j = 1; j <= 12; j++) {
            if (j != 1)
                money2 = money2 * 2 + (money2 / 100 * 12);
            switch (j) {
                case 1: {
                    String month = "январь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 2: {
                    String month = "февраль";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 3: {
                    String month = "март";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 4: {
                    String month = "апрель";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 5: {
                    String month = "май";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 6: {
                    String month = "июнь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 7: {
                    String month = "июль";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 8: {
                    String month = "август";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 9: {
                    String month = "сентябрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 10: {
                    String month = "октябрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 11: {
                    String month = "ноябрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
                case 12: {
                    String month = "декабрь";
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
                    break;
                }
            }
        }

        System.out.println("Задача 10");
        int a = 2;
        for (int k = 1; k <= 10; k++)
        {
            int number = a * k;
            System.out.println("2 * " + k + " = " + number);
        }
    }
}
