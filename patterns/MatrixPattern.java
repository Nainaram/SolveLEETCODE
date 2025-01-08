public class MatrixPattern {
    public static void main(String[] args) {
        int n = 4; // Size of the matrix
        int[][] matrix = new int[n][n];

        int number = 1; // Start filling numbers from 1

        // Fill the matrix diagonally
        for (int i = 0; i < n; i++) {
            for (int row = 0, col = i; col >= 0 && row < n; row++, col--) {
                matrix[row][col] = number++;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int row = i, col = n - 1; row < n && col >= 0; row++, col--) {
                matrix[row][col] = number++;
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
