package adaptive_java;

public class ChessBoard {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println(canHitEachOther(x1, y1, x2, y2) ? "YES" : "NO");
    }

    private static boolean canHitEachOther(int x1, int y1, int x2, int y2) {
        if (x1 == x2 || y1 == y2) {
            return true;
        }
        return Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }
}
