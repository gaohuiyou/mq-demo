package ygh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
@ComponentScan(basePackages = "ygh")
public class Application {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
//        System.out.println(classLoader);
//        Map<String,String> map=new HashMap();
//        map.put("book","english");
//        map.put("bike","bike");
//        map.put("book","math");
//        for(Map.Entry<String,String> entry1:map.entrySet()){
//            System.out.println(entry1.getKey()+":"+entry1.getValue());
//        }
        SpringApplication.run(Application.class,args);
    }
}