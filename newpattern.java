public class newpattern {
    public static void main(String[] args) {
        int row = 6;
        int initial_value = 1;

        for (int i = 0; i < row; i++) {
            int num = initial_value;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num - (5 - j);
            }
            System.out.println();
            initial_value = initial_value + (row - 1 - i);
        }
    }

}
