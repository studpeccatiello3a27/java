import java.io.*; 
public class esercizio9 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
String pass;
String passc;
passc="java123";
System.out.println ("inserisci password :");
pass= input.readLine();
if(pass.equals(passc)){
    System.out.print("accesso consentito");
}
else{
    System.out.print("password errata");
}}}