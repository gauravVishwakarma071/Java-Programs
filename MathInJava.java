public class MathInJava {
    public static void main(String[] args) {

        int a = 23;
        int b = 21;
        double f = 34.23d;

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        float floor = (float) Math.floor(f);
        int dv = Math.floorMod(max, min);
        System.out.println(floor);
        System.out.println(dv);

    }
}
