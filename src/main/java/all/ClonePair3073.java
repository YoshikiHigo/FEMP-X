package all;

public class ClonePair3073 {

    int method1(String str,char search1,char search2){
      if (str == null)   return -1;
      int endIndex=-1;
      int parCount=0;
      boolean ignoringText=false;
      int size=str.length();
      while (++endIndex < size) {
        char c=str.charAt(endIndex);
        if (c == '\'')     ignoringText=!ignoringText;
     else     if (!ignoringText) {
          if (parCount == 0 && (c == search1 || c == search2))       return endIndex;
     else       if (c == ')')       parCount--;
     else       if (c == '(')       parCount++;
        }
      }
      return -1;
    }

    int method2(String str,char search1,char search2){
      if (str == null) {
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
          if ((parCount == 0) && ((c == search1) || (c == search2))) {
            return endIndex;
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
}
