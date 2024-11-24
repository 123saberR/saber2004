

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\M2I\\TD\\test.txt");
        char targetChar = 'j';

        try {

            int frequency = frequency_of_character(file, targetChar);

            System.out.println("Character '" + targetChar + "' appears " + frequency + " times.");
        } catch (FileNotFoundException e) {

            System.out.println("File not found!");
        }
    }


    public static int frequency_of_character(File file, char character) throws FileNotFoundException {
        int number_of_character = 0;


        if (!file.exists()) {
            System.out.println("The file does not exist.");
            return 0;
        }

        Scanner inFile = new Scanner(file);


        while (inFile.hasNextLine()) {
            String line = inFile.nextLine();


            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == character) {
                    number_of_character++;
                }
            }
        }


        inFile.close();

        return number_of_character;
    }
}
