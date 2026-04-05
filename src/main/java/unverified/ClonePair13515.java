package unverified;

public class ClonePair13515 {

    String[] method1(String hname){
      String ans[]=new String[2];
      int n=hname.lastIndexOf('.');
      if (n < 0) {
        ans[0]="";
        ans[1]=hname;
      }
     else {
        ans[0]=hname.substring(0,n);
        ans[1]=n < hname.length() - 1 ? hname.substring(n + 1) : "";
      }
      return ans;
    }

    String[] method2(String s){
      s=s.trim();
      String host="", port="";
      final int firstColon=s.indexOf(':');
      if (firstColon < 0) {
        try {
          Integer.parseInt(s);
          port=s;
        }
     catch (    NumberFormatException nfe) {
          host=s;
        }
      }
     else {
        host=s.substring(0,firstColon).trim();
        port=s.substring(firstColon + 1).trim();
      }
      final String[] result=new String[2];
      result[0]=host.length() != 0 ? host : null;
      result[1]=port.length() != 0 ? port : null;
      return result;
    }
}
