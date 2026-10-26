import java.io.*; 
public class esercizio6 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int eta;
System.out.println ("dammi un eta :");
eta= Integer.parseInt(input.readLine());
if(eta>=18){
    System.out.print("maggiorenne e ha anni:"+eta);
}
else{
    System.out.print("minorenne ed ha anni:"+eta);
}}}