public class Lesson2 {
    public static int getRandomFromRange(int min, int max) {
        int range = max - min + 1;
        int result = (int) (Math.random() * range) + min;
        return result;
    }
}
