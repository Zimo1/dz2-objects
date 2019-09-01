package ru.netology.profile.model

class Profile (
    val id: Long,
    val login: String,
    val name: String,
    val surname: String,
    var status: String,
    var avatar: Avatar)
{
    val fullname: String
    get() = "$name $surname"
}