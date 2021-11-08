package student.qa;

public class Breakfast {
    public static void main(String[] args) {

        System.out.println("Привет, я очень плотно позавтракал:");

        Сalories bread = new Сalories("Хлеб", 0.8, 200);
        Сalories avocado = new Сalories("Авокадо", 1.5, 150);
        Сalories omelette = new Сalories("Омлет", 0.5, 300);
        Сalories watermelon = new Сalories("Арбуз", 1.2, 500);

        bread.sayDiet();
        avocado.sayDiet();
        omelette.sayDiet();
        watermelon.sayDiet();
    }
}
