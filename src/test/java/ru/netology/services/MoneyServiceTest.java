package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MoneyServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/input.csv")
    public void testWithSalaryMin(int expected, int income, int expenses, int threshold) {
        MoneyService service = new MoneyService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
