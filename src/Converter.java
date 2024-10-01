import java.text.DecimalFormat;

public class Converter {
    public static double BinaryToDenary(double binaryInput){
        return 0.0;
    }

    public static String Conversion(int inputBase, int outputBase, String inputValue)
    {

        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(8);
        double inputd=0.0;
        //Get inputVal in denary (if not already in it)
        if(inputBase==10)
            inputd = Double.parseDouble(inputValue);
        else
        {
            double tmp = 0.0;
            int column = 0;
            for(int i=inputValue.length()-1; i>=0; i--)
            {
                column = inputValue.length() - i -1;
                int curDen = 0;
                if(Character.isLetter(inputValue.charAt(i)))
                {
                    curDen = Support.numAssign(String.valueOf(inputValue.charAt(i)).toLowerCase());
                }
                else
                    curDen = Integer.parseInt(String.valueOf(inputValue.charAt(i)));

                tmp+= curDen*Math.pow(inputBase, column);
            }

            inputd=tmp;
            //This works! :)
            //System.out.println("in to denary: " + inputd);
        }

        if(outputBase==10)
            return String.valueOf(df.format(inputd));
        else
        {
            //Convert inputd from denary to the output base
            int curQuotient = (int) inputd;
            String newSoFar = "";
            while(curQuotient!=0)
            {
                int currentRemainder = (int) curQuotient % outputBase;
                String currentRemainderConverted = "";
                if(currentRemainder>=10)
                    currentRemainderConverted = Support.letterAssign(currentRemainder);
                else
                    currentRemainderConverted = String.valueOf(currentRemainder);
                newSoFar += currentRemainderConverted;
                curQuotient/=outputBase;
            }
            return Support.reverseString(newSoFar);
        }
    }
}
