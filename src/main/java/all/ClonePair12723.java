package all;

public class ClonePair12723 {

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

    String method2(String orig,String find,String replace){
      if (find == null || find.equals("")) {
        return orig;
      }
      if (replace == null) {
        replace="";
      }
      if (orig == null) {
        return null;
      }
      int origLength=orig.length();
      int findLength=find.length();
      StringBuffer replaced=new StringBuffer((int)(origLength * 2));
      int lastIndex=0;
      int indexOf=orig.indexOf(find,lastIndex);
      while (indexOf > -1) {
        replaced.append(orig.substring(lastIndex,indexOf));
        replaced.append(replace);
        lastIndex=indexOf + findLength;
        indexOf=orig.indexOf(find,lastIndex);
      }
      if (lastIndex < origLength) {
        replaced.append(orig.substring(lastIndex,origLength));
      }
      return replaced.toString();
    }
}
