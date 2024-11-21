class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor != color){
            dfs(image, sr, sc, originalColor, color);
        }
        return image;
    }
    private void dfs(int[][] image, int row, int col, int originalColor, int color){
        if(row < 0 || col < 0 || row >= image.length || col >= image[0].length || image[row][col] != originalColor){
            return;
        }
        image[row][col] = color;

        // Explore all 4 possible directions (up, down, left, right)
        dfs(image, row - 1, col, originalColor, color); // up
        dfs(image, row + 1, col, originalColor, color); // down
        dfs(image, row, col - 1, originalColor, color); // left
        dfs(image, row, col + 1, originalColor, color);
    }
}