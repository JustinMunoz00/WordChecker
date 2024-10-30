import java.util.ArrayList;

public class Main{ 
    public static void main(String[] args)
    {
        //Test Case 1
        ArrayList<String> test1 = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("bando");
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        //Test Case 2
        ArrayList<String> moreWords = new ArrayList<String>();
        moreWords.add("to");
        moreWords.add("too");
        moreWords.add("stool");
        moreWords.add("tools");
        WordChecker y = new WordChecker(moreWords);
        System.out.println(y.isWordChain());
        //Test Case 3
        ArrayList<String> moreWords = new ArrayList<String>();
        moreWords.add("to");
        moreWords.add("too");
        moreWords.add("stool");
        moreWords.add("tools");
        WordChecker y = new WordChecker(moreWords);
        System.out.println(y.isWordChain());
    }
}

