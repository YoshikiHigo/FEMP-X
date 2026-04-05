package unverified;

public class ClonePair12125 {

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

    String method2(String s,String sub,String with){
      StringBuffer sb=new StringBuffer(s.length() * 2);
      int c=0;
      int i=0;
      while ((i=s.indexOf(sub,c)) != -1) {
        sb.append(s.substring(c,i));
        sb.append(with);
        c=i + sub.length();
      }
      if (c < s.length())   sb.append(s.substring(c,s.length()));
      return sb.toString();
    }
}
