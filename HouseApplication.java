import java.util.Scanner;

public class HouseApplication extends HouseInventory{

    public static void main(String[] args){
            
            Scanner options = new Scanner(System.in);
    
            House newHouse = new House(0, null, 0);
            
            HouseInventory entries = new HouseInventory();

            // Variables needed

            int choice = 843456768;
            double makePrice;
            String makeStatus;
            Boolean setnewStatus = true;
            int entriesCount = 1;
            int chooseID;
    
            // Menu begins
            while (choice != 5){
                System.out.println("Hello, user.");
                System.out.println("1.) Add a house");
                System.out.println("2.) Edit a house");
                System.out.println("3.) Delete a house");
                System.out.println("4.) Display all houses");
                System.out.println("5.) Exit");
                System.out.print("Please choose what you want to do from the menu above: ");
                choice = options.nextInt();
    
                if (choice == 1){
                    System.out.print("Please enter the price: ");
                    makePrice = options.nextDouble();
                    System.out.println();

                    System.out.println("This listing will be active. Please change if needed with edit option.");
                    newHouse = new House(makePrice,setnewStatus,entries.size());
                    entries.Add(newHouse);
                    entriesCount += 1;    

                    
                    for( int i = 0; i < entries.size() ; i++ ){
                        System.out.println("ID: " + entries.getList().get(i).getid() + "   Price: $" + entries.getList().get(i).getPrice() + "   Status: " + entries.getList().get(i).getStatus());
                    }
                    // This confirms that the house has been added to the ArrayList succesfully!
                    System.out.println("House added successfully!");
                    System.out.println();
    
                }
                else if (choice == 2){
                    System.out.print("Please enter the house ID: ");
                    chooseID = options.nextInt();
                    System.out.print("Please enter the new price with decimals: ");
                    makePrice = options.nextDouble();
                    entries.edit(chooseID, makePrice);
                    System.out.println("Edit done successfully!");
                    System.out.println();
                }
                else if (choice == 3){
                    System.out.print("Please enter the house ID: ");
                    chooseID = options.nextInt();
                    entries.Delete(chooseID);
                    System.out.println("Deleted successfully!");
                    System.out.println();
    
                }
                else if (choice == 4){
                    entries.HousesBelowPrice();
                    
                }
            }
            // Exit!
            System.out.println("Have a good one!");
            options.close();
            
        }
    }


    
