public class arrange_1 {
    public static void main(String[] args){
        System.out.println(totalStairs(21));
    }

    public static int totalStairs(int n){
        // solvng the quadratic equation
        return (int)(Math.sqrt((2 * (long)n) + 0.25) - 0.5);
    }

}
