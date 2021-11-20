import java.util.Arrays;
import java.util.Comparator;


public class Problem02 {
    
    public static void main(String[] args){

        String[] strArray = new String[]{"eat", "abets","ate",  "betas", "tea","baste", "beast", "steam", "beats"}; 

        sortArraysByAnagrams(strArray);

        for(String str : strArray){
            System.out.println(str);
        }

    }

    private static void sortArraysByAnagrams(String[] strArray) {
        Arrays.sort(strArray, new AnagramComparator());
    }

}


class AnagramComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        //check edge conditions and length
        if( s1 == null || s2 == null)
            return -1;
        if( s1.length() <  s2.length())
            return -1;
        else if ( s1.length() >  s2.length())
            return 1;

        //sort s1 and s2 to compare:
        //System.out.println(s1 + " vs  " + s2);        
        return sort(s1).compareTo(sort(s2));

    }

    private String sort(String s1) {
        char[] cArray = s1.toCharArray();
        Arrays.sort(cArray);        
        //System.out.println(" sorted:  " + new String(cArray));
        return new String(cArray);
    }


}

//Time complexity O(logn)
//Space complexity O(n*m) m being the larger one
