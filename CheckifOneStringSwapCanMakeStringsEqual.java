class CheckifOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int first = -1,second = -1;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count > 2) return false;

                if(first == -1) first = i;
                else second = i;
            }
        }

        //System.out.print(first+ " "+second);
        StringBuilder sb = new StringBuilder(s2);
        if(first!=-1 && second!=-1){
        char temp = s2.charAt(first);
        sb.setCharAt(first,sb.charAt(second));
        sb.setCharAt(second,temp);
        }
        //System.out.print(sb.toString());
        return s1.equals(sb.toString());
    }
}