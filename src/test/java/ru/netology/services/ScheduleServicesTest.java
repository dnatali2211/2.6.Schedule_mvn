package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleServicesTest {

    @Test
    public void testCalcVacation() {
        ScheduleServices service = new ScheduleServices();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);

        System.out.println();
        {
            expected = 2;
            actual = service.calculate(100_000, 60_000, 150_000);

            Assertions.assertEquals(expected, actual);
        }
    }
}

