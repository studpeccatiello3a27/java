import java.io.*; 
public class esercizio5 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n;
System.out.println ("dammi il numero ");
n= Integer.parseInt(input.readLine());
if(n%2==0){
    n=n+1;
    System.out.print("numero pari e il suo successivo é "+n);
}
else{
    n=n-1;
    System.out.print("numero dispari e il suo precedente é "+n);
}
}
}