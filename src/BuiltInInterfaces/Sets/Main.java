package BuiltInInterfaces.Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Set<String> set = new HashSet<>();
        set. add("one");
        set. add("one");
        set. add("two");


        System.out.println(main.returnSize(set));
    }

    public int returnSize(Set<String> set){
        return set.size();
    }
}
