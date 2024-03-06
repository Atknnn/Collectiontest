package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMaptest {
    public static void main(String[] args) {

        Map<String,Integer>  ogrencinotlistesi = new HashMap<>();

        ogrencinotlistesi.put("atakan",95);
        ogrencinotlistesi.put("ayse",70);
        ogrencinotlistesi.put("Ali",65);
        ogrencinotlistesi.put("Yeliz",60);

        //Ogrencilerin notunu gormek icin veri alma islemi
        int javaValue = ogrencinotlistesi.get("atakan"); //atakanın int değerinde degerini göster
        System.out.println("Atakanın notu ="+javaValue);

        //yelizin notunu güncelleme işlemi
        ogrencinotlistesi.put("Yeliz",85);
        System.out.println(ogrencinotlistesi);







    }
}
