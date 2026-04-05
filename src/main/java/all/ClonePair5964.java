package all;

public class ClonePair5964 {

    float method1(String input){
      if (input.startsWith("~"))   input=input.substring(1,input.length() - 1);
      if (input.length() == 0)   return 0;
     else   return (float)Double.parseDouble(input.replace(',','.'));
    }

    float method2(String input){
      if (input.startsWith("~"))   input=input.substring(1,input.length() - 1);
      if (input.length() == 0)   return 0;
     else   return Float.parseFloat(input);
    }
}
