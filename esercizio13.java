import java.io.*; 
public class esercizio13 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
String pass;
String nome;
String nomec;
String passc;
passc="1234";
nomec= "admin";
System.out.println ("inserisci password :");
pass= input.readLine();
System.out.println ("inserisci utente :");
nome= input.readLine();
if(pass.equals(passc)&& nome.equals(nomec)){
    System.out.print("accesso consentito");
}
else{
    if(pass!=passc && nome.equals(nomec)){
    System.out.print("accesso negato, password sbagliata");
}
else{
    if(pass.equals(passc) && nome!=nomec) {
        System.out.print("accesso negato, utente sbagliato");
}
else{
    System.out.print("Credenziali errate");

}}}}}