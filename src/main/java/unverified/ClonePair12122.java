package unverified;

public class ClonePair12122 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuffer sb=new StringBuffer(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
      return sb.toString();
    }

    String method2(String orig,String token,String replacement){
      if (orig.indexOf(token) < 0)   return orig;
      int tokenlen=token.length();
      int posn;
      String result="";
      while ((posn=orig.indexOf(token)) >= 0) {
        result+=orig.substring(0,posn) + replacement;
        orig=orig.substring(posn + tokenlen);
      }
      return result + orig;
    }
}
