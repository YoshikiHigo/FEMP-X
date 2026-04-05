package unverified;

public class ClonePair13513 {

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

    String[] method2(String filename){
      int index=filename.lastIndexOf('.');
      if (index == -1)   return new String[]{filename,""};
      String ext=filename.substring(index + 1).toLowerCase();
      if (ext.equals("gz")) {
        int index2=filename.lastIndexOf('.',index - 1);
        if (index2 != -1) {
          return new String[]{filename.substring(0,index2),filename.substring(index2 + 1).toLowerCase()};
        }
      }
      return new String[]{filename.substring(0,index),ext};
    }
}
