package student.qa;

public class Сalories {
    String name;
    double calories;
    int gram;

    public Сalories (String name, int calories, int gram){
        this.name = name;
        this.calories = calories;
        this.gram = gram;
    }

    void sayDiet() {System.out.println("Название:" + name +",калории" + " " + calories * gram);
    }
}

