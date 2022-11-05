import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arrays = new int[5][5];
        int count = 0;
        for (int i = 0; i <= arrays.length - 1; i++) {
            for(int j = 0; j <= arrays.length - 1; j++) {
                count++;
                arrays[i][j] = count;
            }
        }
        System.out.println(arrays[arrays.length - 1][arrays.length - 1]);
    }
}
