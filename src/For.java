public class For {
    public static void main(String[] args) {
        int v;
        int n = 10;

        for (int i = 0; i < n; i++) {
            v = i++;
            System.out.println("Value = " + v);
        }
    }
}
