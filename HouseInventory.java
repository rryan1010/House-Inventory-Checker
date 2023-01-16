import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.ArrayList;

public class HouseInventory implements InventoryMNG{
    
    private ArrayList<House> entries;
    Scanner everything = new Scanner(System.in);
    String statusChange;
    double priceChange;
    
    public HouseInventory(){
        this.entries =  new ArrayList<House>();
    }

    // Getter
    public ArrayList<House> getList(){
        return entries;
    }
    // Setter
    public void setList(ArrayList<House> entries){
        this.entries = entries;
    } 

    // Methods
    public void Add(House h){
        entries.add(h);
    }

    public void edit(int id, double price){
        for (int i = 0; i < entries.size(); i ++){
            if (id == entries.get(i).getid()){
                if (price == -1){
                    entries.get(i).setStatus(!entries.get(i).getStatus());
                } 
                else{
                    entries.get(i).setPrice(price);
                    System.out.print("Do you want to switch the status to " + !entries.get(i).getStatus() + "? (Y/N):");

                    statusChange = everything.nextLine();

                    if (statusChange.equals("Y") || statusChange.equals("y")  ){

                        entries.get(i).setStatus(!entries.get(i).getStatus());
                        System.out.println("Status has changed to: " + entries.get(i).getStatus());

                    }else if(statusChange.equals("N") || (statusChange.equals("n"))){

                        System.out.println("OK, your status is still " + entries.get(i).getStatus());
                    }else{

                        System.out.println("Not a valid input. Please try again.");
                    }

                }
            }
        }
    }

    
    public int Delete(int id){
        
        for (int i = 0; i < entries.size(); i ++){
            if (entries.get(i).getid() == id){
                entries.remove(i);
                return 1;
            }
        }
        System.out.println("Sorry, house was not found.");
        return 0;
    }


    public void HousesBelowPrice(){
        System.out.print("Is there a price range you wish to set? Enter y/n: ");
        statusChange = everything.nextLine();

        if (statusChange.equals("y")){
            System.out.print("Enter the min price you want: ");
            double minimumPrice = everything.nextDouble();
            System.out.print("Enter the max price you want: ");
            double maximumPrice = everything.nextDouble();

            System.out.println();
            System.out.println("These are all the houses from: $" + minimumPrice + " - $" + maximumPrice);
            System.out.println();
            for (int i = 0; i < entries.size(); i ++){
                if(entries.get(i).getPrice() <= maximumPrice && entries.get(i).getPrice() >= minimumPrice ){
                    System.out.println("ID: " + entries.get(i).getid() + "   Price: $" + entries.get(i).getPrice() + "   Status: " + entries.get(i).getStatus());
                }
            }

            System.out.println();

        }
        else if (statusChange.equals("n")){ 
            System.out.println();
            System.out.println("These are all the houses:");
            System.out.println();

            for (int i = 0; i < entries.size(); i ++){
                System.out.println("ID: " + entries.get(i).getid() + "   Price: $" + entries.get(i).getPrice() + "   Status: " + entries.get(i).getStatus());
            }
            
            System.out.println();

        }
        
       
    }

    public int size(){
        return entries.size();
    }

        // Returns the ID of house with min price.
        // Once called in the main, this will print the ID of house being returned from this method.
    public int findMin(){
    
        double minPrice = entries.get(0).getPrice();
        int idCount = entries.get(0).getid();

        for (int i = 0; i < entries.size(); i ++){
            if (entries.get(i).getPrice() < minPrice){
                minPrice = entries.get(i).getPrice();
                idCount = entries.get(i).getid();
            }
        }
        return idCount;
    }    

    


}

