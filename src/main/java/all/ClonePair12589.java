package all;

public class ClonePair12589 {

    boolean method1(int d,int m,int a){
      boolean correto=true;
      int[] dias={31,28,31,30,31,30,31,31,30,31,30,31};
      if (a < 0 || m < 1 || m > 12) {
        correto=false;
      }
     else {
        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
          dias[1]=29;
        }
        if (d < 1 || d > dias[m - 1]) {
          correto=false;
        }
      }
      return (correto);
    }

    boolean method2(int tag,int monat,int jahr){
      if (jahr < 0)   return false;
      if (monat < 1 || monat > 12)   return false;
      if (tag < 1)   return false;
      if (monat == 2) {
        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
          if (tag > 29)       return false;
        }
     else {
          if (tag > 28)       return false;
        }
      }
     else   if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
        if (tag > 30)     return false;
      }
     else {
        if (tag > 31)     return false;
      }
      return true;
    }
}
