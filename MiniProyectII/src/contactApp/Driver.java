package contactApp;

/**
 * @author Eduardo Campos
 */

public class Driver {

  public static void main(String[] args) {
    printMenu();
  }

  public static void printMenu() {
    System.out.print(""
        + "        Contact App       "
        + "\n| 1. List all Contacts |"
        + "\n| 2. Add new Contact   |"
        + "\n| 3. Remove Contact    |"
        + "\n| 4. Update Contact    |"
        + "\n| 5. Quit              |\n\n");

    String optionInput = InputCollector.getUserInput("Enter you option: ");
    printMenu();
  }
}



