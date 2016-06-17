package sol;

import javax.swing.JOptionPane;

public class PalindromGrafisch {
    
    public static void main (String args[]) {
        String wort = JOptionPane.showInputDialog("Bitte Wort eingeben : ");
        palindrom(wort);
    }

    public static void palindrom(String wort) {
        
        
        if (wort.length()<=1) {
            JOptionPane.showMessageDialog(null, "Das eingegebene Wort ist ein Palindrom");
        }
        
        
        else if (wort.charAt(0) == wort.charAt(wort.length()-1)) {
                String result = wort.substring(1, wort.length()-1);
                palindrom(result);
            
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Wort ist kein Palindrom");
        }
            
                
                
            
        }
        
        
    
            
    
    }
