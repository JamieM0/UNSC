import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputVal = "";
        int inputBase = 10;
        int outputBase = 2;


            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Universal Number System Converter (UNSC)!\n");
            //ToDo: Make it recognise when the program is being run for the first time
            System.out.println("It looks like it's your first time using UNSC. To convert to and from different number systems, use the standard prefixes.\n" +
                "You can use them in a format like this: 0d29384 0b. This will tell UNSC to convert the denary number 29384 to binary.\n\n" +
                "For a list of all prefixes currently supported by UNSC, enter the prefix list command: /prefix list\n" +
                "For more help, enter the help command: /help");

        while(1==1){
            String input = scanner.nextLine();


            if(input.charAt(0) == '/')
            {
                Commands.Interpreter(input);
            }
            else {
                inputVal = Support.untilSpace(input).substring(2);
                //System.out.println("In: " + inputVal);
                switch(input.trim().toLowerCase().charAt(1))
                {
                    case 'd':
                        inputBase = 10;
                        break;
                    case 'b':
                        inputBase = 2;
                        break;
                    case 'x':
                        inputBase = 16;
                        break;
                    case 'o':
                        inputBase = 8;
                        break;
                    case 'z':
                        inputBase = 36;
                        break;
                }

                switch(Support.afterSpace(input).charAt(1))
                {
                    case 'd':
                        outputBase = 10;
                        break;
                    case 'b':
                        outputBase = 2;
                        break;
                    case 'x':
                        outputBase = 16;
                        break;
                    case 'o':
                        outputBase = 8;
                        break;
                    case 'z':
                        outputBase = 36;
                        break;
                }

                String out = Converter.Conversion(inputBase, outputBase, inputVal);
                System.out.println("The result of the conversion is: " + out);
            /*
            ToDo: Get input, if starting with a '/', then send to Commands class to be interpreted as a command.
            If starting with a 0, (which is part of an acceptable prefix), parse the immediate value after as a number in the corresponding number system,
            if the user has not entered a destination number system, default to denery (unless denary is the input system, in which case, default to binary).
            */
            }
        }

    }
}