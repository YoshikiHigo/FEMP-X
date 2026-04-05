package all;

public class ClonePair13524 {

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

    String[] method2(String registerName){
      int pos=registerName.lastIndexOf('?');
      String[] split=new String[2];
      if (pos < 0) {
        split[0]=registerName;
      }
     else {
        split[0]=registerName.substring(0,pos).trim();
        split[1]=registerName.substring(pos + 1).trim();
        if (split[1].length() == 0)     split[1]=null;
      }
      return split;
    }
}
