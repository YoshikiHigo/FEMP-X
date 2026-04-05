package all;

public class ClonePair10134 {

    int method1(String text,String pattern){
      if (text.length() == 0 || pattern.length() == 0)   return -1;
      OUTER:   for (int i=0; i + pattern.length() <= text.length(); i++) {
        for (int j=0; j < pattern.length(); j++) {
          if (text.charAt(i + j) != pattern.charAt(j)) {
            continue OUTER;
          }
        }
        return i;
      }
      return -1;
    }

    int method2(String dans,String cherche){
      int lastTrouve=-1;
      int trouve=-1;
      while ((trouve=dans.indexOf(cherche,trouve + 1)) != -1) {
        lastTrouve=trouve;
      }
      return lastTrouve;
    }
}
