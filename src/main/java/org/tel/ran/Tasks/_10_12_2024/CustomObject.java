package org.tel.ran.Tasks._10_12_2024;
import java.util.Random;
public class CustomObject {

    int id;
    double value;
    boolean isActive;
    char symbol;
    float weight;
    byte age;
    short level;

    public CustomObject(int id, double value, boolean isActive, char symbol, float weight, byte age, short level) {
        this.id = id;
        this.value = value;
        this.isActive = isActive;
        this.symbol = symbol;
        this.weight = weight;
        this.age = age;
        this.level = level;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "id=" + id +
                ", value=" + value +
                ", isActive=" + isActive +
                ", symbol=" + symbol +
                ", weight=" + weight +
                ", age=" + age +
                ", level=" + level +
                '}';
    }

    static public CustomObject[] generateObject() {
        CustomObject[] customObjects = new CustomObject[20];
        Random rand = new Random();
        for (int i = 0; i < customObjects.length; i++) {
            customObjects[i] = new CustomObject(i + 1,
                    rand.nextDouble(0,100),
                    rand.nextBoolean(),
                    (char)rand.nextInt(65,91),
                    rand.nextFloat(1,50),
                    (byte)rand.nextInt(0, 127),
                    (short)rand.nextInt(0,32_767)
            );
        }
        return customObjects;
    }

    public static void main(String[] args) {
        CustomObject[] customObjects = CustomObject.generateObject();
        for (int i = 0; i < customObjects.length; i++) {
            System.out.println("customObjects[" + i + "] = " + customObjects[i]);
        }
    }
}
