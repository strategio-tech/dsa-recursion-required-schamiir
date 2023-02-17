package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }
}
