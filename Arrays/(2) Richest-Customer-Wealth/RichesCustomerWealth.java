public class RichesCustomerWealth {
    public static void main(String[] args){
        int Customers[][] = {
            {7,1,3},
            {2,8,7},
            {1,9,5}
        };

        System.out.println(richestCustomer(Customers));
    }

    public static int richestCustomer(int Customers[][]){
        int currWealth = 0;
        int maxWealth = 0;

        for(int []i :Customers){
            currWealth = 0;
            for(int j : i){
                currWealth += j;
            }

            maxWealth = Math.max(maxWealth,currWealth);
        }
        return maxWealth;
    }
}
