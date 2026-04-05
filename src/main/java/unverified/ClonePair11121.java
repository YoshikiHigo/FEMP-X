package unverified;

public class ClonePair11121 {

    String method1(String str,String oldVal,String newVal){
      String res=str;
      if (str.length() > 0) {
        int pos=str.indexOf(oldVal);
        if (pos >= 0) {
          res=str.substring(0,pos);
          res=res.concat(newVal);
          res=res.concat(str.substring(pos + oldVal.length()));
          return res;
        }
      }
      return res;
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
