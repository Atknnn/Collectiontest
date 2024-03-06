package org.example;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListtest {

    public static void main(String[] args) {// verileri tutabilmesi için bir main metodu ekledim

        //Queue interface dir Kuyruk yapısını belli eder PriorityQueue gibi sınıflar bu arayüzü uygular.
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Java");
        myQueue.offer("Python");
        myQueue.offer("C++");
        myQueue.offer("ata");
/**
 * Öte yandan, offer metodu, özellikle Queue arayüzüyle birlikte kullanıldığında tercih edilen bir ekleme yöntemidir.
 * offer metodu, eleman eklerken koleksiyonun kapasitesi doluysa veya tip uyumsuzluğu durumunda istisna fırlatmaz;
 * bunun yerine false veya null gibi bir değer döndürerek başarısız eklemeyi belirtir.
 */

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("atakan");
        linkedList.add("Mami");
        linkedList.add("ege");

        System.out.println("Total List"+ linkedList); // bütün listeyi vermek için yazılır
        // belirli bir indekste listeye eleman ekleme
        linkedList.add(1,"1.atakan");
        linkedList.remove("ege");// listeden ege elemanın  çıkarır


        //iterator kullanarak listeyi dönmek,
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // for each döngüsü ile bu döngüyü dönme işlemi
        for (String Language:linkedList) {
            System.out.println(Language);
        }




    }
}