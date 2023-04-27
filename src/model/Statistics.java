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
 *   - Column 1: number of wins
 *   - Column 2: number of losses
 *   - Column 3: number of pushes (ties)
 * 
 * The file is named 'statistics.csv' and is stored in the 'db/' directory.
 * 
 * @author michael
 */
public class Statistics {
    private static final String CSV_FILE = "db/statistics.csv";
    private static final String[] CSV_HEADERS = {"wins", "losses", "pushes"};

    private int wins;
    private int losses;
    private int pushes;

    public Statistics() {
        this.wins = 0;
        this.losses = 0;
        this.pushes = 0;
    }

    public Statistics(int wins, int losses, int pushes) {
        this.wins = wins;
        this.losses = losses;
        this.pushes = pushes;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getPushes() {
        return pushes;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setPushes(int pushes) {
        this.pushes = pushes;
    }

    public void incrementWins() {
        this.wins++;
        save();
    }

    public void incrementLosses() {
        this.losses++;
        save();
    }

    public void incrementPushes() {
        this.pushes++;
        save();
    }

    public void save() {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE))) {
            writer.writeNext(CSV_HEADERS);
            String[] data = {String.valueOf(wins), String.valueOf(losses), String.valueOf(pushes)};
            writer.writeNext(data);
        } catch (IOException e) {
        }
    }

    public static Statistics load() throws CsvValidationException {
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
        } catch (IOException e) {
        }
        return stats;
    }
}
