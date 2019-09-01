// Котлин. Домашнее задание 2
// Задача 1 - Профиль.
// Суслопаров Алексей

package ru.netology.profile

import ru.netology.profile.model.Avatar
import ru.netology.profile.model.Profile

fun main() {
    val petrov = Profile(1, "petrov", "Иван", "Петров", "Активен", Avatar())
    val troeuhov = Profile(2, "troeuhov", "Бенедикт", "Троеухов", "Бан", Avatar())
    println("Имя пользователя: ${petrov.fullname}")
    println("Имя пользователя: ${troeuhov.fullname}")
}