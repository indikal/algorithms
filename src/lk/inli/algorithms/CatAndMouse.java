package lk.inli.algorithms;

public class CatAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int x_cost = Math.abs(x - z);
        int y_cose = Math.abs(y - z);

        if (x_cost < y_cose) {
            return "Cat A";
        } else if (y_cose < x_cost) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) {
        System.out.println(CatAndMouse.catAndMouse(2, 5, 4));
        System.out.println(CatAndMouse.catAndMouse(1, 2, 3));
        System.out.println(CatAndMouse.catAndMouse(1, 3, 2));
    }
}
