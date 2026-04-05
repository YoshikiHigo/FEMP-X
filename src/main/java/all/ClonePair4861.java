package all;

public class ClonePair4861 {

    boolean method1(String className,String packageName){
      if (!className.contains(".")) {
        return (packageName == null) || packageName.isEmpty();
      }
     else {
        final String classPackage=className.substring(0,className.lastIndexOf('.'));
        return packageName.equals(classPackage);
      }
    }

    boolean method2(String className,String packageName){
      if (!className.contains(".")) {
        return packageName == null || packageName.isEmpty();
      }
     else {
        String classPackage=className.substring(0,className.lastIndexOf('.'));
        return packageName.equals(classPackage);
      }
    }
}
