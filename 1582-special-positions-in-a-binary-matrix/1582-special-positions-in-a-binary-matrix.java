class Solution {
    public int numSpecial(int[][] mat) {

        int n = mat.length;       // number of rows
        int m = mat[0].length;    // number of columns

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1) {

                    boolean rowOK = true;
                    boolean colOK = true;

                    // Check row
                    for (int k = 0; k < m; k++) {

                        if (k != j && mat[i][k] == 1) {
                            rowOK = false;
                            break;
                        }
                    }

                    // Check column
                    for (int k = 0; k < n; k++) {

                        if (k != i && mat[k][j] == 1) {
                            colOK = false;
                            break;
                        }
                    }

                    // If both conditions are true
                    if (rowOK && colOK) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}