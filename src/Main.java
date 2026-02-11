public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i++) {
            if (i % 7 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 7");
        for (int i = 0; i <= 100; i++) {
            double result = Math.pow(2, i);
            if (result <= 512)
                System.out.print(result + " ");
        }

        System.out.println();

        System.out.println("Задача 8");
        int money = 29000;
        String month = " ";
        for (int i = 1; i <= 12; i++) {
            if (i != 1)
                money = money + 29000;
            switch (i) {
                case 1: {
                    month = "январь";
                    break;
                }
                case 2: {
                    month = "февраль";
                    break;
                }
                case 3: {
                    month = "март";
                    break;
                }
                case 4: {
                    month = "апрель";
                    break;
                }
                case 5: {
                    month = "май";
                    break;
                }
                case 6: {
                    month = "июнь";
                    break;
                }
                case 7: {
                    month = "июль";
                    break;
                }
                case 8: {
                    month = "август";
                    break;
                }
                case 9: {
                    month = "сентябрь";
                    break;
                }
                case 10: {
                    month = "октябрь";
                    break;
                }
                case 11: {
                    month = "ноябрь";
                    break;
                }
                case 12: {
                    month = "декабрь";
                    break;
                }
            }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }
        System.out.println("Задача 9");
        int money2 = 29000;
        for (int j = 1; j <= 12; j++) {
            if (j != 1)
                money2 = money2 + 29000 + (money2 / 100 * 12);
            switch (j) {
                case 1: {
                    month = "январь";
                    break;
                }
                case 2: {
                    month = "февраль";
                    break;
                }
                case 3: {
                    month = "март";
                    break;
                }
                case 4: {
                    month = "апрель";
                    break;
                }
                case 5: {
                    month = "май";
                    break;
                }
                case 6: {
                    month = "июнь";
                    break;
                }
                case 7: {
                    month = "июль";
                    break;
                }
                case 8: {
                    month = "август";
                    break;
                }
                case 9: {
                    month = "сентябрь";
                    break;
                }
                case 10: {
                    month = "октябрь";
                    break;
                }
                case 11: {
                    month = "ноябрь";
                    break;
                }
                case 12: {
                    month = "декабрь";
                    break;
                }
            }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money2 + " рублей");
        }

        System.out.println("Задача 10");
        int a = 2;
        for (int k = 1; k <= 10; k++) {
            int number = a * k;
            System.out.println("2 * " + k + " = " + number);

        }
    }
}
