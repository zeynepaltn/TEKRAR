package LambaPractices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angelina");
        myList.add("Clara");
        printElements(myList);
        System.out.println();
        printElements2(myList);
        System.out.println();
        yazdirTIlebaslayamayanlari(myList);
        System.out.println();
        printElemanLenghtLessThanThree(myList);
        System.out.println();
        printElLengthMoreThan4WithUpper(myList);
        System.out.println();
        printellengthMoreThanFourUniqueLoweCase(myList);
        System.out.println();
        printElUniqueToUpperSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);

    }//main
   //Bir List'deki elemanlari konnsola yazdiran kodu giriniz.
    public static void printElements(List<String> myList){
        for(String w: myList){
            System.out.print(w+ " ");
        }

    }
    //2. yol lambda ile ayni kodu yazalaim
    public static void printElements2(List<String> myList){
        myList.
                stream().
                forEach(t-> System.out.print(t+ " "));

    }
    //Bir List'deki T ile baslayanlar haric tum elemanlari konsola yazdiran methodu yazin
    public static void yazdirTIlebaslayamayanlari(List<String> myList){
        myList.
                stream().
                filter(t->!t.startsWith("T")).
                forEach(t-> System.out.print(t+ " "));
    }
    //Bir List'de karakter syaisi 4 den az olan tum elemanlari konsola yazdiran kodu girin
    public static void printElemanLenghtLessThanThree(List<String> myList){
        myList.stream().
                filter(t->t.length()<4).
                forEach(t-> System.out.print(t+ " "));
    }
    //Bir List'de karakter sayisi 4 den cok olan tum elemanlari buyuk harflerle konsola yazdiran kodu girin
    public static void printElLengthMoreThan4WithUpper(List<String> myList){
        myList.stream().
                filter(t->t.length()>4).
                map(t->t.toUpperCase()).
                forEach(t-> System.out.print(t+ " "));
    }
    //Bir list'deki char sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle yazdir
    public static void printellengthMoreThanFourUniqueLoweCase(List<String> myList){
        myList.stream().
                distinct().
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t+ " "));
    }
    //Bir `list'deki elemanlari tekrarsiz olarak buyuk harflerle alfabetik olarak konsola yazdiran kodu girin
    public static void printElUniqueToUpperSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().forEach(t-> System.out.print(t+ " "));
    }
    //Bir List'deki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge
    // siralayarak konsol'a yazdiran kodu girin
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+ " "));

    }

}//class

