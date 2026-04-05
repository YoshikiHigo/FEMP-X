package all;

public class ClonePair9436 {

    String method1(String orig,String lookFor,String replaceWith){
      int idx=orig.indexOf(lookFor);
      if (idx < 0) {
        return (orig);
      }
      int prev=0;
      StringBuffer rtn=new StringBuffer();
      while (idx >= 0) {
        rtn.append(orig.substring(prev,idx));
        rtn.append(replaceWith);
        prev=idx + lookFor.length();
        idx=orig.indexOf(lookFor,prev);
      }
      rtn.append(orig.substring(prev,orig.length()));
      return (rtn.toString());
    }

    String method2(String input,String sub,String with){
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
}
