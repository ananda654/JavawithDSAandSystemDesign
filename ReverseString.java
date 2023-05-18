class ReverseWholeString {
    public void ReverseString() {
        String sc = new String("Ananda Sankar Panda");
        // reverse whole string
        String sc1 = "";
        for (int i = sc.length() - 1; i >= 0; i--) {
            sc1 += sc.charAt(i);

        }
        System.out.println(sc1);
    }

}

class ReverseStringWord {
    public void ReverseString() {
        String sc = new String("Ananda Sankar Panda");
        // reverse string Word
        String sc1 = "";
        String scr[] = sc.split(" ");
        for (int i = scr.length - 1; i >= 0; i--) {
            sc1 = sc1 + scr[i] + " ";
        }
        System.out.println(sc1);
    }

}

public class ReverseString {
    public static void main(String[] args) {
        ReverseWholeString first_string = new ReverseWholeString();
        // first_string.ReverseString();
        ReverseStringWord second_string = new ReverseStringWord();
        second_string.ReverseString();
    }
}
