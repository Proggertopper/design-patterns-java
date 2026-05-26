package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String , TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name , String color){
        String key = name + "_" + color;

        if(!(treeTypes.containsKey(key))){
            treeTypes.put(key , new TreeType(name , color));
            System.out.println("Создан НОВЫЙ тяжелый тип дерева: " + name);
        }
        return treeTypes.get(key);
    }
}
