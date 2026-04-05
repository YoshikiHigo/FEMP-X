package all;

public class ClonePair13297 {

    String method1(String str,String f_s,String t_s){
      int pos=0;
      String res="";
      while (pos < str.length()) {
        int p1=str.indexOf(f_s,pos);
        if (p1 == -1) {
          res+=str.substring(pos);
          break;
        }
        res+=str.substring(pos,p1) + t_s;
        pos=p1 + f_s.length();
      }
      return (res);
    }

    String method2(String destination,String what,String with){
      if (destination.indexOf(what) >= 0) {
        StringBuffer buf=new StringBuffer();
        int last=0;
        int current=destination.indexOf(what);
        int whatLength=what.length();
        while (current >= 0) {
          if (current > 0) {
            buf.append(destination.substring(last,current));
          }
          buf.append(with);
          last=current + whatLength;
          current=destination.indexOf(what,last);
        }
        if (destination.length() > last) {
          buf.append(destination.substring(last));
        }
        return buf.toString();
      }
      return destination;
    }
}
