package all;

public class ClonePair6024 {

    int method1(int c,int radix){
      int digit;
      if ((c >= '0') && (c <= '9')) {
        digit=c - '0';
      }
     else   if ((c >= 'a') && (c <= 'z')) {
        digit=c - ('a' - 10);
      }
     else   if ((c >= 'A') && (c <= 'Z')) {
        digit=c - ('A' - 10);
      }
     else {
        digit=radix;
      }
      return (digit >= radix) ? -1 : digit;
    }

    int method2(int c,int radix){
      final int digit;
      if ((c >= '0') && (c <= '9'))   digit=c - '0';
     else   if ((c >= 'a') && (c <= 'z'))   digit=c - ('a' - 10);
     else   if ((c >= 'A') && (c <= 'Z'))   digit=c - ('A' - 10);
     else   digit=radix;
      return (digit >= radix) ? -1 : digit;
    }
}
