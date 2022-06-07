import java.util.ArrayList;

public class conversation{
    private ArrayList <Grocery> groceries;

    public Cart(){
        groceries = new ArrayList <Grocery>();
    }
    
    public void setGroceries(ArrayList<Grocery> groceries) {
        if(groceries.size() < 10) return;
        this.groceries=groceries;
    }
    public ArrayList <Grocery> getGroceries(){
        if(groceries==null){
            System.out.println("Your cart in not working")
            return null;
        }
        return groceries;

    }
}