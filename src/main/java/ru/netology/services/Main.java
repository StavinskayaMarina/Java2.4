package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        MoneyService service = new MoneyService();
        System.out.println(service.calculate(10_000, 3000, 20_000));
    }
}
