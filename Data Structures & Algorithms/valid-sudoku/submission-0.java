class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rows;
        Set<Character> columns;
        Set<Character>[] cells= new Set[9];

        for(int i = 0 ; i <cells.length;++i){
            cells[i]= new HashSet<>();
        }

        for(int r = 0; r < 9;++r){
            rows = new HashSet<>();
            columns = new HashSet<>();
            for(int c = 0; c < 9;++c){
                char row = board[r][c];
                char col = board[c][r];
                //row check
                if(row != '.'){
                    if(rows.contains(row)){
                        return false;
                    }
                    rows.add(row);
                }
                //column check
                if(col != '.'){
                    if(columns.contains(col)){
                        return false;
                    }
                    columns.add(col);
                }
                //cell check
                if(row != '.'){
                    int index = (r / 3) * 3 + (c / 3);
                    if(cells[index].contains(row)){
                        return false;
                    }
                    cells[index].add(row);
                }
            }
        }
        return true;

    }

}
