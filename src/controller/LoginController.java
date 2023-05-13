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
     * @return {@code true} if all fields are valid, {@code false} otherwise
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
     * @return {@code true} if the email is a valid email format, {@code false}
     * otherwise
     */
    private boolean isValidEmail(String email) {
        // check if email is null
        if (email == null) {
            JOptionPane.showMessageDialog(null, "Please enter an email");
        }

        // define regular expression pattern for valid email addresses
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        // check if email matches the pattern
        boolean isValid;
        assert email != null;
        isValid = pattern.matcher(email).matches();

        // if email is not valid, show error message
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email");
        }

        return isValid;
    }

    /**
     * Checks whether a given mobile number is a valid South African mobile
     * number.
     *
     * @param mobileNumber the mobile number to check
     * @return {@code true} if the mobile number is a valid South African mobile
     * number, {@code false} otherwise
     */
    private boolean isValidSouthAfricanMobileNumber(String mobileNumber) {
        // remove any non-digit characters from the mobile number
        mobileNumber = mobileNumber.replaceAll("[^\\d]", ""); // TODO: simplify to \D

        // check if the mobile number is of the correct length
        if (mobileNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Your mobile number is too short");
            return false;
        }

        // check if the mobile number starts with a valid South African country code
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

        return true;
    }

    /**
     * Checks if a given date of birth is valid and the person is at least 18
     * years old.
     *
     * @param date the date of birth to be checked
     * @return {@code true} if the date is valid and the person is at least 18
     * years old, {@code false} otherwise
     */
    private static boolean isValidDateAndAdult(Date date) {
        // check if the date is null
        if (date == null) {
            JOptionPane.showMessageDialog(null, "Please enter a date of birth");
            return false;
        }

        // check if the date is in the past
        if (date.after(new Date())) {
            JOptionPane.showMessageDialog(null, "You were not born in the future!");
            return false;
        }

        // check if the person is at least 18 years old
        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (now.get(Calendar.MONTH) < dob.get(Calendar.MONTH)
                || (now.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
                && now.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }

        if (age < 18) {
            JOptionPane.showMessageDialog(null, "You need to be at least 18 years old to gamble!");
            return false;
        }

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
     * @param password the password to be validated
     * @return {@code true} if password is matches all criteria, {@code false}
     * otherwise
     */
    private boolean isValidPassword(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        // check if password is more than 10 characters
        if (password == null || password.length() < 10) {
            JOptionPane.showMessageDialog(null, "Password must be at least 10 characters long");
            return false;
        }

        // check if password has an uppercase letter, lowercase letter, a digit and a special character
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
     * @return {@code true} if the character is a special character,
     * {@code false} otherwise
     */
    private boolean isSpecialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*()-+=[]{}|\\;:'\",<.>/?";
        return specialCharacters.contains(String.valueOf(ch));
    }

}
