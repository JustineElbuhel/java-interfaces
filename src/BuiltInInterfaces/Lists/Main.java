package BuiltInInterfaces.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        List<String> names = new ArrayList<>();
        names.add("Jessica");
        names.add("Jennifer");
        names.add("Jasmine");

        System.out.println(main.returnSize(names));
    }

    public int returnSize(List names){
        return names.size();
    }
}
