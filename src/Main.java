import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа очереди на аттракцион");
        Queue<Person> List = new LinkedList<>();
        System.out.println("Люди которые стоят в очереди на аттракцион: ");
        generateClients().forEach(System.out::println); //вывод людей из списка
        for (int i = 0; i < generateClients().size(); i++) { //цикл for
            List.offer((generateClients().get(i))); //добавляем новые элементы из списка generateClients в коллекцию List
        }
        System.out.println("На аттракционе прокатились: ");
        while (!List.isEmpty()) { // цикл while с проверкой стека на пустоту
            Person firstPerson = List.poll();
            System.out.println(firstPerson.name + " " + firstPerson.surName + " прокатился на аттракционе ");
            int ticket = firstPerson.ticket - 1; //уменьшаем кол-во билетов
            if (ticket > 0) {
                firstPerson.ticket = ticket;
                List.offer(firstPerson);
            }
        }
        System.out.println("Программа завершина!");
    }

    public static List<Person> generateClients() { // метод списка людей
        List<Person> generateClients = new ArrayList<>(); //список людей
        generateClients.add(new Person("Валерий", "Харламов", 3));
        generateClients.add(new Person("Павел", "Буре", 2));
        generateClients.add(new Person("Евгений", "Малкин", 4));
        generateClients.add(new Person("Илья", "Ковальчук", 5));
        generateClients.add(new Person("Александр", "Овечкин", 3));
        return generateClients;
    }
}

