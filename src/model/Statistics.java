package model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

/**
 * The Statistics class represents a set of statistics for a blackjack game.
 * Statistics are stored in a CSV file with the following format:
 * <ul>
 * <li><b>Column 1:</b> number of wins</li>
 * <li><b>Column 2:</b> number of losses</li>
 * <li><b>Column 3:</b> number of pushes(ties)</li>
 * </ul>
 *
 * <p>
 * The file is named `statistics.csv` and is stored in the 'db/' directory.</p>
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Statistics {

    private static final String CSV_FILE = "db/statistics.csv"; // csv file that stores the stats
    private static final String[] CSV_HEADERS = {"wins", "losses", "pushes"}; // headers for the csv file

    private int wins;
    private int losses;
    private int pushes;

    /**
     * Constructs a new Statistics object with all statistics initialized to 0.
     */
    public Statistics() {
        this.wins = 0;
        this.losses = 0;
        this.pushes = 0;
    }

    /**
     * Constructs a new Statistics object with the given statistics.
     *
     * @param wins the number of wins
     * @param losses the number of losses
     * @param pushes the number of pushes (ties)
     */
    public Statistics(int wins, int losses, int pushes) {
        this.wins = wins;
        this.losses = losses;
        this.pushes = pushes;
    }

    /**
     * Gets the number of wins.
     *
     * @return wins number of wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Gets the number of losses.
     *
     * @return losses number of losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Gets the number of pushes (ties).
     *
     * @return pushes number of pushes
     */
    public int getPushes() {
        return pushes;
    }

    /**
     * Sets the number of wins.
     *
     * @param wins the new number of wins
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Sets the number of losses.
     *
     * @param losses the new number of losses
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     *
     * Sets the number of pushes (ties).
     *
     * @param pushes the new number of pushes
     */
    public void setPushes(int pushes) {
        this.pushes = pushes;
    }

    /**
     * Increments the number of wins by 1 and saves the new statistics to the
     * CSV file.
     */
    public void incrementWins() {
        this.wins++;
        save();
    }

    /**
     * Increments the number of losses by 1 and saves the new statistics to the
     * CSV file.
     */
    public void incrementLosses() {
        this.losses++;
        save();
    }

    /**
     * Increments the number of pushes (ties) by 1 and saves the new statistics
     * to the CSV file.
     */
    public void incrementPushes() {
        this.pushes++;
        save();
    }

    /**
     * <p>
     * This method saves the current statistics (number of wins, losses, and
     * pushes) to a CSV_FILE file. The file path is defined by the CSV_FILE
     * constant in the Statistics class.</p>
     * <p>
     * The method uses a CSVWriter object to write the data to the file. If an
     * IOException occurs during the file writing process, it is caught and
     * ignored.</p>
     */
    private void save() {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE))) {
            writer.writeNext(CSV_HEADERS);
            String[] data = {String.valueOf(wins), String.valueOf(losses), String.valueOf(pushes)};
            writer.writeNext(data);
        } catch (IOException e) {
        }
    }

    /**
     * <p>
     * This static method loads the statistics from the CSV file located at the
     * path defined by the CSV_FILE constant in the Statistics class. The method
     * uses a CSVReader object to read the data from the file.</p>
     * <p>
     * If the CSV file does not have the expected headers, an IOException is
     * thrown. The method returns a Statistics object with the values read from
     * the CSV file.</p>
     * <p>
     * If an IOException occurs during the file reading process, it is caught
     * and ignored. If a CsvValidationException is thrown during the file
     * reading process, it is handled internally and an empty Statistics object
     * is returned.</p>
     *
     * @return a Statistics object with the values read from the CSV file, or an
     * empty Statistics object if there was a problem with the CSV file format
     * @throws IOException if there is a problem with the file reading process
     * or the CSV file headers are invalid
     */
    public static Statistics load() throws IOException {
        Statistics stats = new Statistics();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            String[] headers = reader.readNext();
            if (!headers[0].equals(CSV_HEADERS[0]) || !headers[1].equals(CSV_HEADERS[1]) || !headers[2].equals(CSV_HEADERS[2])) {
                throw new IOException("Invalid CSV headers");
            }
            String[] data = reader.readNext();
            if (data != null) {
                stats.setWins(Integer.parseInt(data[0]));
                stats.setLosses(Integer.parseInt(data[1]));
                stats.setPushes(Integer.parseInt(data[2]));
            }
        } catch (CsvValidationException e) {
            // handle the exception internally
            System.err.println("Error: invalid CSV file format");
        } catch (IOException e) {
            // rethrow the IOException to the calling function
            throw new IOException("Error reading CSV file", e);
        }
        return stats;
    }
    
}
