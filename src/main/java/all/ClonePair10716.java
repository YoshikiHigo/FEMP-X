package all;

public class ClonePair10716 {

    int method1(String str,String search){
      if ((str == null) || (search == null) || (search.length() == 0)) {
        return -1;
      }
      int endIndex=-1;
      int parCount=0;
      boolean ignoringText=false;
      int size=str.length();
      while (++endIndex < size) {
        char c=str.charAt(endIndex);
        if (c == '\'') {
          ignoringText=!ignoringText;
        }
     else     if (!ignoringText) {
          if ((parCount == 0) && (c == search.charAt(0))) {
            if (str.substring(endIndex).startsWith(search)) {
              return endIndex;
            }
          }
     else       if (c == ')') {
            parCount--;
          }
     else       if (c == '(') {
            parCount++;
          }
        }
      }
      return -1;
    }

    int method2(String str,String search){
      if (str == null || search == null || search.length() == 0)   return -1;
      int endIndex=-1;
      int parCount=0;
      boolean ignoringText=false;
      int size=str.length();
      while (++endIndex < size) {
        char c=str.charAt(endIndex);
        if (c == '\'')     ignoringText=!ignoringText;
     else     if (!ignoringText) {
          if (parCount == 0 && c == search.charAt(0)) {
            if (str.substring(endIndex).startsWith(search))         return endIndex;
          }
     else       if (c == ')')       parCount--;
     else       if (c == '(')       parCount++;
        }
      }
      return -1;
    }
}
