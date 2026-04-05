package all;

public class ClonePair12651 {

    String method1(String str,char cc){
      int i=0, j=str.length();
      while ((i < j) && str.charAt(i) == cc) {
        i++;
      }
      while ((i < j) && str.charAt(j - 1) == cc) {
        j--;
      }
      return str.substring(i,j);
    }

    String method2(String src,char d){
      int st=0;
      int len=src.length() - 1;
      while (st < len && src.charAt(st) == d) {
        st++;
      }
      while (len > st && src.charAt(len) == d) {
        len--;
      }
      return src.substring(st,len + 1);
    }
}
