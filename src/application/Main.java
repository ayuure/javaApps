package application;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.time.LocalTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {
         //String record;
         LocalTime created_at=LocalTime.now();
         created_at.toString();
         List<Map<String,String>> database = new ArrayList<>();
         int id =0;
       // Scanner input = new Scanner(System.in);

        int selection;
        System.out.println("please enter  1 to enter user name, 2 to delete user name, to edit a record press 3 and 0 to exit");
        Scanner select  = new Scanner(System.in);
        selection = select.nextInt();

        if( selection==1) {
            do {
                Map<String, String> recordList = new HashMap<>();
                System.out.println("Enter user name");
                Scanner input = new Scanner(System.in);
                String record = input.nextLine();
                id += 1;
                String Id = String.valueOf(id);
                record = record.toLowerCase();
                String[] nameArray = record.split(" ");
                String newRecord=" ";
                for(String a : nameArray) {
                    String firstLetter = a.substring(0, 1);
                    String remainingLetters = a.substring(1, a.length());
                    newRecord+= firstLetter.toUpperCase() + remainingLetters+" ";
                }
                recordList.put("username", newRecord.trim());
                recordList.put("created at ", created_at.toString());
                recordList.put("ID", Id);
                System.out.println(recordList);
                database.add(recordList);
                System.out.println(database);
                System.out.println("please enter  1 to enter user name, 2 to delete user name, to edit a record press 3 and 0 to exit");
                selection = input.nextInt();
            }while (selection == 1);
        }
        System.out.println(database);
        if(selection==2){

            do {
                System.out.println("Enter the id of the record you wish to delete from the database");
                Scanner delete = new Scanner(System.in);
                int remove = delete.nextInt();
                database.remove(remove - 1);
                System.out.println(database);
                System.out.println("please enter  1 to enter user name, 2 to delete user name, to edit a record press 3 and 0 to exit");
                selection = select.nextInt();

            }while(selection ==2);


        } if (selection==3) {
            do {
                System.out.println("enter the id of the field you want to edit");
                Scanner edit = new Scanner(System.in);
                int editIdex = edit.nextInt();
                Map<String, String> itemToEdit = database.get(editIdex - 1);
                Scanner editing = new Scanner(System.in);
                System.out.println("Enter the new record");
                String editedRecord = editing.nextLine();
                itemToEdit.put("username", editedRecord);
                LocalTime updated_at = LocalTime.now();
                itemToEdit.put("Updated at", updated_at.toString());
                database.set(editIdex - 1, itemToEdit);
                System.out.println(database);
                System.out.println("please enter  1 to enter user name, 2 to delete user name, to edit a record press 3 and 0 to exit");
                selection = select.nextInt();
            }while (selection==3);
        } else {
            System.out.println("Thank you for using our service");
        }
    }

}

