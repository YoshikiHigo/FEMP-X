package all;

public class ClonePair2602 {

    String[] method1(String u,String c){
      String[] r=new String[2];
      if (u != null) {
        int j=u.indexOf(c);
        if (j < 0) {
          r[0]=u.length() == 0 ? null : u;
        }
     else {
          r[0]=j == 0 ? null : u.substring(0,j);
          r[1]=(j + c.length()) < u.length() ? u.substring(j + c.length()) : null;
        }
      }
      return r;
    }

    String[] method2(String str,String separator){
      String[] result={"",""};
      int index;
      if (str != null) {
        index=str.indexOf(separator);
        if (index > 0) {
          result[0]=str.substring(0,index);
          result[1]=str.substring(index + separator.length());
        }
     else {
          result[0]=str;
        }
      }
      return result;
    }
}
