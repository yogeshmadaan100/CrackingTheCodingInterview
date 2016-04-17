package Chapter1;

/**
 * Created by yogeshmadaan on 17/04/16.
 */
public class Solution7 {

    static int[][] multi = new int[][]{
            { 0, 1, 2, 3, 4 },
            { 5, 6, 7, 8, 9 },
            { 10,11, 12, 13, 14 },
            { 15, 16, 17, 18, 19 },
            { 20, 21,22, 23, 24 }
    };
    public static void main(String[] args) {
        setZeros(multi);
        printMatrix(multi,multi.length,multi[0].length);
    }

    public static void setZeros(int[][] matrix)
    {
        boolean row[] = new boolean[matrix.length];
        boolean columns[] = new boolean[matrix[0].length];

        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<columns.length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i] =true;
                    columns[j] =true;
                }
            }
        }
        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<columns.length;j++)
            {
                if(row[i] || columns[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void printMatrix(int [][] matrix, int row,int column)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(multi[i][j]+",");
            }
            System.out.println("");
        }
    }
}
