package unverified;

public class ClonePair2993 {

    double method1(String valueString){
      if (valueString.contains(",")) {
        valueString=valueString.replace(',','.');
      }
      return Double.parseDouble(valueString);
    }

    double method2(String token){
      int st=0;
      int e1=Math.max(token.indexOf('e'),token.indexOf('E'));
      double d=Double.valueOf(token.substring(st,(e1 < 0 ? token.length() : e1))).doubleValue();
      if (e1 > 0)   d*=Math.pow(10d,Double.valueOf(token.substring(e1 + 1)).doubleValue());
      return d;
    }
}
