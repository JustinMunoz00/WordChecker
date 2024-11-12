import java.util.ArrayList;

public class Main{ 
    public static void main(String[] args)
    {
        // Test Case 1
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("an");
        test1.add("band");
        test1.add("band");
        test1.add("bando");
        WordChecker x = new WordChecker(test1);
        System.out.println(x.isWordChain());
        // Test Case 2
        ArrayList<String> test2 = new ArrayList<String>();
        test2.add("to");
        test2.add("too");
        test2.add("stool");
        test2.add("tools");
        WordChecker y = new WordChecker(test2);
        System.out.println(y.isWordChain());
        // Test Case 3
        ArrayList<String> test3 = new ArrayList<String>();
        test3.add("catch");
        test3.add("bobcat");
        test3.add("catchacat");
        test3.add("cat");
        test3.add("at");
        WordChecker a = new WordChecker(test3);
        System.out.println(a.createList("cat"));
        // Test Case 4
        ArrayList<String> test4 = new ArrayList<String>();
        test4.add("catch");
        test4.add("bobcat");
        test4.add("catchacat");
        test4.add("cat");
        test4.add("at");
        WordChecker b = new WordChecker(test4);
        System.out.println(b.createList("catch"));
        // Test Case 5
        ArrayList<String> test5 = new ArrayList<String>();
        test5.add("catch");
        test5.add("bobcat");
        test5.add("catchacat");
        test5.add("cat");
        test5.add("at");
        WordChecker c = new WordChecker(test5);
        System.out.println(c.createList("dog"));
    }
}

