import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class promedio {
public static void main(String[] args) throws IOException {
InputStreamReader inputStreamReader = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(inputStreamReader);

System.out.println("enter the first value: ");
String strNum1 = reader.readLine();
Integer num1 = Integer.parseInt(strNum1);

System.out.println("enter the second value: ");
String strNum2 = reader.readLine();
Integer num2 = Integer.parseInt(strNum2);

System.out.println("enter the third value: ");
String strNum3 = reader.readLine();
Integer num3 = Integer.parseInt(strNum3);

Integer result = (num1 + num2 + num3);

Double average = Double.valueOf(result) / 3;
System.out.println("Your average is: " + average);




}
}