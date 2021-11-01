import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine()
                .split(" ");


        int big = Integer.parseInt(strings[0]);
        int smol = Integer.parseInt(strings[0]);


        String[] evenOdd = strings;
        int rest = 0;
        int even = 0;

        for(int i=0;i<evenOdd.length;i++) {

            String[] symbols = evenOdd[i].split(""); // ["2", "1", "3", "4"]

            int amountOfEven = 0;
            int amountOfOdd = 0;

            for(int j=0; j<symbols.length; j++) {

                if(Integer.parseInt(symbols[j])%2 == 0) {
                    amountOfEven++;
                }
                else if(Integer.parseInt(symbols[j])%2 == 1){
                    amountOfOdd++;
                }
            }

            if(amountOfEven == symbols.length) {
                even++;
            }
            else if(amountOfOdd == amountOfEven){
                rest++;
            }
        }

        String[] stringsSorted = strings;
        Arrays.sort(stringsSorted, (a, b) -> a.length() - b.length());

        for (int i = 0; i<strings.length; i++){
            if(Integer.parseInt(strings[i])>big) {
                big = Integer.parseInt(strings[i]);
            }
            if(Integer.parseInt(strings[i])<smol) {
                smol = Integer.parseInt(strings[i]);
            }
        }

        System.out.printf("наим %s, l=%s наиб %s, l=%s ", smol, String.valueOf(smol).length(), big, String.valueOf(big).length());


        System.out.println(Arrays.toString(stringsSorted));

        System.out.printf("чётные: %s \n" , even);

        System.out.printf("одинаковых четных и нечетных: %s", rest);

    }
}