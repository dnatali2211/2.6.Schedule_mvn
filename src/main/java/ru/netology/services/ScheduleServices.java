package ru.netology.services;

public class ScheduleServices {
    public int calculate(int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. " + "Потратил -" + expense + ", затем еще -" + ((money - expense) - ((money - expense) / 3)));
                money = (money - expense) / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                System.out.println("Месяц " + month + ". Денег " + money + ". Придется работать. " + "Заработал +" + income + ", потратил -" + expense);
                money = money + income - expense;
            }
        }
        return count;
    }
}
