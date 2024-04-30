class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        triangle.add(new ArrayList<>(Arrays.asList(1)));
        
        for(int i=0; i<numRows-1; i++){
            triangle.add(generateRow(triangle.get(i)));
        }
        
        return triangle;
    }
    
    private List<Integer> generateRow(List<Integer> previousRow){
        
        List<Integer> resultRow = new ArrayList<>();
        
        resultRow.add(1);
        for(int i=0; i<previousRow.size()-1; i++){
            resultRow.add(previousRow.get(i) + previousRow.get(i+1));
        }
        resultRow.add(1);
        
        return resultRow;
    }
}