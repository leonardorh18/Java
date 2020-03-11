public class Main{

    public static int ehprimo(int p, int h){
        int aux = 0;

        while (aux < p){

            aux += h;
            if (aux == p){

                return 1;
            }

        }
        return 0;
    }
    public static void main(String[] args) {

       int qntd = 0;
       int n = 1;
       while (qntd < 15){

        boolean primo = true;

        for (int i = 2; i<n; i++){

                if (ehprimo(n, i) == 1){
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