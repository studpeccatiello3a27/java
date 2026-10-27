import java.io.*; 
public class esercizio10 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
double saldo;
double importo;
saldo=500;
System.out.println ("Quanto vuoi prelevare");
importo= Double.parseDouble(input.readLine());
if(importo<=0){
    System.out.print("Importo Non valido");
}
else{
if(importo>saldo){
    System.out.print("Saldo Insufficiente");
}
else{
    saldo=saldo-importo;
    System.out.print("Prelevamento eseguito e il saldo rimanente é"+saldo);
}}}}