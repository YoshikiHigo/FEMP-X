package equivalent;

public class ClonePair11143 {
    boolean method1(Class dest, Class source) {
        return dest.isAssignableFrom(source) || ((dest == Boolean.TYPE) && (source == Boolean.class)) || ((dest == Byte.TYPE) && (source == Byte.class)) || ((dest == Character.TYPE) && (source == Character.class)) || ((dest == Double.TYPE) && (source == Double.class)) || ((dest == Float.TYPE) && (source == Float.class)) || ((dest == Integer.TYPE) && (source == Integer.class)) || ((dest == Long.TYPE) && (source == Long.class)) || ((dest == Short.TYPE) && (source == Short.class));
    }

    boolean method2(Class target, Class source) {
        if (target.isAssignableFrom(source)) {
            return true;
        } else
            return (target.equals(Boolean.TYPE) && source.equals(Boolean.class)) || (target.equals(Character.TYPE) && source.equals(Character.class)) || (target.equals(Byte.TYPE) && source.equals(Byte.class)) || (target.equals(Short.TYPE) && source.equals(Short.class)) || (target.equals(Integer.TYPE) && source.equals(Integer.class)) || (target.equals(Long.TYPE) && source.equals(Long.class)) || (target.equals(Float.TYPE) && source.equals(Float.class)) || (target.equals(Double.TYPE) && source.equals(Double.class));
    }
}
