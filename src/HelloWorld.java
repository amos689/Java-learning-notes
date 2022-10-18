public class HelloWorld {
    public static void main(String[] args) {
        int all = 9;
        for (int i = 1; i < (all + 1) / 2 + 1; i++) {
            for (int j = 1; j <= (all + 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = all / 2; i >= 1; i--) {
            for(int j = 1; j <= (all + 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = (all + 1) / 2 - i; k <= (all + 1) / 2 - 2 + i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
