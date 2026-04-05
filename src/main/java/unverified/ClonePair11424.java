package unverified;

public class ClonePair11424 {

    String method1(String str,int limit){
      if (str.length() <= limit)   return str;
      String s0=str.substring(0,limit);
      s0+="...";
      return s0;
    }

    String method2(String x,int n){
      x=x.replace('\n','|');
      if (x.length() > n) {
        StringBuilder item=new StringBuilder(x.substring(0,n));
        item.append("...");
        return item.toString();
      }
     else {
        return x;
      }
    }
}
