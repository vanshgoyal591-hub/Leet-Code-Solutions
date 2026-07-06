class Solution {
    public int lengthOfLastWord(String s) {
        // if(s.lenght<=0){
        //     return false;
        // }
        int length=0;
        int i = s.length()-1;

        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && s.charAt(i) != ' '){
            length++;
            i--;

        }
        
        return length;

    }
}