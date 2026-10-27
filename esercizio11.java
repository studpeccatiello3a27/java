import java.io.*; 
public class esercizio11 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int percentuale;
System.out.println ("Inserisci percentuale batteria :");
percentuale= Integer.parseInt(input.readLine());
if(percentuale<0 || percentuale>100 ){
    System.out.print("Percentuale non valida");
}
else{
if(percentuale<=10){
    System.out.print("Batteria Scarica");
}
else{
    if(percentuale<=30){
    System.out.print("Batteria bassa");
    }
    else{
        System.out.print("Batteria sufficiente");
}}}}}