package all;

public class ClonePair13300 {

    String method1(String str,String f_s,String t_s){
      int pos=0;
      String res="";
      while (pos < str.length()) {
        int p1=str.indexOf(f_s,pos);
        if (p1 == -1) {
          res+=str.substring(pos);
          break;
        }
        res+=str.substring(pos,p1) + t_s;
        pos=p1 + f_s.length();
      }
      return (res);
    }

    String method2(String source,String toBeReplaced,String replacement){
      StringBuffer results=new StringBuffer();
      int len=toBeReplaced.length();
      for (int i=0; i < source.length(); ++i) {
        if (source.regionMatches(false,i,toBeReplaced,0,len)) {
          results.append(replacement);
          i+=len - 1;
        }
     else {
          results.append(source.charAt(i));
        }
      }
      return results.toString();
    }
}
