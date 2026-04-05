package unverified;

public class ClonePair2818 {

    double method1(String x){
      if (x.length() <= 1 || !x.contains(",")) {
        return Double.parseDouble(x);
      }
     else {
        return Double.parseDouble(x.replace(",","."));
      }
    }

    double method2(String token){
      int st=0;
      int e1=Math.max(token.indexOf('e'),token.indexOf('E'));
      double d=Double.valueOf(token.substring(st,(e1 < 0 ? token.length() : e1))).doubleValue();
      if (e1 > 0)   d*=Math.pow(10d,Double.valueOf(token.substring(e1 + 1)).doubleValue());
      return d;
    }
}
