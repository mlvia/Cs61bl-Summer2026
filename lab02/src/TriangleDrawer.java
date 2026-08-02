public class TriangleDrawer {
    public static void drawTriangle() {
        int size = 5;
        String result = "";
        while (size > 0) {
            result += "*";
            size -= 1;
            System.out.println(result);
        }
    }

    static void main() {
        drawTriangle();
    }
}
