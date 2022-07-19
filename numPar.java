import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class numPar {
public static void main(String[] args) throws IOException {
InputStreamReader inputStreamReader = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(inputStreamReader);

System.out.println("Type the first value: ");
String strNum1 = reader.readLine();
Integer number = Integer.parseInt(strNum1);

boolean numberB = (number % 2) == 0;

if(numberB){
  System.out.println("The number is even");
} else{
  System.out.println("The number is not even");
}


}
}