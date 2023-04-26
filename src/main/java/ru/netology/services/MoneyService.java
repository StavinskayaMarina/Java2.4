package ru.netology.services;

public class MoneyService {
    int income; // доход за месяц
    int expenses; // обязательные траты
    int threshold; // если на счету есть сумма, то выбираем отдых, иначе — работу.

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // кол-во месяцев отдыха
        int money = 0; //сумма на счету
        int mouth = 0;

        for (count = 1; count <= 12; count++) {
            if (threshold <= money) { // можем ли отдыхать?
                mouth++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return mouth;

    }
}


