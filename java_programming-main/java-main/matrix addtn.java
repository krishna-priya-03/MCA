import java.util.*;

public class matrixaddtn
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of first matrices :");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println("Enter the number of rows and columns of second matrices :");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[p][q];
        int b[][] = new int[m][n];
        int c[][] = new int[p][q];

        if(p==m && q==n)
        {
            int i,j;  

            System.out.println("Enter the elements of first matrix :");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of second matrix :");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }

            /*displaying the first matrix */
            System.out.println("The first matrix is :");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            /*displaying the second matrix */
            System.out.println("The second matrix is :");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            /*adding the two matrices */
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            /*displaying the result */
            System.out.println("The sum of the two matrices is :");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Matrix order is not correct");
        }

        sc.close();
    }
}