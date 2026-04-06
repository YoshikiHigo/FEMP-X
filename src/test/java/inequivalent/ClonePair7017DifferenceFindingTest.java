package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7017DifferenceFindingTest {
    @Test
    void methodsUseIdentityAndEqualityDifferently() {
        ClonePair7017 clonePair = new ClonePair7017();
        String element = new String("a");
        Object[] array = {new String("a")};

        assertEquals(0, clonePair.method1(array, element, 1));
        assertEquals(1, clonePair.method2(array, element, 1));
    }
}
