package unverified;

public class ClonePair13185 {

    String method1(String input,String sub,String with){
      int fromIndex=0;
      int index=input.indexOf(sub,fromIndex);
      if (index == -1) {
        return input;
      }
      final StringBuilder buf=new StringBuilder(input.length() + with.length());
      do {
        buf.append(input.substring(fromIndex,index));
        buf.append(with);
        fromIndex=index + sub.length();
      }
     while ((index=input.indexOf(sub,fromIndex)) != -1);
      if (fromIndex < input.length()) {
        buf.append(input.substring(fromIndex,input.length()));
      }
      return buf.toString();
    }

    String method2(String orig,String find,String repl){
      StringBuffer buf=new StringBuffer();
      int pos=0;
      while (pos < orig.length()) {
        int foundPos=orig.indexOf(find,pos);
        if (foundPos == -1) {
          break;
        }
     else {
          buf.append(orig.substring(pos,foundPos));
          buf.append(repl);
          pos=foundPos + find.length();
        }
      }
      buf.append(orig.substring(pos));
      return buf.toString();
    }
}
