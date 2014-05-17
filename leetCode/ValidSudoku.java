
import java.util.*;
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        // check the line first
        for (int i=0; i<m; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j=0; j<n; j++) {
                if (board[i][j] != '.' && set.contains(board[i][j])) {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }
        for (int i=0; i<n; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j=0; j<m; j++) {
                if (board[i][j] != '.' && set.contains(board[j][i])) {
                    return false;
                } else {
                    set.add(board[j][i]);
                }
            }
        }
        for (int i=0; i<m; i=i+3) {
            for (int j=0; j<n; j=j+3) {
                for (int a=i; a<i+3; a++) {
                    Set<Character> set = new HashSet<Character>();
                    for (int b=j; b<j+3; b++) {
                        if (board[a][b] != '.' && set.contains(board[a][b])) {
                            return false;
                        } else {
                            set.add(board[a][b]);
                        }
                    }
                }
            }
        }
        return true;
        
    }
}