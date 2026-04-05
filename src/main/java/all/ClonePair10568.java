package all;

public class ClonePair10568 {

    int method1(String stringTable[],String text){
      if (stringTable != null) {
        for (int i=0; i < stringTable.length; i++) {
          if (stringTable[i].equals(text)) {
            return i;
          }
        }
      }
      return -1;
    }

    int method2(String list[],String messageText){
      int p=0;
      if (list == null)   return -1;
     else {
        for (p=0; p < list.length && !list[p].equalsIgnoreCase(messageText); p++)     ;
        if (p >= list.length)     return -1;
     else     return p;
      }
    }
}
