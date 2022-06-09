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

            String[] myArray = new String[5];
            String name = myArray.get(0);

            for(int i = 0; i < myArray.length;i++){
                System.out.println(myArray[i])
            }

        }


        
        public addCustomer(ArrayList<String> customers){

            System.out.println("Please enter your name:")

            String userName = System.console().readLine();

            System.out.println("Hello, userName")
            myArray.add("Heidi");

        }
}