package unverified;

public class ClonePair13235 {

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
