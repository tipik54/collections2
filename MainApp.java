package ru.kaznu.ruslan.collections2;

//        Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
//
//        Метод add() должен позволять добавлять запись имя-телефон;
//
//        Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
//
//        Под одним именем может быть несколько телефонов (в случае однофамильцев,
//        или наличии у одного человека нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;
//
//        Метод containsPhoneNumber должен проверять наличие телефона в справочнике.

import java.util.HashMap;
import java.util.List;


public class MainApp {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> personsPhones = new HashMap<>();
        PhoneBook.add(personsPhones, "Ruslan", 616161, 54619816);
        PhoneBook.add(personsPhones, "Ruslan", 949849419, 641587878);
        PhoneBook.add(personsPhones, "Beksultan", 888749, 84845);
        PhoneBook.add(personsPhones, "Beksultan", 214178, 355919);
        PhoneBook.add(personsPhones, "Dias", 8877412, 2223365);
        PhoneBook.add(personsPhones, "Dias", 1112548, 44455897);


        PhoneBook.info(personsPhones);
        System.out.println(PhoneBook.findPerson(personsPhones, "Ruslan"));
        System.out.println(PhoneBook.containsPhoneNumber(personsPhones, 54619816));
    }
}

