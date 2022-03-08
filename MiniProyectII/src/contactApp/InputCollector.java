package contactApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Eduardo Campos
 */

public class InputCollector {

  Scanner input = new Scanner(System.in);
  static List<Contact> contact1 = new ArrayList<>();

  /**
   * @param prompt
   * @return
   */
  public static String getUserInput(String prompt) {
    Scanner in = new Scanner(System.in);
    InputCollector c1 = new InputCollector();
    int option = 0;
    System.out.println(prompt);
    option = in.nextInt();
    switch (option) {
      case 1:
        c1.allContacts(contact1);
        break;
      case 2:
        c1.addContact(contact1);
        break;
      case 3:
        c1.deleteContact(contact1);
        break;
      case 4:
        c1.updateContact(contact1);
        break;
      case 5:
        System.out.println("Bye!");
        System.exit(0);
        break;
      default:
        System.out.println("Invalid Input. Enter number between 1 and 5");
    }

    return "";
  }

  /**
   * It is a method that receives a list of type contact. In this method it's validated that the
   * list is not empty. If it is not empty it performs an iteration with a for loop and shows its
   * content. Otherwise it prints a "List is empty" message.
   *
   * @param list type Contact
   */
  public void allContacts(List<Contact> list) {
    // If the list is not empty, it shows the content of the list
    if (!list.isEmpty()) {
      for (Object contactList : list) {
        System.out.println(contactList);
      }
    } else {
      System.out.println("List is empty!");
    }
  }

  /**
   * This method adds a new contact to the contact list. It requests data from the user, if the name
   * or mobile are empty, it requests them again. when it gets the data, it stores it in local
   * variables and those variables are then passed to an instance of object type Contact and added
   * to the list.
   *
   * @param list type Contact
   */
  public void addContact(List<Contact> list) {
    boolean flag = false;
    int index = 0;
    do {
      System.out.println("[ Add New Contact ]");
      System.out.println("Enter Name:");
      String name = input.nextLine();
      if (name.isEmpty()) {
        System.out.println("You must enter this field");
        continue;
      }
      System.out.println("Enter Mobile:");
      String mobile = input.nextLine();
      if (mobile.isEmpty()) {
        System.out.println("You must enter this field");
        System.out.println("Enter Mobile:");
        mobile = input.nextLine();
      }
      System.out.println("Enter Work:");
      String work = input.nextLine();
      System.out.println("Enter Home:");
      String home = input.nextLine();
      System.out.println("Enter City:");
      String city = input.nextLine();
      // User information is saved in the object contact1
      Contact contact1 = new Contact(name, mobile, work, home, city);
      // If name and mobile are not empty fields,  then add a new contact.
      list.add(contact1);
      for (Contact contact : list) {
        contact.setIndex(index);
        index++;
        // }
        System.out.println(
            list.get(index - 1).getName() + " - successfully added a new contact! \n");
        flag = true;
      }
    } while (flag == false);
  }

  /**
   * @param list - contact type list
   * @return
   */
  public void updateContact(List<Contact> list) {
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    if (!list.isEmpty()) {
      System.out.println("Enter the index of the contact to update");
      int index = in2.nextInt();
      System.out.println("Enter Name");
      String name = in.nextLine();
      System.out.println("Enter Mobile");
      String mobile = in.nextLine();
      System.out.println("Enter Work");
      String work = in.nextLine();
      System.out.println("Enter Home:");
      String home = in.nextLine();
      System.out.println("Enter City:");
      String city = in.nextLine();
      // User information is saved in the object contact1
      Contact contact1 = new Contact(name, mobile, work, home, city);
      // Modify in the list the contact according to the selected index.
      list.set(index, contact1);
      System.out.println("Contact update!");
    } else {
      System.out.println("List in empty! Please Add a new contact");
    }

  }

  /**
   * @param list
   * @return
   */
  public void deleteContact(List<Contact> list) {
    Scanner in = new Scanner(System.in);
    int index = 0;
    if (!list.isEmpty()) {
      System.out.println("Enter the index of the contact to delete");
      index = in.nextInt();
      Contact contact = new Contact();
      // Delete in the list the contact according to the selected index.
      list.remove((index));
      System.out.println("Contact Removed!");
    } else {
      System.out.println("List in empty! Please Add a new contact");
    }
  }

}
