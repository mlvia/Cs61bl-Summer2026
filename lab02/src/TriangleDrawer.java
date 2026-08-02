public class TriangleDrawer {
    public static void drawTriangle() {
        int num = 0;
        String result = "";
        while (num < 3) {
            result += "*";
            num += 1;
            System.out.println(result);
        }
    }

    static void main() {
        drawTriangle();
    }
}
