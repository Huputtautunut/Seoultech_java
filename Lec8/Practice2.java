
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) {
        // Check if command line arguments are provided correctly
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText <textToRemove> <filename>");
            return;
        }

        String textToRemove = args[0];
        String filename = args[1];

        // Read the file and remove occurrences of the specified string
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Remove all occurrences of the specified string
        String updatedContent = content.toString().replaceAll(textToRemove, "");

        // Write the updated content back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(updatedContent);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Occurrences of \"" + textToRemove + "\" removed from " + filename + ".");
    }
}
