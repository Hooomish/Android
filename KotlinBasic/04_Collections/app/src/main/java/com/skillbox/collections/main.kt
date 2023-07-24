package com.skillbox.collections

fun main() {
    print("Введите количество номеров телефонов: ")
    val count = readln().toIntOrNull()

    if(count == null) {
        print("Вы не ввели количество номеров телефонов!")

        return
    }

    val phoneNumberList = getPhoneNumbers(count)
    val filteredPhoneNumbers = phoneNumberList.filter { it.startsWith("+7") }
    filteredPhoneNumbers.forEachIndexed  {index, element -> println("$index. $element")}

    val uniquePhoneNumbers = phoneNumberList.toSet()
    println("Количество уникальных номеров: ${uniquePhoneNumbers.size}")
    uniquePhoneNumbers.forEachIndexed {index, element -> println("$index. $element") }

    val sumOfPhoneLengths = phoneNumberList.sumBy { it.length }
    println("Сумма длин всех номеров телефонов: $sumOfPhoneLengths")

    val contactsWithNameAndPhone = getContactsWithNameAndPhone(uniquePhoneNumbers)
    contactsWithNameAndPhone.forEach { println("Человек: ${it.value}. Номер телефона: ${it.key}") }
}

fun getPhoneNumbers (count: Int) :MutableList<String> {
    var phoneNumberList = mutableListOf<String>()

    for (n in 1..count) {
        print("Введите номер телефона: ")
        val phoneNumber = readln()

        if(phoneNumber.isNotEmpty())
            phoneNumberList.add(phoneNumber)
    }

    return phoneNumberList
}

fun getContactsWithNameAndPhone(phoneNumbers: Set<String>) : Map<String, String>{
    var contacts = mutableMapOf<String, String>()

    phoneNumbers.forEach{
        print("Введите имя человека с номеров телефона $it: ")
        val name = readln()

        if(name.isNotEmpty())
            contacts[it] = name
    }

    return contacts
}