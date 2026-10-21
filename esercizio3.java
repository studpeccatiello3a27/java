import java.io.*; 
public class esercizio3 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n;
System.out.println ("dammi il numero ");
n= Integer.parseInt(input.readLine());
if(n>0){
    System.out.print("positivo");
}
else{
    System.out.print("negatvo");
}
}
}