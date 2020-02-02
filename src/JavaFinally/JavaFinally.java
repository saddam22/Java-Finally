
package JavaFinally;

public class JavaFinally {

    public static void main(String[] args) {
      
        try {
            int x = 300;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Blocked is Executed!!!");
        }
        
    }
    
}
