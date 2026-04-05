package unverified;

public class ClonePair13055 {

    String method1(String s,String from,String to){
      StringBuffer sNew=null;
      for (int i=0; i < s.length(); ++i) {
        int t=from.indexOf(s.charAt(i));
        if (t != -1) {
          if (sNew == null)       sNew=new StringBuffer(s);
          sNew.setCharAt(i,to.charAt(t));
        }
      }
      return sNew == null ? s : sNew.toString();
    }

    String method2(String s,String from,String to){
      String result="";
      for (int i=0; i < s.length(); i=i + 1) {
        char ch=s.charAt(i);
        int index=from.indexOf(ch);
        if (index == -1) {
          result=result + ch;
        }
     else {
          result=result + to.charAt(index);
        }
      }
      return result;
    }
}
