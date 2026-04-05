package all;

public class ClonePair7291 {

    Object method1(Object[] args,int index){
      if (args != null && index < args.length) {
        return args[index];
      }
      return null;
    }

    Object method2(Object[] a_values,int a_index){
      if (a_values == null) {
        return null;
      }
      if (a_values.length > a_index) {
        return a_values[a_index];
      }
      return null;
    }
}
