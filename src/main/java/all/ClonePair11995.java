package all;

public class ClonePair11995 {

    String method1(String path,String search,String replacement){
      int index=path.indexOf(search);
      if (index >= 0) {
        String result=path.substring(0,index);
        result+=replacement;
        result+=path.substring(index + search.length());
        return result;
      }
     else {
        return path;
      }
    }

    String method2(String s,String sub,String with){
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1) {
        return s;
      }
      StringBuffer buf=new StringBuffer(s.length() + with.length());
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
