import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String word="hello world hell";
        String pattern="aba";
        boolean re=
        WordPattern.wordPattern(pattern,word);
        System.out.println(re);

    }
}