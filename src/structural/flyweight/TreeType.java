package structural.flyweight;

public class TreeType {
    private String name;
    private String color;
    private byte[] heavyTexture;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
        this.heavyTexture = new byte[1024* 1024 * 15];
    }

    public void draw(int x, int y){
       System.out.println("Рисуем " + name + " (" + color + ") в координатах [" + x + ", " + y + "]");
    }
}
