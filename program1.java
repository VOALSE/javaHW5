// 1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class program1 {

    public static <K, V> K getKey(Map<K, V> map, V value) {  
        for (Map.Entry<K, V> entry: map.entrySet())
        {  
            if (value.equals(entry.getValue())) {  
                System.out.print(entry.getKey() + "; ");  
            }  
        }
        return null;  
    }  
   
    public static void main(String[] args) {  
        Map<String, String> db = new HashMap<>();  
        db.putIfAbsent("89630209331", "Voytov");
        db.putIfAbsent("89665432764", "Voytov");
        db.putIfAbsent("89432123422", "Azanov");
        db.putIfAbsent("89521234322", "Azanov");
        db.putIfAbsent("89342222221", "Vaschenkova");
        db.putIfAbsent("89879979797", "Vaschenkova");

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введи фамилию латиницей ? ");
        String str = iScanner.nextLine();

        System.out.println(getKey(db, str));
        iScanner.close();
    }
    
}