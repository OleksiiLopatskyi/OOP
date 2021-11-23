package ProjectWithSolutions.Lab2.Lab24;

import ProjectWithSolutions.Lab2.Lab24.Matrix;
import org.junit.Assert;

public class Test {
    public void add_test_success() throws Exception {
        int k = 3;
        int n = 5;
        int m[][] = new int[k][n];
        Matrix result = new Matrix(k, n);
        for (int i = 0;
             i < k;
             i++) {
            for (int j = 0;
                 j < n;
                 j++) {
                result.getM()[i][j] = m[i][j] + m[i][j];
            }
        }
        Matrix matrix = new Matrix(3,5);
        Matrix sum = matrix.sum(matrix);
        Assert.assertEquals(result, sum);
    }
}
