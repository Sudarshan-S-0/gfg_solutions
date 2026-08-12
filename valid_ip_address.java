class Solution {
    public boolean isValid(String s) {
        String[] part = s.split("\\.",-1);
        if(part.length!=4) return false;
        for(String p:part){
            if(p.length()==0) return false;
            if(p.length()>1 && p.charAt(0)=='0') return false;
            for(char c:p.toCharArray()){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
            int n = Integer.parseInt(p);
            if(n<0 || n>255) return false;
        }
        return true;
    }
}
