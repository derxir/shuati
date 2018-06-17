package linear.string;

/**
 * Created by justin on 6/17/18.
 */
public class StrStr {

    public static int strStr(String source, String target) {
        // write your code here
        if(source == null || (source.length() == 0 && target.length() != 0))return -1;
        if(source.length() == 0 && target.length() == 0) return 0;
        if(target == null ) return -1;
        if( target.length() == 0 ) return 0;
        for(int i = 0; i <= source.length() - target.length(); i++){
            int j = 0;
            while(target.charAt(j) == source.charAt(i + j)){
                if( j == target.length() - 1){
                    return i;
                }
                j++;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        strStr("abc", "bc");
    }
}
