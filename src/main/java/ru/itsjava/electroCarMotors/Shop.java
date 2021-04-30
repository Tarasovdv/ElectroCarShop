package ru.itsjava.electroCarMotors;

import ru.itsjava.electroCarMotors.cars.Model_S;
import ru.itsjava.electroCarMotors.cars.Model_X;
import ru.itsjava.electroCarMotors.cars.Model_Y;

import java.util.*;

public class Shop {
    private static Object List;

    public static void main(String[] args) {

        Car modelS = new Model_S();
        Car modelX = new Model_X();
        Car modelY = new Model_Y();
        Car roadster = new Car("Tesla", "Roadster", 2021, "USA", 1000, "Black");


        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(modelX);
        cars.add(modelS);
        cars.add(modelY);
        cars.add(roadster);


        welcomeMenu();
        Scanner console = new Scanner(System.in);

        int menuNum = console.nextInt();

        while (true) {
            if (menuNum == 1) {
                printAllCars(cars);

            } else if (menuNum == 2) {
                addCars(console, cars);

            } else if (menuNum == 3) {
                removeCar(console, cars);

            } else if (menuNum == 4) {
                System.out.println("Sort");
                Collections.sort(cars);
                printAllCars(cars);

            } else if (menuNum == 0) {
                System.out.println("Thanks!");
                System.exit(0);
            }
            welcomeMenu();
            menuNum = console.nextInt();
        }

    }

    private static void printAllCars(List<Car> cars) {
        System.out.println("All cars: ");
        for (Object elementCars : cars) {
            System.out.println(elementCars);
        }
    }

    private static void removeCar(Scanner console, List<Car> cars) {
        int count = 0;
        System.out.println("Bye cars: \n_________");
        printAllCars(cars);
        System.out.println("Input model:");
        String inputModel = console.next();
        boolean isContains = isContains(inputModel, cars);
        if (!isContains) {
            System.out.println("No car");

        } else {
            for (Car element : cars) {
                if (element.getModel().equals(inputModel)) {
                    break;
                }
                count++;
            }
            cars.remove(count);
        }
    }

    private static boolean isContains(String inputModel, List<Car> cars) {
        for (Car element : cars) {
            if (element.getModel().equals(inputModel)) {
                return true;
            }
        }
        return false;
    }

    private static List addCars(Scanner console, List<Car> cars) {
        System.out.println("Add cars: \n_________");
        System.out.println("Input firm: ");
        String inputCarFirm = console.next();
        System.out.println("Input model: ");
        String inputCarModel = console.next();
        System.out.println("Input year: ");
        int inputCarYear = console.nextInt();
        System.out.println("Input country: ");
        String inputCarCountry = console.next();
        System.out.println("Input power: ");
        int inputCarPower = console.nextInt();
        System.out.println("Input color: ");
        String inputCarColor = console.next();
        Car car = new Car(inputCarFirm, inputCarModel, inputCarYear, inputCarCountry, inputCarPower, inputCarColor);
        cars.add(car);
        return cars;
    }


    private static void welcomeMenu() {
        System.out.println("Menu: \n" +
                "1-All cars || 2-Add cars || 3-Remove cars || 4-Sort || 0-Exit");
    }
}
