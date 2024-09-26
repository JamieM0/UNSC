import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Universal Number System Converter (UNSC)!\n");
        //ToDo: Make it recognise when the program is being run for the first time
        System.out.println("It looks like it's your first time using UNSC. To convert to and from different number systems, use the standard prefixes.\n" +
                "You can use them in a format like this: 0d29384 0b. This will tell UNSC to convert the denary number 29384 to binary.\n\n" +
                "For a list of all prefixes currently supported by UNSC, enter the prefix list command: /prefix list\n" +
                "For more help, enter the help command: /help");

        /*
        ToDo: Get input, if starting with a '/', then send to Commands class to be interpreted as a command.
        If starting with a 0, (which is part of an acceptable prefix), parse the immediate value after as a number in the corresponding number system,
        if the user has not entered a destination number system, default to denery (unless denary is the input system, in which case, default to binary).

        */

    }
}