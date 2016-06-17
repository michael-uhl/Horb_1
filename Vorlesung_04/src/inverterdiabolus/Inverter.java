package inverterdiabolus;

import java.util.*;

public class Inverter 
{
    public String yoloInvert(String input)
    {
        String ausgabe = "";
        for (int i =  input.length(); i > 0; i --)
        {
            ausgabe = ausgabe + input.charAt(i - 1);
        }
        return ausgabe;
    }
}