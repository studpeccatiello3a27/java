import java.io.*; 
public class esercizio7 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
double totale;
double sconto;
System.out.println ("dammi totale spesa :");
totale= Double.parseDouble(input.readLine());
if(totale<50){
    System.out.print("il totale é:"+totale);
}
else{
    sconto=(totale*10)/100;
    totale=totale-sconto;
    
    System.out.print("il prezzo scontato é:"+totale);
}}}