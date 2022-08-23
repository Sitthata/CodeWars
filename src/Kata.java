
import java.util.Arrays;
import java.util.Locale;

public class Kata {
    public int min(int[] list) {
        int minNum = Arrays.stream(list).min().getAsInt();
        return minNum;
    }

    public int max(int[] list) {
        int maxNum = Arrays.stream(list).max().getAsInt();
        return maxNum;
    }

    public static boolean isSquare(int n) {
        double sq = Math.sqrt(n);
        if ((sq - Math.floor(sq)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            String con = String.valueOf(i);
            if(con.contains("5")){
                continue;
            }
            count++;
        }
        return count;
    }

    public static int duplicates(int[] array) {
        //Make the magic happen
        int count = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]){
                count++;
                i++;
            }
        }
        return count;
        }

    public static String solution(String str) {
        String re = "";
        char c;
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            re = c + re;
        }
        return re;
    }

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        int len = str.length();

        char array[] = str.toCharArray();

        Arrays.sort(array);
        for (int i = 0; i < len - 1; i++) {
            if(array[i] == array[i+1]){
                return false;
            }
        }
        return true;
    }
    public int GetSum(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;
        }

        return sum;
    }


}




