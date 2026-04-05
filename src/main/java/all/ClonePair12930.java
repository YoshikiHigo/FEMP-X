package all;

public class ClonePair12930 {

    String method1(String s,int length){
      if (s.length() < length) {
        StringBuffer str=new StringBuffer(s);
        for (int i=0; i < length - s.length(); i++) {
          str.append(" ");
        }
        s=str.toString();
      }
     else   if (s.length() > length) {
        s=s.substring(0,length);
      }
      return s;
    }

    String method2(String s,int n){
      int l=s.length();
      if (l == n)   return s;
     else   if (l > n)   return s.substring(0,n);
     else {
        char[] carr=new char[n];
        s.getChars(0,l,carr,0);
        while (l < n)     carr[l++]=' ';
        return new String(carr);
      }
    }
}
