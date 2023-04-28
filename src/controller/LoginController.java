package controller;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * <p>
 * Controller for handling user login.</p>
 * <p>
 * Validates all login fields.</p>
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class LoginController {

    public LoginController() {
    }

    /**
     * Checks whether all the entered fields are present and valid.
     *
     * @param email user's email
     * @param mobileNumber South African number
     * @param date date of birth
     * @param password user's password
     * @return true if all fields are valid, false otherwise
     */
    public boolean areAllFieldsValid(String email, String mobileNumber, Date date, String password) {
        return isValidEmail(email)
                && isValidSouthAfricanMobileNumber(mobileNumber)
                && isValidDateAndAdult(date)
                && isValidPassword(password);
    }

    /**
     * Determines whether a given email is a valid email format according to the
     * following criteria:
     * <ul>
     * <li>The email must contain a username and a domain separated by an @
     * symbol.</li>
     * <li>The username may contain alphanumeric characters, underscores, plus
     * signs, asterisks, and hyphens.</li>
     * <li>The domain must consist of one or more subdomains separated by
     * periods, and end in a top-level domain (TLD) of two to seven
     * letters.</li>
     * </ul>
     *
     * @param email the email to be validated
     * @return true if the email is a valid email format, false otherwise
     */
    private boolean isValidEmail(String email) {
        // Check if email is null
        if (email == null) {
            JOptionPane.showMessageDialog(null, "Please enter an email");
        }

        // Define regular expression pattern for valid email addresses
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if email matches the pattern
        boolean isValid = pattern.matcher(email).matches();

        // If email is not valid, show error message
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email");
        }

        // Return whether email is valid
        return isValid;
    }

    /**
     * Checks whether a given mobile number is a valid South African mobile
     * number.
     *
     * @param mobileNumber the mobile number to check
     * @return true if the mobile number is a valid South African mobile number,
     * false otherwise
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
     * Checks if a given date is valid and the person is at least 18 years old.
     *
     * @param date the date to be checked
     * @return true if the date is valid and the person is at least 18 years
     * old, false otherwise
     */
    private static boolean isValidDateAndAdult(Date date) {
        // Check if the date is null
        if (date == null) {
            JOptionPane.showMessageDialog(null, "Please enter a date of birth");
            return false;
        }

        // Check if the date is in the past
        if (date.after(new Date())) {
            JOptionPane.showMessageDialog(null, "You were not born in the future!");
            return false;
        }

        // Check if the person is at least 18 years old
        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (now.get(Calendar.MONTH) < dob.get(Calendar.MONTH)
                || (now.get(Calendar.MONTH) == dob.get(Calendar.MONTH) && now.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH))) {
            age--;
        } else {
        }
        if (age < 18) {
            JOptionPane.showMessageDialog(null, "You need to be at least 18 years old to gamble!");
            return false;
        }

        // If all checks pass, the date is valid and the person is at least 18
        return true;
    }

    /**
     * Checks the following conditions to determine whether a password is valid:
     * <ul>
     * <li>is at least 10 characters in length</li>
     * <li>has at least 1 special character</li>
     * <li>has at least 1 number</li>
     * <li>has at least 1 uppercase and lowercase letter</li>
     * </ul>
     *
     * @param password to be validated
     * @return true if password is valid, false otherwise
     */
    private boolean isValidPassword(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password == null || password.length() < 10) {
            JOptionPane.showMessageDialog(null, "Password must be at least 10 characters long");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (isSpecialCharacter(ch)) {
                hasSpecialChar = true;
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

    /**
     * Checks whether a character is a special character, i.e., one of the
     * following: !@#$%^&*()-+=[]{}|\;:'",<.>/?.
     *
     * @param ch the character to check
     * @return true if the character is a special character, false otherwise
     */
    private boolean isSpecialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*()-+=[]{}|\\;:'\",<.>/?";
        return specialCharacters.contains(String.valueOf(ch));
    }

}
