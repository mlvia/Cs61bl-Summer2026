public class TriangleDrawer2 {
    public static void drawTriangle() {
        String result = "";
        for (int i=0; i<5; i++) {
            result += "*";
            System.out.println(result);
        }
    }

    static void main() {
        drawTriangle();
    }
}
