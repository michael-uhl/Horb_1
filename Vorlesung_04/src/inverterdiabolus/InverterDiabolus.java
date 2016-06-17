package inverterdiabolus;

import java.util.*;

public class InverterDiabolus 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Welche Zeichenketten sollen invertiert werden ?");
        
        String eingelesen = s1.nextLine();
        String invertiert = null;
        
        Inverter i1 = new Inverter();
        invertiert = i1.yoloInvert(eingelesen);
        
        
        s1.close();
        
        System.out.println("Die invertierte EIngabe lautet: " + invertiert );
    }
}