public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(70, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, на этом закончим");
                break;
            }
        }
    }
}