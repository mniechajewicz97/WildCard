package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BoxWithoutGenerics box = new BoxWithoutGenerics();
        box.setValue("coś");

        String cos = (String) box.getValue();
        System.out.println(cos);

        box.setValue(123);
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
        List<Integer> numerki = List.of(1, 2, 3, 4, 5);
        List<String> imiona = List.of("Ala", "Ola", "Ela");
        printAnyList2(imiona);
        printAnyList2(numerki);

        System.out.println("Zadanie 4");
        System.out.println(getFirstElement(imiona));
        System.out.println(getFirstElement(numerki));

        System.out.println("Zadanie 5");
        Checklist<String> checkStrings =  new Checklist<>();
        checkStrings.addElement("Mariola");
        checkStrings.addElement("Wiola");
        checkStrings.addElement("Topola");
        checkStrings.printAllElements();

        Checklist<Integer> checkIntegers = new Checklist<>();
        checkIntegers.addElement(1);
        checkIntegers.addElement(2);
        checkIntegers.addElement(3);
        checkIntegers.printAllElements();

    }
    static<T> T getFirstElement(List<T> list) {
        return list.getFirst();
    }
    static <T> void printAnyList2 (List<T> list){
        for (T value: list){
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
}