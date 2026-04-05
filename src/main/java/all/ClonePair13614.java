package all;

public class ClonePair13614 {

    String method1(String a_source,String a_toReplace,String a_replaceWith){
      int position;
      while ((position=a_source.indexOf(a_toReplace)) != -1) {
        int position2=a_source.indexOf(a_replaceWith);
        if (a_replaceWith.indexOf(a_toReplace) != -1) {
          position2+=a_replaceWith.indexOf(a_toReplace);
        }
        if (position == position2) {
          break;
        }
        String before=a_source.substring(0,position);
        String after=a_source.substring(position + a_toReplace.length(),a_source.length());
        a_source=before + a_replaceWith + after;
      }
      return a_source;
    }

    String method2(String str,String regex,String replacement){
      int found=0;
      int start=0;
      int len=regex.length();
      if (str == "")   return "";
      while ((found=str.indexOf(regex,found)) != -1) {
        if (found + len >= str.length()) {
          return str.substring(0,found) + replacement;
        }
     else {
          str=str.substring(0,found) + replacement + str.substring(found + len);
        }
        found+=len;
      }
      return str;
    }
}
