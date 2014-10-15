/**
 * Created by Mohammed ALshehry on 3/31/14.
 */
public class TestRecursion {

    public static void main(String[] args) {
        Sentence a = new Sentence("Hello");
        System.out.println("ordinal sentence : " + a);
        a.reverse();
        System.out.println("reversed sentence : " + a);

        System.out.print("Search for \"sip\" in Mississipi : ");
        Sentence b = new Sentence("Mississipi");
        System.out.println(b.find("sip"));

        System.out.print("index of \"sip\" in Mississipi : ");
        System.out.println(b.indexOf("sip"));

        b.substringGenerator();

    }
}
