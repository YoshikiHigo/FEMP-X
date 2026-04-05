package all;

public class ClonePair8758 {

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

    boolean method2(String str,String suffix){
      if (str == null || suffix == null) {
        return (str == null && suffix == null);
      }
      if (suffix.length() > str.length()) {
        return false;
      }
      int strOffset=str.length() - suffix.length();
      return str.regionMatches(false,strOffset,suffix,0,suffix.length());
    }
}
