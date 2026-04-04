package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BoxWithoutGenerics box = new BoxWithoutGenerics();


//        String cos = (String) box.getValue();
//        System.out.println(cos);


        System.out.println("Liczba w boxie: " + box.getValue());

        Box<String> box2 = new Box<>();
        box2.setValue("tekst");
        String tekst = box2.getValue();
        System.out.println(tekst);

        Box<Integer> box3 = new Box<>();
        box3.setValue(123);
        Integer liczba = box3.getValue();
        System.out.println(liczba);

        Ozdoba bombka = new Ozdoba("Bombka");
        Box<Ozdoba> boxOzdoba = new Box<>();
        boxOzdoba.setValue(bombka);
        System.out.println(boxOzdoba.getValue());

        System.out.println("---------------------------");

        String[] names = {"Adix", "Monika", "Maciej"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        Double[] prices = {19.99, 29.99, 59.99};

        printGenericArray(names);
        printGenericArray(numbers);
        printGenericArray(prices);

        System.out.println("---------------------------");

        List<String> namesList = List.of("Ala", "Ola", "Ela");
        List<Integer> numbersList = List.of(10, 20, 30);
        List<Double> pricesList = List.of(1.5, 2.5, 3.5);

        printAnyList(namesList);
        printAnyList(numbersList);
        printNumbers(numbersList);
        printNumbers(pricesList);

        List<Number> numberBox = new ArrayList<>();
        addIntegers(numberBox);
        System.out.println(numberBox);

        // WAZNE- TO BYŁBY ANTYPATTERN, NIE ROBIMY TAK:

        // static void printGenericArray(Object[] array) {
        //        for (Object o : array) {
        //            System.out.println(o);

        // OBJECT TO KLASA ZBYT OGOLNA A NA PROJEKCIE ZABILI BY ZA TO
//-----------------------------------------------------------------------

//    Zadanie 1
//-------------------------------------------------------------
//Napisz metodę, która przyjmuje jedną wartość dowolnego typu i zwraca ją bez zmian.
//
//Sprawdź działanie metody dla:
//napisu
//liczby całkowitej
//liczby zmiennoprzecinkowej

//Zadanie 2
//-------------------------------------------------------------
//Stwórz klasę, która przechowuje jedną wartość dowolnego typu.
//
//Wymagania:
//klasa ma mieć jedno pole
//ma mieć konstruktor
//ma mieć metodę getValue(), która zwraca tę wartość
//
//Sprawdź działanie klasy dla:
//String
//Integer

//Zadanie 3
//-------------------------------------------------------------
//Napisz metodę, która przyjmuje listę dowolnego typu i wypisuje wszystkie jej elementy.
//
//Sprawdź działanie dla:
//listy napisów
//listy liczb

//Zadanie 4
//-------------------------------------------------------------
//Napisz metodę, która przyjmuje listę dowolnego typu i zwraca jej pierwszy element.
//
//Sprawdź działanie dla:
//listy napisów
//listy liczb

//Zadanie 5
//-------------------------------------------------------------
//Stwórz klasę, która przechowuje wiele elementów jednego typu.
//
//Wymagania:
//wewnątrz ma używać listy
//ma mieć metodę add(), która dodaje element
//ma mieć metodę printAll(), która wypisuje wszystkie elementy
//
//Sprawdź działanie klasy dla:
//napisów
//liczb

        System.out.println("Zadanie 1");
        System.out.println(getAnyValue("abc"));
        System.out.println(getAnyValue(150));
        System.out.println(getAnyValue(99.99));

        System.out.println("Zadanie 2");
        MySystem mySystem = new MySystem<>("NazwaSystemu");
        System.out.println(mySystem.getValue());

        MySystem systemId = new MySystem<>(1224);
        System.out.println(systemId.getValue());


        System.out.println("Zadanie 3");
        List<Integer> numerki = List.of(2, 3, 4, 5);
        List<String> imiona = List.of("Ala", "Ala", "Ola", "Ela");
        printAnyList2(imiona);
        printAnyList2(numerki);

        System.out.println("Zadanie 4");
        System.out.println(getFirstElement(imiona));
        System.out.println(getFirstElement(numerki));

        System.out.println("Zadanie 5");
        Checklist<String> checkStrings = new Checklist<>();
        checkStrings.addElement("Mariola");
        checkStrings.addElement("Wiola");
        checkStrings.addElement("Topola");
        checkStrings.printAllElements();

        Checklist<Integer> checkIntegers = new Checklist<>();
        checkIntegers.addElement(1);
        checkIntegers.addElement(2);
        checkIntegers.addElement(3);
        checkIntegers.printAllElements();

        //Zadanie 1 – metoda z dwoma typami
        //
        //Napisz metodę, która przyjmuje:
        //
        //dowolną wartość,
        //dowolny drugi typ (np. opis),
        //
        //i zwraca tekst w formie:
        //wartość + " (" + opis + ")"
        //
        //Sprawdź dla:
        //
        //liczby + String
        //String + liczby
        //
        //Cel: ogarnąć, że metoda może mieć więcej niż jeden typ generyczny.
        System.out.println("Zadanie 6");
        System.out.println(nameAndValue("Mysza", 123));
        System.out.println(nameAndValue(123, "Mysz"));


        //Zadanie 2 – porównanie dwóch wartości
        //
        //Napisz metodę, która:
        //
        //przyjmuje dwie wartości tego samego typu,
        //sprawdza czy są równe,
        //zwraca true albo false.
        //
        //Sprawdź dla:
        //
        //String
        //Integer
        //
        //Cel: utrwalić, że jeden typ generyczny oznacza „oba muszą być tego samego typu”.
        System.out.println("Zadanie 7");

        System.out.println(compare(123, 123));
        System.out.println(compare("123", 123));
        System.out.println(compare("Ania", "Ania"));
        System.out.println(compare("Ania  ", "Ania"));

        //Zadanie 3 – ostatni element listy
        //
        //Napisz metodę, która:
        //
        //przyjmuje listę dowolnego typu,
        //zwraca ostatni element.
        //
        //Sprawdź dla:
        //
        //listy Stringów
        //listy liczb
        //
        //Cel: operacje na liście + generyk.
        System.out.println("Zadanie 8");
        // List<Integer> numerki = List.of(1, 2, 3, 4, 5);
        // List<String> imiona = List.of("Ala", "Ola", "Ela");
        System.out.println(theLastElement(numerki));
        System.out.println(theLastElement(imiona));

        //Zadanie 4 – klasa z dwoma polami różnych typów
        //
        //Stwórz klasę, która:
        //
        //przechowuje dwie wartości różnych typów (np. coś jak para),
        //ma konstruktor,
        //ma dwie metody do pobierania tych wartości.
        //
        //Sprawdź dla:
        //
        //String + Integer
        //String + Double
        //
        //Cel: generyki w klasie z więcej niż jednym typem.
        System.out.println("Zadanie 9");
        Animal<String, Integer> kot = new Animal<>("Kot", 1000);
        System.out.println(kot.getValue() + " " + kot.getValue2());

        Animal<Integer, String> pies = new Animal<>(2, "Psy");
        System.out.println(pies.getValue() + " " + pies.getValue2());

        Animal<String, Double> papuga = new Animal<>("Papuga", 156.55);
        System.out.println(papuga.getValue() + " " + papuga.getValue2());

        //Zadanie 5 – filtrowanie listy (proste logiczne)
        //
        //Napisz metodę, która:
        //
        //przyjmuje listę dowolnego typu,
        //oraz jedną wartość,
        //wypisuje tylko te elementy z listy, które są równe tej wartości.
        //
        //Sprawdź dla:
        //
        //listy Stringów
        //listy Integerów
        //
        //Cel: użycie .equals() w generykach + praca na elementach.
        System.out.println("Zadanie 10");

        equalsElementFromList(numerki, 1);
        equalsElementFromList(imiona, "Ala");

        //Zadanie 1 — magazyn jednego typu produktów
        //
        //Stwórz klasę, która działa jak prosty magazyn dla jednego typu danych.
        //
        //Założenie:
        //magazyn ma przechowywać wiele elementów jednego typu, np. tylko nazwy części albo tylko numery OEM albo tylko ceny.
        //
        //Wymagania:
        //
        //wewnątrz ma być lista
        //ma być metoda dodająca element
        //ma być metoda wypisująca wszystkie elementy
        //ma być metoda zwracająca liczbę elementów
        //ma być metoda zwracająca ostatni dodany element
        //
        //Sprawdź działanie dla:
        //
        //magazynu napisów, np. nazwy części
        //magazynu liczb, np. numery identyfikacyjne
        //
        //Na co uważać:
        //
        //co ma się stać, jeśli magazyn jest pusty i chcesz pobrać ostatni element
        //nie używaj raw type
        //klasa ma być generyczna, nie osobna dla String i osobna dla Integer
        //
        //To zadanie uczy:
        //
        //generycznej klasy
        //pracy na liście
        //zwracania wartości zamiast samego wypisywania
        //myślenia „jedna klasa, wiele zastosowań”
        System.out.println("Zadanie 11");

        Warehouse<String> nameOfProducts = new Warehouse<>();
        nameOfProducts.addElement("Cegła");
        nameOfProducts.addElement("Pustak");
        nameOfProducts.addElement("Żwir");
        nameOfProducts.addElement("Drewno");

        System.out.println(nameOfProducts.getNumberOfElements());
        nameOfProducts.printElements();
        System.out.println(nameOfProducts.getLastElement());

        System.out.println("----------");

        Warehouse<Integer> pricesOfProducts = new Warehouse<>();
        pricesOfProducts.addElement(100);
        pricesOfProducts.addElement(250);
        pricesOfProducts.addElement(300);
        pricesOfProducts.addElement(260);

        System.out.println(pricesOfProducts.getNumberOfElements());
        pricesOfProducts.printElements();
        System.out.println(pricesOfProducts.getLastElement());

        //Zadanie 2 — para danych produktu
        //
        //Stwórz klasę, która przechowuje 2 powiązane ze sobą informacje różnych typów.
        //
        //Przykład myślenia:
        //nazwa części + cena
        //nazwa części + numer OEM
        //kod produktu + stan magazynowy
        //
        //Wymagania:
        //
        //klasa ma mieć 2 pola różnych typów
        //ma mieć konstruktor
        //ma mieć gettery
        //ma mieć metodę, która wypisze oba pola w jednej linii w czytelnej formie
        //
        //Potem stwórz metodę, która:
        //
        //przyjmuje listę takich obiektów
        //wypisuje wszystkie rekordy
        //
        //Sprawdź działanie dla:
        //
        //String + Integer
        //String + Double
        //
        //Na co uważać:
        //
        //oba pola mają mieć różne typy generyczne
        //po lewej stronie przy tworzeniu obiektów też podawaj typy
        //metoda przyjmująca listę też ma być generyczna
        //
        //To zadanie uczy:
        //
        //klasy z dwoma typami
        //listy obiektów generycznych
        //praktycznego użycia w stylu „mini baza danych”
        System.out.println();
        System.out.println("Zadanie 12");

        ProductData<String, Integer> zabawka = new ProductData<>("Pluszowy miś", 50);
        ProductData<String, Integer> zabawka2 = new ProductData<>("Samochodzik", 20);

        List<ProductData<String, Integer>> zabawki = new ArrayList<>();
        zabawki.add(zabawka);
        zabawki.add(zabawka2);

        printListofProductData(zabawki);

        ProductData<String, Double> lalka = new ProductData<>("Lalka", 90.99);
        ProductData<String, Double> lego = new ProductData<>("Lego", 999.99);

        List<ProductData<String, Double>> drogieZabawki = new ArrayList<>();
        drogieZabawki.add(lalka);
        drogieZabawki.add(lego);
        printListofProductData(drogieZabawki);


        List<Object> obiekty = new ArrayList<>();
        obiekty.add("zabawka");
        obiekty.add(50);
        obiekty.add(zabawka);
        System.out.println(obiekty);

        for (Object obiekty1 : obiekty) {
            System.out.println(obiekty1);
        }
        BoxWithoutGenerics<String> boxNaStringi = new BoxWithoutGenerics<>();
        boxNaStringi.setList(List.of("Stringi1", "Stringi2", "Stringi3"));

        printObjects(boxNaStringi.getValue());
        System.out.println("--------------------------");
        System.out.println("Zadanie 1 WildCard");
        ///*
        //Zadanie 1
        //Mamy hierarchię klas:
        //Person -> Employee -> Manager
        //
        //Napisz metodę printEmployees(...), która przyjmie listę pracowników albo dowolnego ich podtypu
        //i wypisze dla każdego obiektu pole name.
        //Następnie pokaż w metodzie main, że da się do niej przekazać zarówno List<Employee>, jak i List<Manager>.
        Person wacek = new Person("Wacek", "Właszczak");
        Person lalita = new Person("Lalita", "Hinduska");
        List<Person> persons = new ArrayList<>();
        persons.add(wacek);
        persons.add(lalita);

       Employee skoczylas =  new Employee("Eustachy", "Skoczylas");
       Employee bambo =  new Employee("Letisha", "Bambo");
       List<Employee> employees = new ArrayList<>();
       employees.add(skoczylas);
       employees.add(bambo);

       Manager dupoliz = new Manager("Amadeusz", "Dupoliz");
       Manager pinda = new Manager("Wanda", "Pinda");
       List<Manager> managers = new ArrayList<>();
       managers.add(dupoliz);
       managers.add(pinda);

        printEmployees(employees);
        printEmployees(managers);


        //Zadanie 2
        //Mamy hierarchię klas:
        //Person -> Employee -> Manager
        //
        //Napisz metodę addDefaultEmployees(...), która do przekazanej listy doda:
        //jednego Employee
        //jednego Manager
        //
        //Metoda ma działać dla:
        //List<Employee>
        //List<Person>
        //
        //ale nie może działać dla:
        //List<Manager>
        //
        //Dobierz poprawny wildcard i pokaż to w mainie.
        System.out.println("Zadanie 2 WildCard");
        System.out.println();
        addDefaultEmployee(persons);
        addDefaultEmployee(employees);
        //addDefaultEmployee(managers); incompatible types: java.util.List<org.example.Manager> cannot be converted to java.util.List<? super org.example.Employee>

        //Zadanie 3
        //Dla każdej z poniższych sytuacji zdecyduj, czy powinno być użyte:
        //? extends Employee
        //? super Employee
        //bez wildcarda
        //
        //Sytuacje:
        // 1. Metoda tylko wypisuje imiona pracowników z listy.
        //ODP: extends bo pracownikiem moze byc manager, programmer itp. wiec trzeba 'rozszerzyc' klase pracownika. dodatkowo w przypadku jedynie czytania uzywa sie tej opcji

        // 2. Metoda dodaje nowego Managera do listy.
        //ODP: nie potrzeba do tego wildcarda, mozna to zrobic zwykla metoda, no chyba ze dalej za managerem jest jakis supermanager/ hrbp to wtedy moim zdaniem super bo wykonujemy
        //jakas czynnosc

        // 3. Metoda ma przyjmować wyłącznie List<Employee> i nic więcej.
        //ODP: nie potrzeba do tego wildcarda, jeśli ma to być stałe

        // 4. Metoda odczytuje elementy jako Employee, ale nic nie dodaje.
        //ODP: jezeli glownie odczytujesz dane to trzeba uzyc extends, dodatkowo do employee moze sie zaliczac wiele klas

        //Do każdej odpowiedzi dopisz krótkie uzasadnienie jednym zdaniem.

        //Zadanie 4
        //Masz klasy:
        //
        //class Employee {}
        //class Manager extends Employee {}
        //class Programmer extends Employee {}
        //
        //Dla każdej z poniższych linijek odpowiedz:
        //czy się skompiluje
        //jeśli nie, to dlaczego
        //
        List<? extends Employee> list1 = new ArrayList<Manager>(); //kompiluje sie poprawnie bo extends z pracownika idzie w dol do managera
        List<? super Employee> list2 = new ArrayList<Employee>(); //komplikuje sie poprawnie, employee lub cos wyzej
//        List<? super Employee> list3 = new ArrayList<Manager>();  nie skompiluje sie bo jest nieodpowiedni typ, powinien byc extends jesli rozszerzamy z
        //pracownika na managera, w przypadku super to pójdzie od employye do person i object, czyli NADTYPY
//       List<? extends Employee> list4 = new ArrayList<Programmer>(); skompiluje sie poprawnie bo dziedziczy po employee i jego PODTYPY
        //
        //
        //
        //Zadanie 5
        //Uzupełnij wildcardi w poniższych metodach tak, aby działały zgodnie z opisem:
        //
        //public static void method1(List<? ... Employee> list) {
        //    for (Employee e : list) {
        //        System.out.println(e);
        //    }
        //}
        //
        //public static void method2(List<? ... Employee> list) {
        //    list.add(new Employee());
        //    list.add(new Manager());
        //}
        //
        //Następnie odpowiedz:
        //Dlaczego w method1 można odczytywać elementy jako Employee?
        //Dlaczego w method2 nie można przekazać List<Manager>?
        //*/
        method1(employees);
        //jesli lista zawiera typy dziedziczace po employee to kazdy element jest przynajmniej employee

        method2(employees);
//        method2(managers); nie mozna dodac manager bo kloci sie to z zasadami wildcard, employees nie mozna dodac do managerow
        //bo moga one przechowywac jedynie obiekty typu manager a ta metoda dodaje takze employee i byloby to niebezpieczne



    }
    static void method2(List<? super Employee> list) {
        list.add(new Employee("Justyna", "Tkacz"));
        list.add(new Manager("Justyna", "Tkacz"));
    }

    static void method1(List<? extends Employee> list) {
        for (Employee e: list)
            System.out.println(e);
    }

    static void addDefaultEmployee(List<? super Employee> list) {
        list.add(new Employee(" ", " "));

    }
    static void printEmployees(List<? extends Employee> list) {
        for (Employee e: list){
            System.out.println(e.getName());
        }
    }

    static <T> void printObjects(List<T> list) {
        for (T obiekt : list) {
            System.out.println(obiekt);
        }
    }


    static <T, U> void printListofProductData(List<ProductData<T, U>> productDataList) {
        for (ProductData<T, U> p : productDataList) {
            System.out.println(p.getValue() + " " + p.getValue2());
        }
    }

    static <T> void equalsElementFromList(List<T> list, T element) {
        boolean found = false;
        for (T e : list) {
            if (e.equals(element)) {
                found = true;
                System.out.println(e);
            }
        }
        if (found == false) {
            System.out.println("Not found element " + element);
        }

    }


    static <T> T theLastElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return (list.get(list.size() - 1));
        }

    }

    static <T> boolean compare(T o1, T o2) {
        if (o1.equals(o2)) {
            return true;
        } else {
            return false;
        }
    }

    static <T, U> String nameAndValue(T value, U value2) {
        return value + " opis " + value2;
    }

    static <T> T getFirstElement(List<T> list) {
        return list.getFirst();
    }

    static <T> void printAnyList2(List<T> list) {
        for (T value : list) {
            System.out.println(value);
        }
    }

    static <T> T getAnyValue(T value) {
        return value;
    }

    static <T> void printGenericArray(T[] array) {
        for (T o : array) {
            System.out.println(o);
        }
    }

    static void printAnyList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println("Liczba: " + n);
        }
    }

    static void addIntegers(List<? super Integer> list) {
        list.add(100);
        list.add(200);

    }

