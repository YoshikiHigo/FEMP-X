package unverified;

public class ClonePair11718 {

    String method1(String initialString,String toReplace,String replacement){
      if (initialString == null) {
        return null;
      }
      if (toReplace != null && !(toReplace.equals("")) && replacement != null) {
        StringBuffer stb=new StringBuffer();
        int index=initialString.indexOf(toReplace);
        int oldIndex=0;
        while (index != -1) {
          stb.append(initialString.substring(oldIndex,index));
          stb.append(replacement);
          oldIndex=index + toReplace.length();
          index=initialString.indexOf(toReplace,index + toReplace.length());
        }
        stb.append(initialString.substring(oldIndex));
        return stb.toString();
      }
     else {
        return initialString;
      }
    }

    String method2(String s,String sub,String with){
      if ((s == null) || (sub == null) || (with == null)) {
        return s;
      }
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1) {
        return s;
      }
      StringBuilder buf=new StringBuilder(s.length() + with.length());
      do {
        buf.append(s.substring(c,i));
        buf.append(with);
        c=i + sub.length();
      }
     while ((i=s.indexOf(sub,c)) != -1);
      if (c < s.length()) {
        buf.append(s.substring(c,s.length()));
      }
      return buf.toString();
    }
}
