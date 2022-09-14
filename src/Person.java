public class Person {

    private String name;
    private String surName;
    private int ticket;

    public Person(String name, String surName, int ticket) { //Создание конструктора
        this.name = name;
        this.surName = surName;
        this.ticket = ticket;
    }

    public String toString() { // ввызов метода toString
        return name + " " + surName + " имеет кол-во биллетов " + ticket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    public int getTicket() {
        return ticket;
    }

    public boolean spendTicket() {
        if (ticket > 0) {
            ticket--;
            return true;
        } else {
            return false;
        }
    }
}
