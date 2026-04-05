package all;

public class ClonePair3786 {

    boolean method1(String prefix,String string){
      int index1=0;
      int index2=0;
      int length1=prefix.length();
      int length2=string.length();
      char ch1=' ';
      char ch2=' ';
      while (index1 < length1 && index2 < length2) {
        while (index1 < length1 && Character.isWhitespace(ch1=prefix.charAt(index1))) {
          index1++;
        }
        while (index2 < length2 && Character.isWhitespace(ch2=string.charAt(index2))) {
          index2++;
        }
        if (index1 == length1 && index2 == length2) {
          return true;
        }
        if (ch1 != ch2) {
          return false;
        }
        index1++;
        index2++;
      }
      if (index1 < length1 && index2 >= length2)   return false;
      return true;
    }

    boolean method2(String name1,String name2){
      int nameLen=name1.length();
      if (nameLen != name2.length()) {
        return false;
      }
      for (int i=nameLen - 1; i >= 0; i--) {
        char c1=name1.charAt(i);
        char c2=name2.charAt(i);
        if (c1 != c2) {
          if (c1 >= 'A' && c1 <= 'Z') {
            c1+=32;
          }
          if (c2 >= 'A' && c2 <= 'Z') {
            c2+=32;
          }
          if (c1 != c2) {
            return false;
          }
        }
      }
      return true;
    }
}
