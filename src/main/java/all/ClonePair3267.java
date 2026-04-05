package all;

public class ClonePair3267 {

    boolean method1(int[] id,int[] mask){
      for (int i=0, size=id.length < mask.length ? id.length : mask.length; i < size; ++i)   if (0 < mask[i] && id[i] != mask[i])   return false;
      for (int i=0, size=id.length; i < size; ++i)   if (0 == id[i])   return false;
      return true;
    }

    boolean method2(int[] id,int[] mask){
      for (int i=0, size=Math.min(id.length,mask.length); i < size; ++i)   if (0 < mask[i] && id[i] != mask[i])   return false;
      for (int i=0, size=id.length; i < size; ++i)   if (0 == id[i])   return false;
      return true;
    }
}
