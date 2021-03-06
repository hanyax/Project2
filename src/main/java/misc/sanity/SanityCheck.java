package misc.sanity;

import java.util.function.Function;

// Checkstyle will report an error with this line:
import datastructures.concrete.DoubleLinkedList;
import datastructures.interfaces.IList;

public class SanityCheck {
    public static void main(String[] args) {
        // The following two lines should compile only if you correctly installed Java 8 or higher.
        Function<String, String> test = (a) -> a;
        System.out.println(test.apply("Java 8 or above is correctly installed!"));

        // The following line should compile only if you correctly imported this project as a Gradle project.
        System.out.println(org.openjdk.jol.util.MathUtil.gcd(200L, 335L));

        // The following four lines should run, but checkstyle should complain about style errors in both lines.
        IList<String> a = new DoubleLinkedList<String>();
        a.add("test"); 
        System.out.println(a.isEmpty());

        System.out.println("Sanity check complete: everything seems to have been configured correctly!");
    }
}
