public class FindtheStudentthatWillReplacetheChalk {
    public static int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        for (int num : chalk) {
            totalChalk += num;
        }
        k %= totalChalk;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k = k - chalk[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {22, 25, 39, 3, 45, 45, 12, 17, 32, 9};
        System.out.println(chalkReplacer(arr, 835));
    }
}
