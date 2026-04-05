package all;

public class ClonePair11123 {

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

    String method2(String lookIn,String lookFor,String replaceWith){
      int count=0;
      int i, j;
      StringBuffer sb;
      for (i=0; (i=lookIn.indexOf(lookFor,i)) != -1; i+=lookFor.length())   ++count;
      if (count == 0) {
        return lookIn;
      }
      sb=new StringBuffer(lookIn.length() + count * (replaceWith.length() - lookFor.length()));
      for (i=0; (j=lookIn.indexOf(lookFor,i)) != -1; i=j + lookFor.length())   sb.append(lookIn.substring(i,j)).append(replaceWith);
      sb.append(lookIn.substring(i));
      return sb.toString();
    }
}
