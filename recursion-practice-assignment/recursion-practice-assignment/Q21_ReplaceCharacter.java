import java.util.Scanner;

public class Q21_ReplaceCharacter {
    static String replace(String s, char from, char to, int index) {
        if (index == s.length()) return "";
        char current = s.charAt(index) == from ? to : s.charAt(index);
        return current + replace(s, from, to, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] chars = sc.nextLine().trim().split("\\s+");
        char c1 = chars[0].charAt(0);
        char c2 = chars[1].charAt(0);
        System.out.println(replace(s, c1, c2, 0));
        sc.close();
    }
}
