package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestClient {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(10 , 20 , "дуб" , "зеленый");
        forest.plantTree(1 , 2 , "дуб" , "зеленый");
        forest.plantTree(15 , 10 , "дуб" , "зеленый");
        forest.plantTree(102 , 50 , "дуб" , "зеленый");

        forest.plantTree(100, 120, "Береза", "Бело-зеленая");
        forest.plantTree(200, 250, "Береза", "Бело-зеленая");

        System.out.println("\n=== Начинаем отрисовку леса ===");
        forest.draw();
    }
}

 class Forest {
   private List<Tree> trees = new ArrayList<>();

   public void plantTree(int x , int y , String name , String color){
       TreeType type = TreeFactory.getTreeType(name, color);
       Tree tree = new Tree(x , y , type);
       trees.add(tree);
   }

   public void draw(){
       for (Tree tree : trees) {
           tree.draw();
       }
   }
}
