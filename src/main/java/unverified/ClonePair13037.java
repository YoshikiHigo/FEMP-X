package unverified;

public class ClonePair13037 {

    long method1(String s){
      long l=0L;
      for (int i=0; i < s.length() && i < 12; i++) {
        char c=s.charAt(i);
        l*=37L;
        if (c >= 'A' && c <= 'Z') {
          l+=(1 + c) - 65;
        }
     else     if (c >= 'a' && c <= 'z') {
          l+=(1 + c) - 97;
        }
     else     if (c >= '0' && c <= '9') {
          l+=(27 + c) - 48;
        }
      }
      while (l % 37L == 0L && l != 0L) {
        l/=37L;
      }
      return l;
    }

    long method2(String s){
      long l=0L;
      for (int i=0; i < s.length() && i < 12; i++) {
        char c=s.charAt(i);
        l*=37L;
        if (c >= 'A' && c <= 'Z') {
          l+=(1 + c) - 65;
        }
     else     if (c >= 'a' && c <= 'z') {
          l+=(1 + c) - 97;
        }
     else     if (c >= '0' && c <= '9') {
          l+=(27 + c) - 48;
        }
      }
      for (; l % 37L == 0L && l != 0L; l/=37L) {
        ;
      }
      return l;
    }
}
