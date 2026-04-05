package unverified;

public class ClonePair13505 {

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

    String[] method2(String path){
      String[] nt=new String[2];
      int index=path.lastIndexOf('/');
      nt[0]=path;
      if (index >= 0)   nt[0]=path.substring(index + 1);
      index=nt[0].indexOf('.');
      nt[1]=null;
      if (index >= 0) {
        nt[1]=nt[0].substring(index + 1);
        nt[0]=nt[0].substring(0,index);
      }
      return nt;
    }
}
