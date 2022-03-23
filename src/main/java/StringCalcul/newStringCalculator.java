package StringCalcul;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class newStringCalculator {

    public Integer add(String text) {
        int result = 0;

        if(!checkEmpty(text)) {
            result = calculate(getOnlyNumbers(text));
        }
        return result;
    }

    public boolean checkEmpty(String text) {
        return text == null || text.isEmpty();
    }

    public String[] getOnlyNumbers(String text) {
        String[] numbers;
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(m.find()) {
            String splitSymble = m.group(1);
            numbers = m.group(2).split(splitSymble);
        } else {
            numbers = text.split(",|:");
        }

        return numbers;
    }

    public int calculate(String[] numbers) {
        int sum = 0;
        for(String number:numbers) {
            int convertNumber = Integer.valueOf(number);
            if(convertNumber<0){
                throw new RuntimeException("음수존재하면 안됨");
            }
            sum += convertNumber;
        }

        return sum;
    }


}
