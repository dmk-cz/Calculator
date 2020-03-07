import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBuffer {

    // Get user input from the console.
    public String getUserInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        try {
            str = reader.readLine();
        } catch (IOException e) {
            System.out.println("Incorrectly entered data. Try again");
            getUserInput();
        }

        return str;
    }
}
