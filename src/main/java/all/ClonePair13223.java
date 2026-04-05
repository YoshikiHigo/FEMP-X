package all;

public class ClonePair13223 {

    String[] method1(String path){
      path=path.replaceFirst("^/+","");
      String ctrlName=null;
      String actionName=null;
      if (path.length() > 0) {
        int divider=path.lastIndexOf("/");
        if (divider == -1) {
          ctrlName=path;
        }
     else {
          ctrlName=path.substring(0,divider).trim();
          if (divider + 1 < path.length()) {
            actionName=path.substring(divider + 1).trim();
          }
        }
      }
      return new String[]{ctrlName,actionName};
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
