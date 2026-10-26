import java.io.*; 
public class esercizio8 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int temperatura;
System.out.println ("Inserisci la temperatura :");
temperatura= Integer.parseInt(input.readLine());
if(temperatura>0){
    System.out.print("Sopra zero:"+temperatura);
}
else{
if(temperatura<0){
    System.out.print("Sotto zero"+temperatura);
}
else{
    System.out.print("Uguale a zero:"+temperatura);
}}}}