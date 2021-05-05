package Week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class InventoryApp {
  public static void main(String[] arguments) throws IOException {






  switch (arguments[0]) {

    case "-a":


      String[] thingsToWriteIntoTheFile = new String[arguments.length -1];
      for (int i = 1; i < arguments.length ; i++) {
        thingsToWriteIntoTheFile[i] = arguments[i];

      }

      Path inventoryFilePath = Paths.get("C:\\Users\\B\\Documents\\GitHub\\green-fox-academy\\mrbelabalogh\\src\\Week4\\inventory.txt");
      Files.write(inventoryFilePath, Arrays.asList(thingsToWriteIntoTheFile), StandardOpenOption.APPEND);


  }
  }
}
