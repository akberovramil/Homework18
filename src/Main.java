import java.util.*;

public class Main {

    public static void addPeople(String s, Integer i, Map<String, Integer> map) {
        if (map.containsKey(s) && Objects.equals(map.get(s), i)) {
            throw new RuntimeException("Такой ключ уже есть");
        } else {
            map.put(s, i);
        }
    }

    public static int calculateValue(List<Integer> list) {
        int sum = 0;

        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Василий Пупкин", "79872345454");
        phoneBook.put("Михаил Игнатьев", "89872345454");
        phoneBook.put("Василий Иванов", "59872345454");
        phoneBook.put("Василий Шуйский", "79802345454");
        phoneBook.put("Иван Грозный", "79872665454");
        phoneBook.put("Петр Первый", "79172345454");
        phoneBook.put("Павел Первый", "79002345454");
        phoneBook.put("Николай Второй", "74872345454");
        phoneBook.put("Михаил Первый", "19872345454");
        phoneBook.put("Александр Первый", "29872345454");
        phoneBook.put("Николай Первый", "69872345454");
        phoneBook.put("Ярослав Мудрый", "77872345454");
        phoneBook.put("Иван Калита", "00872345454");
        phoneBook.put("Борис Годунов", "79873345454");
        phoneBook.put("Петр Второй", "99872345454");
        phoneBook.put("Васиилй Темный", "00072345454");
        phoneBook.put("Александр Невский", "79877745454");
        phoneBook.put("Екатерина Вторая", "78892345454");
        phoneBook.put("Елизавета Петровна", "79872345666");
        phoneBook.put("Анна Иоановна", "79872848454");
        System.out.println(phoneBook);
        phoneBook.entrySet().forEach(System.out::println);
        System.out.println("Задание 3");
        Map<String, Integer> map = new HashMap<>();
        map.put("Рамиль", 1);
        map.put("Василий", 2);
        map.put("Андрей", 3);
        System.out.println(map.values());
        addPeople("Рамиль", 5, map );
        System.out.println(map);
        System.out.println(map.get("Рамиль"));
        System.out.println("Задание 4");
        Map<String, List<Integer>> numbers = new HashMap<>();
        List<Integer> listik = new ArrayList<>();
        listik.add(1);
        listik.add(2);
        listik.add(3);
        numbers.put("Ключ 1",listik);
        List<Integer> secondListik = new ArrayList<>();
        secondListik.add(4);
        secondListik.add(5);
        secondListik.add(6);
        numbers.put("Ключ 2", secondListik);
        List<Integer> thirdListik = new ArrayList<>();
        thirdListik.add(7);
        thirdListik.add(8);
        thirdListik.add(9);
        numbers.put("Ключ 3", thirdListik);
        numbers.entrySet().forEach(System.out::println);
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> m : numbers.entrySet()) {
            newMap.put(m.getKey(), calculateValue(m.getValue()));
        }
        newMap.entrySet().forEach(System.out::println);
        System.out.println("Задание 5");
        Map<Integer, String> myMap = new LinkedHashMap<>();
        myMap.put(5, "1");
        myMap.put(9, "1");
        myMap.put(6, "1");
        myMap.put(1, "1");
        myMap.put(2, "1");
        myMap.put(3, "1");
        myMap.put(4, "1");
        myMap.put(7, "1");
        myMap.put(8, "1");
        myMap.put(10, "1");
        myMap.entrySet().forEach(System.out::println);












    }


}
