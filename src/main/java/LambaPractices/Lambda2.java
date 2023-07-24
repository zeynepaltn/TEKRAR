package LambaPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        List<String> iller=new ArrayList<>(Arrays.asList("Van", "MUS", "Gumushane", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));
        System.out.println(iller);
        printElementsUpperLengthOrderUnique(iller);
        System.out.println();
        printElUniqueUpperCaseSortWithLastLetter(iller);
        System.out.println();
        bykHarfLengthArtanDistinctLengthAyniysaAlfabetik(iller);
        System.out.println(silKarakterSayisiBesdenfazlaOlanElemanlari(iller));
        System.out.println(hIleBaslayanRIleBiten(iller));


    }//main
    //1) Tum List elemanlarini buyuk harfle, uzunluklarina gore, artan sirada, tekrarsiz olarak yazdiriniz
    public static void printElementsUpperLengthOrderUnique(List<String> iller){
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+ " "));
    }
    //2)Tum List elemanlarini buyuk harfle son harflerine gore, artan sirada, tekrarsiz olarak yazdiriniz
    public static void printElUniqueUpperCaseSortWithLastLetter(List<String> iller){
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()). //lambda expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));
    }
    //3) Tum List elemanlarini buyuk harfle, uzunluklarina goree artan sirada, tekrarsiz olarak yazdiriniz
    //uzunluklari ayni olan elemanlari alfabetik sirada olacak sekilde yazdiran kodu girin
    public static void bykHarfLengthArtanDistinctLengthAyniysaAlfabetik(List<String> iller){
        iller.
                stream().
                distinct().
                map(String::toUpperCase). //method reference
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

    }
    //4) karakter sayisi 5 den fazla olan elemanlari siliniz
    public static List<String> silKarakterSayisiBesdenfazlaOlanElemanlari(List<String> iller){
        iller.removeIf(t->t.length()>5);
        return iller;
    }
    //5) "H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanRIleBiten(List<String> iller){
        iller.removeIf(t->t.startsWith("H")||t.endsWith("r"));
        return iller;
    }
    //List elemanlarinin karakter sayilarinin karalerini aliniz ve ekrana yazdirinizgit init

}//class
