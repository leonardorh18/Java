

public class Exe8{

    public static void main(String[] args) {

       
       int n = 100;
       while (n<=200){

        boolean primo = true;

        for (int i = 2; i<n; i++){
            
                if (n%i == 0){
                    primo = false;
                    
                }        
        }

        if (primo){

            System.out.println(n+" é primo");
            
        }
            n++;

       }
        
    }


}