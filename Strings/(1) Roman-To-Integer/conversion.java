public class conversion {
    public static void main(String[] args){
        System.out.println(convert("MCMXCIV"));
    }

    public static int convert(String s){
        int sum = 0;
        

        for(int i = 0;i < s.length(); i++){            
            if(i != s.length()-1 && mapRomans(s.charAt(i)) < mapRomans(s.charAt(i + 1))){
                sum += mapRomans(s.charAt(i + 1)) - mapRomans(s.charAt(i));
                i++;
            }

            else{
                sum += mapRomans(s.charAt(i));
            }
        }

        return sum;
    }

    public static int mapRomans(char ch){
        if(ch == 'I'){
            return 1;
        }

        else if(ch == 'V'){
            return 5;
        }

        else if(ch == 'X'){
            return 10;
        }

        else if(ch == 'L'){
            return 50;
        }

        else if(ch == 'C'){
            return 100;
        }

        else if(ch == 'D'){
            return 500;
        }

        else if(ch == 'M'){
            return 1000;
        }

        return -1;
    }
}
