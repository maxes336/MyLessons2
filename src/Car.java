public class Car {
    public int price;
    public int year;
    public int weight;
    public String colour;
    public String brand;

    public Car(int price, int year, int weight, String colour) {
        String[] brands = {"BMW", "Toyota", "Honda", "Kia", "VW"};

        this.price = price;
        this.year = year;
        this.weight = weight;
        this.colour = colour;
        this.brand = brands[Lesson2.getRandomFromRange(0, brands.length-1)];
    }

}
