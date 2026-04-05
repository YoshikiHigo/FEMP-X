package all;

import java.util.*;

public class ClonePair4927 {

    int[] method1(Collection collection){
      int[] array=new int[collection.size()];
      int i=0;
      for (Iterator iterator=collection.iterator(); iterator.hasNext(); ) {
        Integer integer=(Integer)iterator.next();
        array[i++]=integer.intValue();
      }
      return array;
    }

    int[] method2(Collection integerCollection){
      int[] rv=new int[integerCollection.size()];
      Iterator iterator=integerCollection.iterator();
      for (int i=0; iterator.hasNext(); i++)   rv[i]=((Integer)iterator.next()).intValue();
      return rv;
    }
}
