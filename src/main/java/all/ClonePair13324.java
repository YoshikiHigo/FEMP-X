package all;

public class ClonePair13324 {

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

    String method2(String input,String replace,String replacement){
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      StringBuffer returning=new StringBuffer();
      while (idx != -1) {
        returning.append(input.substring(0,idx));
        returning.append(replacement);
        input=input.substring(idx + replace.length());
        idx=input.indexOf(replace);
      }
      returning.append(input);
      return returning.toString();
    }
}
