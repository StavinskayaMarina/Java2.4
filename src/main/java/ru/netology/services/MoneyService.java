package ru.netology.services;

public class MoneyService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // кол-во месяцев отдыха
        int money = 0; //сумма на счету
        int month = 0;

        for (count = 1; count <= 12; count++) {
            if (threshold <= money) {
                month++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return month;

    }
}


