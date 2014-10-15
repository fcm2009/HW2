/**
 * Created by Mohammed ALshehry on 3/31/14.
 */
public class Sentence {

    String str;

    public Sentence(String str) {
        this.str = str;
    }

    private void reverse(int n) {
        if(n == str.length())
            str = "";
        else{
            String tmp = str.charAt(n) + "";
            reverse(n + 1);
            str += tmp;
        }
    }

    public void reverse() {
        reverse(0);
    }

    private boolean find(String s, int n) {
        if(str.length() - n - 1 < s.length())
            return false;
        else
            return this.str.substring(n, n + s.length()).equals(s) || find(s, n + 1);
    }

    public boolean find(String s) {
        return find(s, 0);
    }

    public int indexOf(String s) {
        return indexOf(s, 0);
    }

    private int indexOf(String s, int n) {
        if(str.length() - n - 1 < s.length())
            return -1;
        else if(str.substring(n, n + s.length()).equals(s))
            return n;
        else
            return indexOf(s, n + 1);
    }

    private void substringGenerator(int i ,int n) {
        if(n == str.length())
            System.out.print(str.substring(i, n));
        else {
            System.out.print(str.substring(i, n));
            substringGenerator((i + 1) % str.length(), n + 1);
        }
    }

    public void substringGenerator() {
        substringGenerator(0, 0);
    }

    public String toString() {
        return str;
    }
}
