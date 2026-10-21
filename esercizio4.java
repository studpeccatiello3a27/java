import java.io.*; 
public class esercizio4 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int x;
int y;
int somma;
System.out.println ("dammi il numero x e y ");
x= Integer.parseInt(input.readLine());
y= Integer.parseInt(input.readLine());
somma=x + y;
if(somma>50){
    System.out.print("maggiore di 50 ed é:"+somma);
}
else{
    System.out.print("minore di 50 ed é:"+somma);
}}}