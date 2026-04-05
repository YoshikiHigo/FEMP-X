package unverified;

public class ClonePair8289 {

    boolean method1(String a,String b){
      if (a == b)   return true;
      String aw=a.split(" ",1)[0];
      String bw=b.split(" ",1)[0];
      return aw.compareTo(bw) == 0;
    }

    boolean method2(String s1,String s2){
      if (s1.length() != s2.length())   return false;
      int result=0;
      for (int i=0; i < s1.length(); i++) {
        int c1=s1.charAt(i);
        int c2=s2.charAt(i);
        result|=(c1 ^ c2);
      }
      return result == 0;
    }
}
