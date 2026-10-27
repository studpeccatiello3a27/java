import java.io.*; 
public class esercizio14 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int eta;
System.out.println ("Inserisci eta :");
eta= Integer.parseInt(input.readLine());
if(eta<14 ){
    System.out.print("Il prezzo del biglietto é 6 euro");
}
else{
    System.out.print("Il prezzo del biglietto é 10 euro");

}}}