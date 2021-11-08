package student.qa;

public class Breakfast {
    public static void main(String[] args) {

        System.out.println("Привет, я очень плотно позавтракал:");

        Сalories bread = new Сalories("Хлеб", 8, 200);
        Сalories avocado = new Сalories("Авокадод", 15, 150);
        Сalories omelette = new Сalories("Омлет", 4, 300);
        Сalories watermelon = new Сalories("Арбуз", 12, 500);

        bread.sayDiet();
        avocado.sayDiet();
        omelette.sayDiet();
        watermelon.sayDiet();
    }
}
