package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ScheduleServicesTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/schedule.csv")
    public void testCalcVacation(int expected, int income, int expense, int threshold) {
        ScheduleServices service = new ScheduleServices();
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }
}

