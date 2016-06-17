
public class StackOver {

    public static void main(String[] argv){
        try{
            main(null);
        }
        catch(StackOverflowError e){
            System.err.println("ouch!");
        }
    }
}
