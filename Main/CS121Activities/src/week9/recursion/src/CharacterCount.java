import java.util.Scanner;
public class CharacterCount {

        public static int CharCount(char[] array, int start, char letter){
            int count = 0;
            if (start >= array.length) {
                return count;
            } else {
                if (array[start] == letter) {
                    start = start + 1;
                    return count + 1 + CharCount(array, start, letter);
                } else {
                    start = start + 1;
                    return count + CharCount(array, start, letter);
                }
            }
        }

    }
