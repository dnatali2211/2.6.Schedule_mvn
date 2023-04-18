package ru.netology;

import ru.netology.services.ScheduleServices;

public class Main {
    public static void main(String[] args) {
        ScheduleServices services = new ScheduleServices();

        System.out.println(services.calculate(10_000, 3_000, 20_000));

        System.out.println();

        System.out.println(services.calculate(100_000, 60_000, 150_000));
    }
}