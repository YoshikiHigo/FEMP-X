package unverified;

public class ClonePair13230 {

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
