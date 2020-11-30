import junit.framework.TestCase;
import org.junit.Test;

import java.util.Scanner;

public class DecryptTest extends TestCase {
    @Test
    public void Decrypt(String plaintext, int shift) {
        plaintext = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String ciphertext = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        shift = 1;
        System.out.println("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
    }
}

