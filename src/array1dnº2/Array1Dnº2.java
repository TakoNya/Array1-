package array1dnº2;

public class Array1Dnº2 {
   
    public static void main(String[] args) {
        char[] simbolo = new char[10];
        simbolo[0]='a';
        simbolo[1]='x';
        simbolo[4]='@';
        simbolo[6]= ' ';
        simbolo[7]='+';
        simbolo[8]='Q';
        
        int suma = 0;
        for (char n:simbolo){
            System.out.print(n + " ");
            suma += n;
            
        }
       
    }
    
}
