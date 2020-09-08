package com.hj.java_algorithm.sample;
import java.util.*;

public class stringTest {
    public static void main(String[] args) {
        String str = "Hello world test string";
        /* 1. startsWith, endsWiths
        /*
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("h"));
        */

        /* 2. equals
        /*
        String str2 = "hello";
        System.out.println(str2.equals("hello"));
        System.out.println(str2.equals(str));
        */

        /* 3. indexOf */
        /*
        System.out.println(str.indexOf("w"));
        System.out.println(str.indexOf("test"));
        System.out.println(str.indexOf("end"));
         */

        /* 4. length() */
        /*
        System.out.println(str.length());
         */

        /* 5. split */
        /*
        String[] split_str =  str.split(" ");
        for(String s : split_str)
            System.out.println(s);
         */

        /* 6. substring */
        /*
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(3));
         */

        /* 7. toLowerCase / toUpperCase */
        /*
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
         */

        String str3 = "            Hello world test string               ";
        /* 8. trim */
        //System.out.println(str3.trim());

        /* 9. valueOf() */
        /*
        Integer i = 100;
        System.out.println(i.getClass());
        System.out.println(String.valueOf(100).getClass());
         */

        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c");
        System.out.println(sb);
        String result = sb.toString();
        System.out.println(result);

    }
}
