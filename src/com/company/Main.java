package com.company;

import Task1.*;
import Task2.*;
import Task3.DocumentWorker;
import Task3.ExpertDocumentWorker;
import Task3.ProDocumentWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  Task1();
        Task2();
        // Task3();

    }

    private static void Task1() {
        Pupil pupil = new Pupil("Pupil", 0);
        //  System.out.println(pupil.study());
        //  System.out.println(pupil.read());
        //  System.out.println(pupil.write());
        //  System.out.println(pupil.relax());

        System.out.println("\n" + "=========================" + "\n");

        ExcelentPupil excelentPupil = new ExcelentPupil("Vitalik", 17);
        System.out.println(excelentPupil.study());
        System.out.println(excelentPupil.read());
        System.out.println(excelentPupil.write());
        System.out.println(excelentPupil.relax());
        System.out.println("\n" + "=========================" + "\n");

        BadPupil badPupil = new BadPupil("Dima", 11);
        System.out.println(badPupil.study());
        System.out.println(badPupil.read());
        System.out.println(badPupil.write());
        System.out.println(badPupil.relax());
        System.out.println("\n" + "=========================" + "\n");

        GoodPupil goodPupil = new GoodPupil("Ivan", 16);
        System.out.println(goodPupil.study());
        System.out.println(goodPupil.read());
        System.out.println(goodPupil.write());
        System.out.println(goodPupil.relax());
        System.out.println("\n" + "=========================" + "\n");

        DefoultPupil defoultPupil = new DefoultPupil("Aleh", 7);
        System.out.println(defoultPupil.study());
        System.out.println(defoultPupil.read());
        System.out.println(defoultPupil.write());
        System.out.println(defoultPupil.relax());
    }

    private static void Task2() {
        Vehicle vehicle = new Vehicle(0, 0, 0);
        Plane plane = new Plane(1000000, 800, 2019, 10000, 330);
        Ship ship = new Ship(6000000, 60, 2017, 228, "Odessa");
        Car car = new Car(40000, 330, 2009, 5);

        Garage garage = new Garage();
        garage.addVehicle(plane);
        garage.addVehicle(ship);
        garage.addVehicle(car);

        System.out.println(garage);

    }

    private static void Task3() {


        System.out.println("Введите ключ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();

        switch (key) {
            case "exp":
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                expertDocumentWorker.OpenDocument();
                expertDocumentWorker.EditDocument();
                expertDocumentWorker.SaveDocument();
                break;
            case "pro":
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                proDocumentWorker.OpenDocument();
                proDocumentWorker.EditDocument();
                proDocumentWorker.SaveDocument();
                break;
            default:
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.OpenDocument();
                documentWorker.EditDocument();
                documentWorker.SaveDocument();
        }
    }


}