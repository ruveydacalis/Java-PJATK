public class ColorBytes {
    public static void main(String[] args) {
        int a = 23, r = 121, g = 255, b = 130, color;

        color = (a << 24) + (r << 16) + (g << 8) + (b);

        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color);
        a = 0;
        r = 0;
        g = 0;
        b = 0;

        a = color >> 24;
        r = ((color << 8) >> 24);
        b = (((color << 8) >> 24) + 9);
        g = (((color >> 8)&255));

        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
    }
}