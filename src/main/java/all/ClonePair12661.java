package all;

public class ClonePair12661 {

    int method1(String string){
      int sex;
      if (string.equals("")) {
        sex=0;
      }
     else {
        sex=Integer.parseInt(string);
      }
      return sex;
    }

    int method2(String s){
      String t="";
      int n=0;
      for (int i=0; i < s.length(); i++) {
        if (!s.substring(i,i + 1).equals("0")) {
          for (; i < s.length(); i++) {
            t+=s.substring(i,i + 1);
          }
          n=Integer.parseInt(t);
          break;
        }
      }
      return n;
    }
}
