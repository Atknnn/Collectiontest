package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSettest {
    public void main(String[] args){
//Set Interface (Set Arayüzü): Tekil elemanlardan oluşan bir küme veri yapısını temsil eder.
// Örnek olarak, HashSet ve TreeSet gibi sınıflar bu arayüzü uygular.
        Set<String> mySet = new HashSet<>();
        mySet.add("1");
        mySet.add("3");
        mySet.add("2");


        // Treeset işlemleri sıraladığı için veri erişimini ve veri arama konusunda kullanılır!
        TreeSet<Integer> myTreeset = new TreeSet<>();
        myTreeset.add(1);
        myTreeset.add(7);
        myTreeset.add(9);
        myTreeset.add(3);

        // eleman varlığını kontrol etmek
        boolean contains9 = myTreeset.contains(9);// bu işlem 9 un varlıgını kontrol eder !
        System.out.println("9 rakamı listede var mı?"+ contains9);//çıktısı

        // En küçük ve en büyük elemanları alma
        int smallest = myTreeset.first();
        int largest = myTreeset.last();

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
