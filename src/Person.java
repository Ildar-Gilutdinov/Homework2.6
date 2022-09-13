public class Person {

    public String name;
    public String surName;
    public int ticket;

    public Person(String name, String surName, int ticket) { //Создание конструктора
        this.name = name;
        this.surName = surName;
        this.ticket = ticket;
    }

    public String toString() { // ввызов метода toString
        return name + " " + surName + " имеет кол-во биллетов " + ticket;
    }
}
