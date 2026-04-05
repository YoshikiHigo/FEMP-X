package all;

public class ClonePair7293 {

    Object method1(Object[] args,int index){
      if (args != null && index < args.length) {
        return args[index];
      }
      return null;
    }

    Object method2(Object[] array,int pos){
      if ((array == null) || (array.length <= pos)) {
        return null;
      }
     else {
        return array[pos];
      }
    }
}
