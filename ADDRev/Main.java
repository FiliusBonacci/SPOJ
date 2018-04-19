import java.io.InputStream;
import java.util.Scanner;


/* ADDREV - - Adding Reversed Numbers
* @author - Paweł Jadanowski
* @date 2018-04-18
*/
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();

        while ( howMany-- > 0) {

            int a = scanner.nextInt(),
                b = scanner.nextInt();

            int rev_a = Integer.parseInt(new StringBuffer(String.valueOf(a)).reverse().toString());
            int rev_b = Integer.parseInt(new StringBuffer(String.valueOf(b)).reverse().toString());


            int rev_sum = rev_a + rev_b;
            int rev_rev_sum = Integer.parseInt(new StringBuffer(String.valueOf(rev_sum)).reverse().toString());

            System.out.println(rev_rev_sum);
        }
    }
}