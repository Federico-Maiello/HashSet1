import javax.lang.model.element.NestingKind;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static HashSet<String> createHastSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");

        return hashSet;
    }

    public static void printHashSet(HashSet<String> hashSet) {
        System.out.println("Dimenson of HashSet: " + hashSet.size());

        System.out.println("Element of HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        HashSet<String> myHashSet = createHastSet();

        printHashSet(myHashSet);
    }
}