package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyServiceTest {
    @Test
    public void testWithSalaryMin(){
        MoneyService service = new MoneyService();
        int expected = 3; // ожидаемый
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWithSalaryMax(){
        MoneyService service = new MoneyService();
        int expected = 2; // ожидаемый
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }


}
