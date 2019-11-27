package lab2.tasks.task2;

public class Matrix {
    public static void main(String[] args) {
    }
    public boolean cheackSymmetric(Integer[][] M) {
        for(int i=0; i<M.length; i++) {
            for(int j=0; j<M[i].length; j++) {
                if(M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
