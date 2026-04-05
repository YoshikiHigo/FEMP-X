package unverified;

public class ClonePair10784 {

    String method1(String in,String t1,String t2){
      StringBuffer result=new StringBuffer();
      int i=0;
      while (i < in.length()) {
        if (in.startsWith(t1,i)) {
          result.append(t2);
          if (t1.length() == 0) {
            result.append(in.charAt(i));
            i++;
          }
     else       i+=t1.length();
        }
     else {
          result.append(in.charAt(i));
          i++;
        }
      }
      return result.toString();
    }

    String method2(String value,String src,String dest){
      StringBuffer result=new StringBuffer();
      int pos=0;
      int index=value.indexOf(src);
      while (index >= 0) {
        if (index > pos)     result.append(value.substring(pos,index - 1));
        result.append(dest);
        pos=pos + src.length();
        index=value.indexOf(src,index + dest.length());
      }
      result.append(value.substring(pos));
      return result.toString();
    }
}
