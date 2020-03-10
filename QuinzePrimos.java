

public class Main{

    public static void main(String[] args) {

       int qntd = 0;
       int n = 1;
       while (qntd < 15){

        boolean primo = true;

        for (int i = 2; i<n; i++){
            
                if (n%i == 0){
                    primo = false;
                    
                }        
        }

        if (primo){

            System.out.println(n+" é primo");
            qntd ++;
        }
            n++;

       }
        
    }


}