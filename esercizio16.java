import java.io.*; 
public class esercizio16 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int peso;
System.out.println ("Inserisci peso pacco :");
peso= Integer.parseInt(input.readLine());
if(peso<=2 ){
    System.out.print("La spedizione costa 5 euro ");
}
else{
if(peso<=10){
    System.out.print("La spedizione costa 10 euro");
}
else{
    if(peso<=20){
    System.out.print("La spedizione costa 15 euro");
    }
    else{
        System.out.print("Pacco troppo pesante");
}}}}}