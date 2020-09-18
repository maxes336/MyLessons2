public class Men {
    public int age;
    public String name;
    public String profession;
    public int salary;

    public Men() {
    }

    public Men(int age, String name, String profession) {
        this.age = age;
        this.name = name;
        this.profession = profession;
    }

    public Men(String name, String profession) {
        this.age = Lesson2.getRandomFromRange(18, 65);
        this.salary = Lesson2.getRandomFromRange(30_000, 120_000);
        this.name = name;
        this.profession = profession;
    }

}

