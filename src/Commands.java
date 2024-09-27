public class Commands {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void Interpreter(String command){
        //Interprets the command
        String cmd = command.trim().toLowerCase().substring(1);
        switch(cmd){
            case "help":
            case "h":
            case "?":
                Help();
                break;
            case "prefix list":
            case "prefix":
            case "list":
                PrefixList();
                break;
            default:
                System.out.println(ANSI_RED + "Unknown command: " + cmd + ANSI_RESET + "\n");
        }
    }

    public static void PrefixList (){
        System.out.println("Here is a list of supported prefixes:");
        System.out.println("Prefix \t Base");
        System.out.println("0d     \t 10 (Denary)");
        System.out.println("0b     \t 2 (Binary)");
        System.out.println("0x     \t 16 (Hexadecimal)");
        System.out.println("0o     \t 8 (Octal)");
        System.out.println("0z     \t 36\n");
    }

    public static void Help(){
        System.out.println("Here is a list of supported commands:\n");
    }
}
