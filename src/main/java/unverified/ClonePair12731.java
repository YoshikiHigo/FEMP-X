package unverified;

public class ClonePair12731 {

    String method1(String in,String match,String replacement){
      if (in == null || match == null || replacement == null) {
        return in;
      }
      StringBuffer out=new StringBuffer();
      int matchLength=match.length();
      int inLength=in.length();
      for (int i=0; i < inLength; i++) {
        int upperSearhLimit=i + matchLength;
        if ((upperSearhLimit <= inLength) && (in.substring(i,upperSearhLimit).equals(match))) {
          out.append(replacement);
          i=upperSearhLimit - 1;
        }
     else {
          out.append(in.charAt(i));
        }
      }
      return out.toString();
    }

    String method2(String s,String s1,String s2){
      if ("".equals(s1) || "".equals(s) || s == null || s1 == null || s2 == null)   return s;
      StringBuffer stringbuffer=null;
      int j=0;
      int i;
      while ((i=s.indexOf(s1,j)) != -1) {
        String s4=s.substring(j,i);
        j=i + s1.length();
        if (stringbuffer == null)     stringbuffer=new StringBuffer(s2.length());
        stringbuffer.append(s4);
        stringbuffer.append(s2);
      }
      return stringbuffer != null ? stringbuffer.append(s.substring(j)).toString() : s;
    }
}
