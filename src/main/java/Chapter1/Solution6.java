package Chapter1;

import java.util.Arrays;

/**
 * Created by yogeshmadaan on 14/04/16.
 */

/**
Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class Solution6 {

    static int[][] multi = new int[][]{
            { 0, 1, 2, 3, 4 },
            { 5, 6, 7, 8, 9 },
            { 10,11, 12, 13, 14 },
            { 15, 16, 17, 18, 19 },
            { 20, 21,22, 23, 24 }
    };

    public static void main(String[] args) {
        rotate(multi,5);
//        System.out.println(Arrays.toString(multi));

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(multi[i][j]+",");
            }
            System.out.println("");
        }
    }
    public static void rotate ( int[][] matrix, int n){
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first; // save top
                int top = matrix[first][i];
// left -> top
                matrix[first][i] = matrix[last - offset][first];
// bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
// right -> bottom
                matrix[last][last - offset] = matrix[i][last];
// top -> right
                matrix[i][last] = top;
            }
        }
    }
}
