package string;

/**
 * Created by justin on 6/21/17.
 */
public class ReverseString {

    private static void reverse(char[] array, int from, int to) {
        if ( from < 0 || to >= array.length){
            System.out.println("index error");
            System.exit(1);
        }
        while (from < to) {
            char temp = array[from];
            array[from++] = array[to];
            array[to--] = temp;
        }

    }


    public static void main(String[] args) {

        char[] array = "abcde".toCharArray();
        System.out.println(array);


        reverse(array, 0, 3);
        System.out.println(array);
    }
}
