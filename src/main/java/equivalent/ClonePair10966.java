package equivalent;

public class ClonePair10966 {
    Object method1(Class runMethodParam, Object matchObj) {
        Object param = null;
        if (matchObj == null) {
            if (runMethodParam.isPrimitive()) {
                if (runMethodParam.equals(boolean.class)) param = Boolean.FALSE;
                else if (runMethodParam.equals(char.class)) param = new Character('\u0000');
                else if (runMethodParam.equals(byte.class)) param = Byte.valueOf((byte) 0);
                else if (runMethodParam.equals(short.class)) param = Short.valueOf((short) 0);
                else if (runMethodParam.equals(int.class)) param = Integer.valueOf(0);
                else if (runMethodParam.equals(long.class)) param = Long.valueOf(0);
                else if (runMethodParam.equals(float.class)) param = new Float(0);
                else if (runMethodParam.equals(double.class)) param = new Double(0);
            }
        } else {
            if (runMethodParam.equals(Boolean.class) || runMethodParam.equals(boolean.class))
                param = Boolean.valueOf((String) matchObj);
            else if (runMethodParam.equals(Character.class) || runMethodParam.equals(char.class))
                param = new Character(((String) matchObj).charAt(0));
            else if (runMethodParam.equals(Byte.class) || runMethodParam.equals(byte.class))
                param = Byte.valueOf((String) matchObj);
            else if (runMethodParam.equals(Short.class) || runMethodParam.equals(short.class))
                param = Short.valueOf((String) matchObj);
            else if (runMethodParam.equals(Integer.class) || runMethodParam.equals(int.class))
                param = Integer.valueOf((String) matchObj);
            else if (runMethodParam.equals(Long.class) || runMethodParam.equals(long.class))
                param = Long.valueOf((String) matchObj);
            else if (runMethodParam.equals(Float.class) || runMethodParam.equals(float.class))
                param = Float.valueOf((String) matchObj);
            else if (runMethodParam.equals(Double.class) || runMethodParam.equals(double.class))
                param = Double.valueOf((String) matchObj);
            else if (matchObj instanceof Throwable && runMethodParam.isAssignableFrom(matchObj.getClass()))
                param = matchObj;
            else {
                try {
                    param = runMethodParam.cast(matchObj);
                } catch (ClassCastException e) {
                }
            }
        }
        return param;
    }

    Object method2(Class runMethodParam, Object matchObj) {
        Object param = null;
        if (matchObj == null) {
            if (runMethodParam.isPrimitive()) {
                if (runMethodParam.equals(boolean.class)) param = Boolean.FALSE;
                else if (runMethodParam.equals(char.class)) param = new Character('\u0000');
                else if (runMethodParam.equals(byte.class)) param = Byte.valueOf((byte) 0);
                else if (runMethodParam.equals(short.class)) param = Short.valueOf((short) 0);
                else if (runMethodParam.equals(int.class)) param = Integer.valueOf(0);
                else if (runMethodParam.equals(long.class)) param = Long.valueOf(0);
                else if (runMethodParam.equals(float.class)) param = new Float(0);
                else if (runMethodParam.equals(double.class)) param = new Double(0);
            }
        } else {
            if (runMethodParam.equals(Boolean.class) || runMethodParam.equals(boolean.class))
                param = Boolean.valueOf((String) matchObj);
            else if (runMethodParam.equals(Character.class) || runMethodParam.equals(char.class))
                param = new Character(((String) matchObj).charAt(0));
            else if (runMethodParam.equals(Byte.class) || runMethodParam.equals(byte.class))
                param = Byte.valueOf((String) matchObj);
            else if (runMethodParam.equals(Short.class) || runMethodParam.equals(short.class))
                param = Short.valueOf((String) matchObj);
            else if (runMethodParam.equals(Integer.class) || runMethodParam.equals(int.class))
                param = Integer.valueOf((String) matchObj);
            else if (runMethodParam.equals(Long.class) || runMethodParam.equals(long.class))
                param = Long.valueOf((String) matchObj);
            else if (runMethodParam.equals(Float.class) || runMethodParam.equals(float.class))
                param = Float.valueOf((String) matchObj);
            else if (runMethodParam.equals(Double.class) || runMethodParam.equals(double.class))
                param = Double.valueOf((String) matchObj);
            else if (matchObj != null && matchObj instanceof Throwable && runMethodParam.isAssignableFrom(matchObj.getClass()))
                param = matchObj;
            else {
                try {
                    param = runMethodParam.cast(matchObj);
                } catch (ClassCastException e) {
                }
            }
        }
        return param;
    }
}
