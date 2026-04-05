package unverified;

public class ClonePair12779 {

    long method1(String s,int base){
      int i=0;
      int sign=1;
      long r=0;
      while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
        i++;
      }
      if (i < s.length() && s.charAt(i) == '-') {
        sign=-1;
        i++;
      }
     else   if (i < s.length() && s.charAt(i) == '+') {
        i++;
      }
      while (i < s.length()) {
        char ch=s.charAt(i);
        if ('0' <= ch && ch < '0' + base) {
          r=r * base + ch - '0';
        }
     else     if ('A' <= ch && ch < 'A' + base - 10) {
          r=r * base + ch - 'A' + 10;
        }
     else     if ('a' <= ch && ch < 'a' + base - 10) {
          r=r * base + ch - 'a' + 10;
        }
     else {
          return r * sign;
        }
        i++;
      }
      return r * sign;
    }

    long method2(String s,int base){
      int i=0;
      int sign=1;
      long r=0;
      while ((i < s.length()) && Character.isWhitespace(s.charAt(i))) {
        i++;
      }
      if ((i < s.length()) && (s.charAt(i) == '-')) {
        sign=-1;
        i++;
      }
     else   if ((i < s.length()) && (s.charAt(i) == '+')) {
        i++;
      }
      while (i < s.length()) {
        char ch=s.charAt(i);
        if (('0' <= ch) && (ch < '0' + base)) {
          r=r * base + ch - '0';
        }
     else     if (('A' <= ch) && (ch < 'A' + base - 10)) {
          r=r * base + ch - 'A' + 10;
        }
     else     if (('a' <= ch) && (ch < 'a' + base - 10)) {
          r=r * base + ch - 'a' + 10;
        }
     else {
          return r * sign;
        }
        i++;
      }
      return r * sign;
    }
}
