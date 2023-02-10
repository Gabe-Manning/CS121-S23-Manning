public class ForLoop {

    public static void main(String[] args) {
        /*int i;
        for (int i = 0; i <= 10; i+= 2){
            System.out.println("Count is: " + i);
        }
        for (int i = 1; i <= 10; i *= 2){
            System.out.println(i);
        }
        System.out.println("The final value of i is: " + i);
        for (int j = 5; j >=1; j--){
           System.out.println("Count is: " + j);
        } */

        String state = "Mississippi";
        for (int i = 0; i < state.length(); i++){
            System.out.println(state.charAt(i));
        }
        String phrase = "etbnn";
        for (int i = 0; i < phrase.length(); i++){
            System.out.print(phrase.charAt(i) + "a");
        }
    }
}
