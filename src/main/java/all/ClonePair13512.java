package all;

public class ClonePair13512 {

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

    String[] method2(String typeName){
      String typeArgument=null;
      int ltIndex=typeName.indexOf('<');
      if (ltIndex > 0) {
        int gtIndex=typeName.lastIndexOf('>');
        if (gtIndex > ltIndex + 1) {
          typeArgument=typeName.substring(ltIndex + 1,gtIndex).trim();
          typeName=typeName.substring(0,ltIndex).trim();
        }
      }
      return new String[]{typeName,typeArgument};
    }
}
