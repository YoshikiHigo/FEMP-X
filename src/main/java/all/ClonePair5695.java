package all;

public class ClonePair5695 {

    boolean method1(String stringToSearchIn,String stringToSearchFor,boolean ignoreCase){
      if (ignoreCase) {
        return (stringToSearchIn.toLowerCase().indexOf(stringToSearchFor.toLowerCase()) >= 0);
      }
     else {
        return (stringToSearchIn.indexOf(stringToSearchFor) >= 0);
      }
    }

    boolean method2(String str,String sub,boolean caseSensitive){
      int n=str.length() - sub.length() + 1;
      if (n < 0)   return false;
      for (int i=0; i < n; i++) {
        if (sub.regionMatches(caseSensitive,0,str,i,sub.length()))     return true;
      }
      return false;
    }
}
