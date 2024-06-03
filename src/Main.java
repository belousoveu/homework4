public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    // Task_1
    public static void task1() {
        byte age = 45;
        String result = "он еще не родился";
        if (age >= 0 && age < 18) {
            result = "он не достиг совершеннолетия, нужно немного подождать";
        } else if (age >= 18) {
            result = "он совершеннолетний";
        }
        System.out.printf("Если возраст человека равен %d, то %s.%n", age, result);
    }
    //End_of Task_1

    // Task_2
    public static void task2() {
        byte temperature = 25;
        String result = "нужно надеть шапку";
        if (temperature >= 5) {
            result = "можно идти без шапки";
        }
        System.out.printf("На улице %d градусов, %s.%n", temperature, result);
    }
    //End_of Task_2

    // Task_3
    public static void task3() {
        float speed = 25.376744f;
        String result = "придется заплатить штраф";
        if (speed <= 60) {
            result = "можно ездить спокойно";
        }
        System.out.printf("Если скорость %.1f км/ч, то %s.%n", speed, result);
    }
    //End_of Task_3

    // Task_4
    public static void task4() {
        byte age = 65;
        char sex = 'M';
        String result;
        if (age < 0) {
            result = "он еще не родился";
        } else if (age <= 2) {
            result = "не нужно никуда ходить. Пусть дома сидит с мамой (или папой)";
        } else if (age <= 6) {
            result = "ему нужно ходить в детский сад";
        } else if (age <= 17) {
            result = "ему нужно ходить в школу";
        } else if (age <= 24) {
            result = "его место в университете";
        } else if ((age >= 65 && sex == 'M') || (age >= 60 && sex == 'F')) {
            result = "уже можно выйти на пенсию";
        } else {
            result = "пора ходить на работу";
        }
        System.out.printf("Если возраст человека равен %d, то %s.%n", age, result);
    }
    //End_of Task_4

    // Task_5
    public static void task5() {
        byte age = 15;
        String result = "нельзя кататься на аттракционе";
        if (age >= 5 && age < 14) {
            result = "можно кататься в сопровождении взрослого";
        } else if (age >= 14) {
            result = "можно кататься самостоятельно";
        }
        System.out.printf("Если возраст ребенка равен %d лет, то %s.%n", age, result);
    }
    //End_of Task_5

    //Task_6
    public static void task6() {
        byte totalRoom = 102;
        byte seatRoom = 60;
        byte standingRoom = (byte) (totalRoom - seatRoom);
        int totalPersons = 75;
        if (totalPersons < 0) {
            System.out.println("Ошибка. Количество пассажиров не может быть отрицательным");
        } else if (totalPersons < 60) {
            System.out.println("Вагон почти пустой. Осталось еще " + (seatRoom - totalPersons) +
                    " сидячих мест(а) и " + standingRoom + " мест(а) для стоящих пассажиров.");
        } else if (totalPersons == 60) {
            System.out.println("Все сидячие места заняты, но еще есть "
                    + standingRoom + " мест(а) для стоящих пассажиров.");
        } else if (totalPersons < totalRoom) {
            System.out.println("Вагон почти заполнен, осталось всего "
                    + (totalRoom - totalPersons) + " мест(а) для стоящих пассажиров.");
        } else if (totalPersons == totalRoom) {
            System.out.println("Вагон полностью заполнен. Свободных мест нет.");
        } else {
            System.out.println("Вагон переполнен. " + (totalPersons - totalRoom) +
                    " пассажирам не хватило места.");
        }
    }
    //End_of_Task_6

    //Task7
    public static void task7() {
    int a=112;
    int b=378;
    int c=256;
    int max=a;
    if(max<b||max<c) {
        if (b>=c) {
            max=b;
        } else {
            max=c;
        }
    }
        System.out.printf("Из трех чисел %d, %d, %d максимальное %d.%n",a,b,c,max);
    }
    //End_of_Task7
}
