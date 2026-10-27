import java.io.*; 
public class esercizio15 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int livello;
String nome;
System.out.println ("Inserisci nome giocatore :");
nome= input.readLine();
System.out.println ("Inserisci livello :");
livello= Integer.parseInt(input.readLine());
if(nome.equals("luca")&& livello>=10 ){
    System.out.print("Accesso al torneo Consentito");
}
else{
    System.out.print("Accesso non Consentito");

}}}