public class House {

    private int id;
    private Boolean status;
    private double price;

    public House( double p, Boolean s, int i){
        this.price = p;
        this.status = s;
        this.id = i;
    }

    // Getters
    public double getPrice(){
        return price;
    }
    public int getid(){
        return id;
    }
    public Boolean getStatus(){
        return status;
    }

    // Setters

    public void setPrice(double Price){
        this.price = Price;
    }

    public void setid(int Id){
        this.id = Id;
    }

    public void setStatus(Boolean Status){
        this.status = Status;
    }
    
}
