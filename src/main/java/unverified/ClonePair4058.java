package unverified;

public class ClonePair4058 {

    char method1(String string){
      int index=0;
      int length=string.length();
      do {
        while ((index < length) && (string.charAt(index) != '&'))     index++;
        if (++index >= length)     return '\0';
        if (string.charAt(index) != '&')     return string.charAt(index);
        index++;
      }
     while (index < length);
      return '\0';
    }

    char method2(String string){
      int index=0;
      final int length=string.length();
      do {
        while ((index < length) && (string.charAt(index) != '&')) {
          index++;
        }
        if (++index >= length) {
          return '\0';
        }
        if (string.charAt(index) != '&') {
          return string.charAt(index);
        }
        index++;
      }
     while (index < length);
      return '\0';
    }
}
