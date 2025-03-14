package BuiltInInterfaces.Maps;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Map<String, String> translations = new HashMap<>();
        translations.put("Ganbatte", "God luck");
        translations.put("Ohaiyo", "Hey");

        for(String key : translations.keySet()){
            System.out.println(key + ": "  + translations.get(key));
        }

        System.out.println(main.returnSize(translations));
    }

    public int returnSize(Map<String, String> map){
        return map.size();
    }
}
