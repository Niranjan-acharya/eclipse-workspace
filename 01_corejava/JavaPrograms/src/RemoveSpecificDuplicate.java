import java.util.Arrays;

public class RemoveSpecificDuplicate {
  public static void main(String[] args) {
    String str1 = "CHEENNAAI";
    char[] ch = str1.toCharArray();

    String str2 = "";

    int index = 0, i, j;
    for (i = 0; i < str1.length(); i++) {
      for (j = 0; j < i; j++) {
        if (ch[i] != 'N') {
          if (ch[i] == ch[j]) {
            break;
          }
        }
      }

      if (j == i) {
        ch[index++] = ch[i];
        str2 += ch[i];
      }
    }

    System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
    System.out.println(str2);
  }
}