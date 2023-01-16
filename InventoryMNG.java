
public interface InventoryMNG {


        // Adds a House
        public void Add(House h);

        // Updates the price and/or status.
        public void edit(int id, double price);


        
        // Deletes a House with id / Returns zero if the house was not deleted (not found)
        // Return 1 is the house was deleted.
        public int Delete(int id);


        // Returns an array of houses that are below a price p/Return an empty array if non
        // Once called in the main, this will print the array being returned by the method. 
        public void HousesBelowPrice();

        // Returns the ID of house with min price.
        // Once called in the main, this will print the ID of house being returned from this method.
        public int findMin();


    }

    
