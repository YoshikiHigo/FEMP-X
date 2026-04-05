package unverified;

public class ClonePair13031 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
    }

    String method2(String source,String toReplace,String replacement){
      if (source != null && source.indexOf(toReplace) != -1) {
        StringBuffer sb=new StringBuffer();
        int ix=-1;
        while ((ix=source.indexOf(toReplace)) >= 0) {
          sb.append(source.substring(0,ix)).append(replacement);
          source=source.substring(ix + toReplace.length());
        }
        if (source.length() >= 1) {
          sb.append(source);
        }
        return sb.toString();
      }
      return source;
    }
}
