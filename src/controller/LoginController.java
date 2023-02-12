package controller;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class LoginController {

    public LoginController() {
    }
    
    public boolean areAllFieldsValid(String email, String mobileNumber, String password) {
        return 
                isValidEmail(email) && 
                isValidSouthAfricanMobileNumber(mobileNumber) &&
                isValidPassword(password);
    }

    /**
    * Determines whether a given email is a valid email format according to the following criteria:
    * - The email must contain a username and a domain separated by an @ symbol.
    * - The username may contain alphanumeric characters, underscores, plus signs, asterisks, and hyphens.
    * - The domain must consist of one or more subdomains separated by periods, and end in a top-level domain (TLD)
    *   of two to seven letters.
    *
    * @param email the email to be validated
    * @return true if the email is a valid email format, false otherwise
    */
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; // regular expression representing a valid email
        Pattern pattern = Pattern.compile(emailRegex);
        
        boolean isValid = pattern.matcher(email).matches();
        
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email");
        }
        
        return isValid;
    }

    /**
    * Checks whether a given mobile number is a valid South African mobile number.
    *
    * @param mobileNumber the mobile number to check
    * @return true if the mobile number is a valid South African mobile number, false otherwise
    */
    private boolean isValidSouthAfricanMobileNumber(String mobileNumber) {
        // Remove any non-digit characters from the mobile number
        mobileNumber = mobileNumber.replaceAll("[^\\d]", "");

        // Check if the mobile number is of the correct length
        if (mobileNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Your mobile number is too short");
            return false;
        }

        // Check if the mobile number starts with a valid South African country code
        String[] validCountryCodes = {"+27", "27", "0"};
        boolean validCountryCode = false;
        for (String code : validCountryCodes) {
            if (mobileNumber.startsWith(code)) {
                validCountryCode = true;
                break;
            }
        }
        if (!validCountryCode) {
            JOptionPane.showMessageDialog(null, "Your country code is not South African");
            return false;
        }

        // If all checks pass, the mobile number is considered valid
        return true;
    }
        
    /**
     * Checks the following conditions to determine whether a password is valid:
     * - is at least 10 characters in length
     * - has at least 1 special character
     * - has at least 1 number
     * - has at least 1 uppercase and lowercase letter
     * 
     * @param password to be validated
     * @return whether password is valid
     */
    private boolean isValidPassword(String password) {
        if (password == null || password.isEmpty() || password.length() < 10) {
            JOptionPane.showMessageDialog(null, "Password must be at least 10 characters long");
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            switch (ch) {
                case '!':
                case '@':
                case '#':
                case '$':
                case '%':
                case '^':
                case '&':
                case '*':
                case '(':
                case ')':
                case '-':
                case '+':
                case '=':
                case '[':
                case ']':
                case '{':
                case '}':
                case '|':
                case '\\':
                case ';':
                case ':':
                case '\'':
                case '\"':
                case ',':
                case '<':
                case '.':
                case '>':
                case '/':
                case '?':
                    hasSpecialChar = true;
                    break;
                default:
                    if (Character.isUpperCase(ch)) {
                        hasUpperCase = true;
                    } else if (Character.isLowerCase(ch)) {
                        hasLowerCase = true;
                    } else if (Character.isDigit(ch)) {
                        hasNumber = true;
                    }
                    break;
            }
        }

        if (!hasUpperCase) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one uppercase letter");
        }
        if (!hasLowerCase) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one lowercase letter");
        }
        if (!hasNumber) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one number");
        }
        if (!hasSpecialChar) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one special character");
        }

        return hasUpperCase && hasLowerCase && hasNumber && hasSpecialChar;
    }
    

}
