package fundamentals;

public class CountOddNumbers {
    public int countOdds(int low,int high){
        int count = (high - low);
        if (low % 2 != 0 && high %2 !=0){
            return count/2 + 1;
        }
        return count/2;
    }

    public static void main(String[] args) {
        CountOddNumbers countOddNumbers = new CountOddNumbers();
        System.out.println(countOddNumbers.countOdds(3,7));
    }
}
