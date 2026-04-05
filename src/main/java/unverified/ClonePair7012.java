package unverified;

public class ClonePair7012 {

    String method1(double d){
      if (Double.isNaN(d))   return "NaN";
      if (d == Double.NEGATIVE_INFINITY)   return "-Inf";
      if (d == Double.POSITIVE_INFINITY)   return "Inf";
      boolean negative=false;
      if (d < 0.0D) {
        negative=true;
        d=-d;
      }
      String unsStr=Double.toString(d);
      String mantStr, expStr;
      int exp;
      int eInd=unsStr.indexOf('e');
      if (eInd == -1)   eInd=unsStr.indexOf('E');
      if (eInd == -1) {
        mantStr=unsStr;
        expStr="";
        exp=0;
      }
     else {
        mantStr=unsStr.substring(0,eInd);
        expStr=unsStr.substring(eInd + 1);
        if (expStr.startsWith("+"))     exp=Integer.parseInt(expStr.substring(1));
     else     exp=Integer.parseInt(expStr);
      }
      String numStr;
      int dotInd=mantStr.indexOf('.');
      if (dotInd == -1)   numStr=mantStr;
     else   numStr=mantStr.substring(0,dotInd);
      long num;
      if (numStr.length() == 0)   num=0;
     else   num=Integer.parseInt(numStr);
      StringBuffer newMantBuf=new StringBuffer(numStr + ".");
      double p=Math.pow(10,exp);
      double frac=d - num * p;
      String digits="0123456789";
      int nDigits=16 - numStr.length();
      for (int i=0; i < nDigits; ++i) {
        p/=10.0D;
        int dig=(int)(frac / p);
        if (dig < 0)     dig=0;
        if (dig > 9)     dig=9;
        newMantBuf.append(digits.charAt(dig));
        frac-=dig * p;
      }
      if ((int)(frac / p + 0.5D) == 1) {
        boolean roundMore=true;
        for (int i=newMantBuf.length() - 1; i >= 0; --i) {
          int dig=digits.indexOf(newMantBuf.charAt(i));
          if (dig == -1)       continue;
          ++dig;
          if (dig == 10) {
            newMantBuf.setCharAt(i,'0');
            continue;
          }
          newMantBuf.setCharAt(i,digits.charAt(dig));
          roundMore=false;
          break;
        }
        if (roundMore) {
          newMantBuf.append("ROUNDMORE");
        }
      }
      int len=newMantBuf.length();
      while (newMantBuf.charAt(len - 1) == '0')   newMantBuf.setLength(--len);
      if (newMantBuf.charAt(len - 1) == '.')   newMantBuf.setLength(--len);
      return (negative ? "-" : "") + newMantBuf + (expStr.length() != 0 ? ("e" + expStr) : "");
    }

    String method2(double d){
      if (Double.isNaN(d))   return "NaN";
      if (d == (-1.0D / 0.0D))   return "-Inf";
      if (d == (1.0D / 0.0D))   return "Inf";
      boolean negative=false;
      if (d < 0.0D) {
        negative=true;
        d=-d;
      }
      String unsStr=Double.toString(d);
      int eInd=unsStr.indexOf(101);
      if (eInd == -1)   eInd=unsStr.indexOf(69);
      String mantStr;
      String expStr;
      int exp;
      if (eInd == -1) {
        mantStr=unsStr;
        expStr="";
        exp=0;
      }
     else {
        mantStr=unsStr.substring(0,eInd);
        expStr=unsStr.substring(eInd + 1);
        if (expStr.startsWith("+"))     exp=Integer.parseInt(expStr.substring(1));
     else     exp=Integer.parseInt(expStr);
      }
      int dotInd=mantStr.indexOf(46);
      String numStr;
      if (dotInd == -1)   numStr=mantStr;
     else   numStr=mantStr.substring(0,dotInd);
      long num;
      if (numStr.length() == 0)   num=0L;
     else   num=Integer.parseInt(numStr);
      StringBuffer newMantBuf=new StringBuffer(numStr + ".");
      double p=Math.pow(10D,exp);
      double frac=d - (double)num * p;
      String digits="0123456789";
      int nDigits=16 - numStr.length();
      for (int i=0; i < nDigits; i++) {
        p/=10D;
        int dig=(int)(frac / p);
        if (dig < 0)     dig=0;
        if (dig > 9)     dig=9;
        newMantBuf.append(digits.charAt(dig));
        frac-=(double)dig * p;
      }
      if ((int)(frac / p + 0.5D) == 1) {
        boolean roundMore=true;
        for (int i=newMantBuf.length() - 1; i >= 0; i--) {
          int dig=digits.indexOf(newMantBuf.charAt(i));
          if (dig == -1)       continue;
          if (++dig == 10) {
            newMantBuf.setCharAt(i,'0');
            continue;
          }
          newMantBuf.setCharAt(i,digits.charAt(dig));
          roundMore=false;
          break;
        }
        if (roundMore)     newMantBuf.append("ROUNDMORE");
      }
      int len;
      for (len=newMantBuf.length(); newMantBuf.charAt(len - 1) == '0'; newMantBuf.setLength(--len))   ;
      if (newMantBuf.charAt(len - 1) == '.')   newMantBuf.setLength(--len);
      return (negative ? "-" : "") + newMantBuf + (expStr.length() == 0 ? "" : "e" + expStr);
    }
}
