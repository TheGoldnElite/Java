public class CafeUtil {

    

        public int getStreakGoal() {
            int sum = 0;
            for(int i = 0; i <= 10; i++){
                sum += i;
            }
            return sum;
        }
        
        public double getOrderTotal(double[] prices) {
            double sum = 0;
            for (int i = 0; i < prices.length; i++){
                sum += prices[i];

            } return sum;
            
        }


        public void displayMenu(ArrayList<String> menuItems){

            ArrayList<String> menutItems=new ArrayList<String>();
            menuItems.add("drip coffee");
            menutItems.add("cappuccino");
            menuItems.add("latte");
            menuItems.add("mocha");

            for(int i = 0; i < menuItems.length;i++){
                System.out.println(menuItems[i]);
            }

        }


        
        public addCustomer(ArrayList<String> customers){

            System.out.println("Please enter your name:")

            String userName = System.console().readLine();

            System.out.println("Hello, userName")
            myArray.add("Heidi");

        }
}