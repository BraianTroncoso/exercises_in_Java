import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class mainPractica {
public static void main(String[] args) throws IOException {
InputStreamReader inputStreamReader = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(inputStreamReader);

int counter = 1;

while (counter < 101) {
  if ((counter%counter % 1)== 0){
    System.out.println(counter);
  } else{
    
  }
  counter++;
}

}
}