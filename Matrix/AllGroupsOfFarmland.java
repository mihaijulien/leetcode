class Solution {
    public int[][] findFarmland(int[][] land) {
        
        List<int[]> groups = new ArrayList<>();
        
        for(int i=0; i<land.length; i++){
            for(int j = 0; j<land[0].length; j++){
                if(land[i][j] == 1){
                    int x = i; 
                    while (x < land.length && land[x][j] == 1){
                        x++;
                    }
                    int y = j;
                    while(y < land[0].length && land[i][y] == 1){
                        y++;
                    }
                    
                    // mark all those cells with 0 to not visit them again
                    for(int row = i; row < x; row++){
                        for(int col = j; col < y; col ++){
                            land[row][col] = 0;
                        }
                    }
                    groups.add(new int[] {i,j,x-1, y-1});
                }
            }
        }
        
        return groups.toArray(new int[0][]);
    }
}
