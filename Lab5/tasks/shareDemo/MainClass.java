package tasks.shareDemo;

public class MainClass {
    public static void main(String[] args) {
        CustomTriangle triunghi = new CustomTriangle(4, 5, 5, "Isoscel", "Are doua laturi egale");
        System.out.println(triunghi.getDescription());
        System.out.println(triunghi.getPerimeter());

    }
}
