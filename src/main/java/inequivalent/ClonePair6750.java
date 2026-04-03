package inequivalent;

public class ClonePair6750 {

    long method1(byte[] value) {
        if (value == null || value.length != 8) return 0x0;
        return (0xff & value[0]) << 0 | (0xff & value[1]) << 8 | (0xff & value[2]) << 16 | (0xff & value[3]) << 24 | (0xff & value[4]) << 32 | (0xff & value[5]) << 40 | (0xff & value[6]) << 48 | (0xff & value[7]) << 56;
    }

    long method2(byte[] value) {
        if (value == null || value.length != 8) return 0x0;
        return (0xff & value[0]) << 0 | (0xff & value[1]) << 8 | (0xff & value[2]) << 16 | (long) (0xff & value[3]) << 24 | (long) (0xff & value[4]) << 32 | (long) (0xff & value[5]) << 40 | (long) (0xff & value[6]) << 48 | (long) (0xff & value[7]) << 56;
    }
}