//    static void addPeople(List<?> super Employee lista) {
//            lista.add(new Manager());
}
//    static void printData(List<? extends Employee>)

//    jeśli struktura “produkuje” dane dla ciebie, czyli ty z niej głównie czytasz → extends
//    jeśli struktura “konsumuje” dane od ciebie, czyli ty głównie do niej wkładasz → super
//    Generyki:
//      pozwalają pisać klasy i metody, które działają dla różnych typów, ale wciąż są bezpieczne typowo.

//      T:
//oznacza konkretny parametr typu.

//      ?:
//oznacza nieznany typ.

//      ? extends X:
//czytam z tego bezpiecznie jako X, ale nie dodaję.

//      ? super X:
//mogę bezpiecznie dodawać X, ale przy odczycie zwykle mam tylko Object.

//      List<Integer> nie jest List<Number>:
//bo kontener generyczny nie dziedziczy w taki prosty sposób jak zwykłe klasy.

//Najlepszy mentalny model:

//generyk to etykieta na pudełku
//wildcard to pudełko, o którym wiesz tylko tyle, ile potrzebujesz
//extends = “coś z tej rodziny lub niżej”
//super = “coś z tej rodziny lub wyżej”

    /*
    zapis	            co robisz	            mental

    <T>	                kontrolujesz typ	    „wiem dokładnie co mam”
    <?>	                nic nie zakładasz	    „cokolwiek”
    <? extends T>	    czytasz	                „coś jak T”
    <? super T>	        dodajesz	            „coś nad T”
     */
    /*
    PECS rule:

    Producer → extends (czytasz)
    Consumer → super (dodajesz)

          Object
            ↑
          Number
            ↑
          Integer

Object – najbardziej ogólny (na górze)
Integer – najbardziej konkretny (na dole)

    klasa employee i klase dziedziczaca -> manager
    klasa employee i klase dziedziczaca -> programmer


    1. extends – „idę w dół hierarchii”

    <? extends Number> oznacza:

    to może być:
    Number
    Integer
    Double
    itd.

    czyli: bierzesz Number i wszystko co jest POD nim

    2. super – „idę w górę hierarchii”

    <? super Integer> oznacza:

    to może być:
    Integer
    Number
    Object


     */


