public class Solution {
    public static void main(String []args){
        boolean ans = findNumberIn2DArray(new int[][]{ {}} , 5);
        System.out.println(ans);
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target){
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) return true;
                if (matrix[i][j] > target) break;
            }
            if  (matrix[0].length == 0) break;
            if (matrix[i][0] > target) break;
        }
        return false;
    }
}
