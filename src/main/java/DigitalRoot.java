import java.util.InputMismatchException;

public class DigitalRoot {
    public Object check(long number) {

        if(number <= 0) {
            throw new InputMismatchException();
        }

        String numberOfString = String.valueOf(number);

        while (numberOfString.length() != 1) {
            long answer = 0;
            for (int i = 0; i < numberOfString.length(); i++) {
                answer += Character.getNumericValue(numberOfString.charAt(i));
            }

            numberOfString = Long.toString(answer);
        }

        return Long.valueOf(numberOfString);
    }
}
