package all;

public class ClonePair11754 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuilder sb=new StringBuilder(in.length() + newStr.length());
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

    String method2(String src,String replace,String with){
      String result;
      int pos;
      result="";
      while (!src.equals("")) {
        pos=src.indexOf(replace);
        if (pos == -1) {
          result+=src;
          src="";
        }
     else {
          result+=src.substring(0,pos) + with;
          src=src.substring(pos + replace.length(),src.length());
        }
      }
      return result;
    }
}
