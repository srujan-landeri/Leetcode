import java.util.HashMap;

public class JewelsAndStones{
    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones){
        int count = 0;

        HashMap<Character,Integer> occurence = new HashMap<Character,Integer>();

        for(int i = 0; i < stones.length();i++){
            if(occurence.containsKey((stones.charAt(i)))){
                occurence.put(stones.charAt(i),occurence.get(stones.charAt(i)) + 1);
            }

            else{
                occurence.put(stones.charAt(i),1);
            }
        }

        for(int i = 0;i < jewels.length();i++){
            if(occurence.containsKey(jewels.charAt(i))){
                count+= occurence.get(jewels.charAt(i));
            }
        }


        return count;
    }
}