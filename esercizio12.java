import java.io.*; 
public class esercizio12 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
Integer num;
System.out.println ("Inserisi numero");
num= Integer.parseInt(input.readLine());
if(num<0){
    System.out.print("Numero negativo");
}
else{
if(num==0){
    System.out.print("Numero zero");
}
else{
    if(num%2==0){
    System.out.print("Numero pari");
    }
    else{
        System.out.print("Numero dispari");

}}}}}