package unverified;

public class ClonePair8126 {

    boolean method1(String p1,String p2){
      if ((p1 == null && p2 != null) || (p2 == null && p1 != null)) {
        return false;
      }
      if (p1 == null && p2 == null) {
        return true;
      }
      if (p1.equals(p2) || p1.startsWith(p2)) {
        return true;
      }
      return false;
    }

    boolean method2(String text,String pattern){
      if (text == null && pattern == null)   return true;
      if (text == null || pattern == null)   return false;
      if (text.equals(pattern))   return true;
      String[] cards=pattern.split("\\*");
      for (  String card : cards) {
        int idx=text.indexOf(card);
        if (idx == -1) {
          return false;
        }
        text=text.substring(idx + card.length());
      }
      return true;
    }
}
