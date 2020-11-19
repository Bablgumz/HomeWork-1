package HW1;

public class Main {

    public static void main(String[] args) {

            byte p = 5;
            p++;
            System.out.println(p);

            short f = 10;
            f--;
            System.out.println(f);

            int r = 20;
            r+=2;
            System.out.println(r);

            long g = 30;
            g-=5;
            System.out.println(g);

            float x = 13.456212f;
            System.out.println(x);

            double z = 15.6742427802478;
            System.out.println(z);

            char v = 'C';
            v = '\u0410';
            System.out.println(v);

            }

//          3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат/

        public static float someThink(float a, float b,float c, float d) {
            return a * (b + (c / d));
        }

//        4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
///          (включительно),
//        если да – вернуть true, в противном случае – false.

        public  static boolean inInterval (int a, int b) {
            return (a + b >= 10) && (a + b <= 20);
        }

//        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        public static  void printIsPositiveNumber(int n) {
            if (n >= 0 ){
                    System.out.println("Положительное");
            }else {
                    System.out.println("Отрицательное");
            }
        }

//        6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
//        если число отрицательное, и вернуть false если положительное.

        public  static boolean isNegativeNumber (int n) {
            return n < 0;
        }

//        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        public static void printHelloForName (String name) {
            System.out.println("Привет," + name + " ! ");
        }

//        8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        public static boolean isLeapYear (int year) {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }

        public static void printIsLeapYearV2 (int year) {
            if (isLeapYear(year)) {
                    System.out.println("Год является високосным");
            } else {
                    System.out.println("Год не является високосным");
            }
        }

       }




