package all;

public class ClonePair4815 {

    String method1(String s,char c,int length){
      if (s == null)   return (s);
      if (s.length() >= length)   return (s);
      StringBuilder sb=new StringBuilder();
      for (length=length - s.length(); length > 0; length--)   sb.append(c);
      sb.append(s);
      return (sb.toString());
    }

    String method2(String s,char c,int length){
      if (s == null)   return null;
      if (s.length() >= length)   return new String(s);
      while (s.length() < length)   s=c + s;
      return s;
    }
}
