package all;

public class ClonePair2949 {

    double method1(String value){
      if (value.equals(""))   return 0;
      return Double.parseDouble(value);
    }

    double method2(String formula){
      if (!formula.contains("+") && !formula.contains("r") && !formula.contains("/")&& !formula.contains("*"))   if (formula.length() > 0)   return Double.parseDouble(formula);
     else   return 0;
      int pi, ps, pr, pd, pm, pf;
      double a, b, c;
      c=0;
      pi=0;
      pd=formula.lastIndexOf('/');
      pm=formula.lastIndexOf('*');
      pr=formula.lastIndexOf('r');
      ps=formula.lastIndexOf('+');
      pf=formula.length();
      if (pd >= 0) {
        b=Double.parseDouble(formula.substring(pd + 1,pf));
        a=Double.parseDouble(formula.substring(pi,pd));
        c=a / b;
      }
     else   if (pm >= 0) {
        b=Double.parseDouble(formula.substring(pm + 1,pf));
        a=Double.parseDouble(formula.substring(pi,pm));
        c=a * b;
      }
     else   if (pr >= 0) {
        b=Double.parseDouble(formula.substring(pr + 1,pf));
        a=Double.parseDouble(formula.substring(pi,pr));
        c=a - b;
      }
     else   if (ps >= 0) {
        b=Double.parseDouble(formula.substring(ps + 1,pf));
        a=Double.parseDouble(formula.substring(pi,ps));
        c=a + b;
      }
      return c;
    }
}
