package unverified;

public class ClonePair10415 {

    String method1(String original,String oldString,String newString){
      int index=original.indexOf(oldString);
      if (index < 0) {
        return original;
      }
     else {
        final String replace=newString == null ? "" : newString;
        final StringBuilder buf=new StringBuilder(Math.max(16,original.length() + replace.length()));
        int last=0;
        while (index != -1) {
          buf.append(original.substring(last,index));
          buf.append(replace);
          last=index + oldString.length();
          index=original.indexOf(oldString,last);
        }
        buf.append(original.substring(last));
        return buf.toString();
      }
    }

    String method2(String s,String target,String replacement){
      StringBuilder sb=null;
      int tlen=target.length();
      int bi=0;
      for (int n=s.indexOf(target); n >= 0; n=s.indexOf(target,bi)) {
        if (sb == null) {
          sb=new StringBuilder();
        }
        sb.append(s.substring(bi,n));
        if (replacement != null) {
          sb.append(replacement);
        }
        bi=n + tlen;
      }
      if (sb == null) {
        return s;
      }
     else {
        sb.append(s.substring(bi));
        return sb.toString();
      }
    }
}
