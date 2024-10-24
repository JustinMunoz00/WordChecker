import java.util.ArrayList;

public class Main{ 
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("bando");
        System.out.println(words.get(1));
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
    }
}

