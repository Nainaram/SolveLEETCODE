import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int rStart = 1;
        int cStart = 1;

        List<int[]> result = spiralOrder(rows, cols, rStart, cStart);
        for (int[] coord : result) {
            System.out.println("[" + coord[0] + ", " + coord[1] + "]");
        }
    }

    public static List<int[]> spiralOrder(int rows, int cols, int rStart, int cStart) {
        List<int[]> result = new ArrayList<>();
        if (rows == 0 || cols == 0) 
        return result;

        // Directions for moving: right, down, left, up
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0; // Start by moving right
        
        int r = rStart;
        int c = cStart;
        boolean[][] visited = new boolean[rows][cols];
        
        for (int i = 0; i < rows * cols; i++) {
            result.add(new int[]{r, c});
            visited[r][c] = true;
            
            // Calculate next cell
            int nextRow = r + directions[directionIndex][0];
            int nextCol = c + directions[directionIndex][1];
            
            // Check boundaries and visited cells
            if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol]) {
                // Change direction
                directionIndex = (directionIndex + 1) % 4;
                nextRow = r + directions[directionIndex][0];
                nextCol = c + directions[directionIndex][1];
            }
            
            // Move to the next cell
            r = nextRow;
            c = nextCol;
        }
        
        return result;
    }
}
