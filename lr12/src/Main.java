import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Furniture> furnitureMap = new HashMap<>();

        furnitureMap.put("Обеденный стол", new Table("Обеденный стол", 101, "Дуб", 4));
        furnitureMap.put("Журнальный столик", new Table("Журнальный столик", 102, "Стекло", 3));
        furnitureMap.put("Компьютерный стол", new Table("Компьютерный стол", 103, "ДСП", 4));

        furnitureMap.put("Офисный стул", new Chair("Офисный стул", 201, "Пластик", true));
        furnitureMap.put("Табуретка", new Chair("Табуретка", 202, "Дерево", false));
        furnitureMap.put("Барный стул", new Chair("Барный стул", 203, "Металл", true));

        furnitureMap.put("Шкаф-купе", new Wardrobe("Шкаф-купе", 301, "Зеркальный ДСП", 2));
        furnitureMap.put("Книжный шкаф", new Wardrobe("Книжный шкаф", 302, "Сосна", 4));

        System.out.println("Список всей мебели в Map");


        Iterator<Map.Entry<String, Furniture>> iterator = furnitureMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Furniture> entry = iterator.next();
            System.out.println("Ключ (Название): \"" + entry.getKey()
                    + "\"  Значение: " + entry.getValue());
        }
    }
}