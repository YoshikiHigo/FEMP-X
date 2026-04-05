package all;

public class ClonePair8760 {

    boolean method1(String text,String pattern){
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

    boolean method2(String string,String prefix){
      if (string == null || prefix == null) {
        return string == null && prefix == null;
      }
      if (prefix.length() > string.length()) {
        return false;
      }
      return string.regionMatches(true,0,prefix,0,prefix.length());
    }
}
