package unverified;

public class ClonePair6672 {

    String method1(Iterable list,String s){
      String r="";
      for (  Object a : list)   r=r + a + s;
      if (r.length() >= s.length())   r=r.substring(0,r.length() - s.length());
      return r;
    }

    String method2(Iterable i,String delim){
      StringBuilder sb=new StringBuilder();
      for (  Object o : i) {
        if (sb.length() > 0)     sb.append(delim);
        sb.append(o);
      }
      return sb.toString();
    }
}
