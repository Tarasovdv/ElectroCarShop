package ru.itsjava.electroCarMotors;

public class Sh {
//    public class RestartEnergy {
//        public static void main(String[] args) {
//            System.out.println("\nWelcome to RestartEnergy company!");
//            String cars[] = new String[]{"X_Model", "S_Model", "M_Model", "R_Model"};
//            printMenu();
//            Scanner console = new Scanner(System.in);
//            System.out.println("Введите номер меню: ");
//            int menuNum = console.nextInt();
//            while (true) {
//                if (menuNum == 1) {
//                    printAllCars(cars);
//                } else if (menuNum == 2) {
//                    cars = addCars(console, cars);
//                } else if (menuNum == 3) {
//                    cars = removeCar(console, cars);
//                } else if (menuNum == 4) {
//                    bubbleSort(cars);
//                    printAllCars(cars);
//                } else if (menuNum == 0) {
//                    System.out.println("Thanks!");
//                    System.exit(0);
//                }
//                System.out.println("\nВведите номер меню");
//                menuNum = console.nextInt();
//            }
//        }
//
//        private static String[] removeCar(Scanner console, String[] cars) {
//            System.out.println("Удалить машину:");
//            String inputCar = console.next();
//            String[] resArray = new String[cars.length - 1];
//            int delIndex = 0;
//            for (delIndex = 0; delIndex < cars.length; delIndex++) {
//                if (cars[delIndex].equals(inputCar)) {
//                    break;
//                }
//                resArray[delIndex] = cars[delIndex];
//            }
//            for (int i = delIndex; i < resArray.length; i++) {
//                resArray[i] = cars[i + 1];
//            }
//            return resArray;
//        }
//
//        private static String[] addCars(Scanner console, String[] cars) {
//            System.out.println("Добавить машину:");
//            String inputCar = console.next();
//            String[] resArray = new String[cars.length + 1];
//            for (int i = 0; i < cars.length; i++) {
//                resArray[i] = cars[i];
//            }
//            resArray[cars.length] = inputCar;
//            return resArray;
//        }
//
//        private static void printAllCars(String[] cars) {
//            System.out.println("Вся техника: ");
//            for (int i = 0; i < cars.length; i++) {
//                System.out.print(cars[i] + ", ");
//            }
//        }
//
//        private static void printMenu() {
//            System.out.println("1.Вся техника\n" +
//                    "2.Добавить\n" +
//                    "3.Удалить\n" +
//                    "4.Сортировка\n" +
//                    "0.Выход");
//        }
//
//        private static void bubbleSort(String[] cars) {
//            for (int j = 0; j < cars.length; j++) {
//                for (int i = 0; i < cars.length - j - 1; i++) {
//                    if (cars[i].charAt(0) > cars[i + 1].charAt(0)) {
//                        String temp = cars[i];
//                        cars[i] = cars[i + 1];
//                        cars[i + 1] = temp;
//                    }
//                }
//            }
//        }
//    }
}
