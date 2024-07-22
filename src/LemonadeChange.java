public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int b : bills) {
            if (b == 5) five++;
            else if (b == 10) {
                if (five >= 1) {
                    five--;
                    ten++;
                } else
                    return false;
            } else {
                //20 - return 15/- means 1-10 and 1-5 or 3-5
                if (five >= 1 && ten >= 1) {
                    five--;
                    ten--;
                }

                else if (five >= 3) five -= 3;
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] arr={5,5,5,10,20};
        int[] arr = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(arr));
    }
}
