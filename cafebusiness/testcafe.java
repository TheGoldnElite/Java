import java.util.ArrayList;
import java.util.Arrays;

public class Program{

    public static void main(String[] args){
        Cafe starbucks=new Cafe();
        int streak = starbucks.getStreakGoal(23);
        System.out.println(steak);

        double store[] = {44.12,67.45,12.00,5};
        double total=starbucks.getOrderTotal(items);
        System.out.print.ln(total);

        ArrayList<Double> items=new ArrayList<Double>();
        items.add(44.12);
        items.add(67.45);
        items.add(12.00);
        items.add(5.00);

        ArrayList<String> beverages = new ArrayList<String>();
        beverages.add("drip coffee");
        beverages.add("cappuccino");
        beverages.add("latte");
        beverages.add("mocha");

        starbucks.displayMenu(beverages);

        ArrayList<String> customers = new ArrayList<String>();
        starbucks.addCustomer(customers);
        starbucks.addCustomer(customers);
        starbucks.addCustomer(customers);

        starbucks.printPriceChart("Columbian Beans",2.00,4);
        
        starbucks.displayMenu(beverages,items);



    }
}





















public class TestCafe {
    public static void main(String[] args) {


        
    /* 
    You will need add 1 line to this file to create an instance 
    of the CafeUtil class. 
    Hint: it will need to correspond with the variable name used below..
    */
        TestCafe appTest= new  TestCafe();
    /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
    }
}