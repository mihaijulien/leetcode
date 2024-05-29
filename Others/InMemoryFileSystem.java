class FileSystem {
    
    private Dir root;
    
    public FileSystem() {  // FileSystem fs = new FileSystem()
        this.root = new Dir();
    }
    
    public List<String> ls(String path) {  //fs.ls("/")
        List<String> list = new ArrayList<>();
        Dir current = root;
        if(!path.equals("/")){
            String[] d = path.split("/"); 
            int length = d.length;
            for(int i = 1; i < length - 1; i++){
                current = current.dirs.get(d[i]);
            }
            if(current.files.containsKey(d[length - 1])){
                list.add(d[length - 1]);
                return list;
            }
            else{
                current = current.dirs.get(d[length - 1]);
            }
        }                    
        list.addAll(new ArrayList<>(current.dirs.keySet()));
        list.addAll(new ArrayList<>(current.files.keySet()));
        Collections.sort(list);
        
        return list;
    }
    
    public void mkdir(String path) {
        Dir current = root;
        
        String[] d = path.split("/");
        for (int i = 1; i < d.length; i++) {
            if (!current.dirs.containsKey(d[i]))
                current.dirs.put(d[i], new Dir());
            current = current.dirs.get(d[i]);
        }
    }
    
    public void addContentToFile(String filePath, String content) {
        Dir current = root;
        
        String[] d = filePath.split("/");
        for(int i=1; i < d.length - 1; i++){
            current = current.dirs.get(d[i]);
        }
        
        current.files.put(d[d.length-1], current.files.getOrDefault(d[d.length-1], "") + content);
    }
    
    public String readContentFromFile(String filePath) {
        Dir current = root;
        
        String[] d = filePath.split("/");
        for(int i=1; i < d.length - 1; i++){
            current = current.dirs.get(d[i]);
        }
        
        return current.files.get(d[d.length-1]);
    }
    
    
    class Dir {
        HashMap <String, Dir> dirs;   //dir name : subdirectories
        HashMap <String, String> files;  // file name : file contents
        
        public Dir(){
            this.dirs = new HashMap<>();
            this.files = new HashMap<>();
        }
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */
