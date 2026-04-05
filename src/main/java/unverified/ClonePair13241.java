package unverified;

public class ClonePair13241 {

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
