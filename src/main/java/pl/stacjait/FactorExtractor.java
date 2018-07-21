package pl.stacjait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorExtractor {

    public List<Integer> extract(int number){
        List<Integer> factors = new ArrayList<>();
        int divider = 2;
        while (number>1){
            while (number % divider ==0){
                number /= divider;
                factors.add(divider);
            }
            divider++;
        }

        return factors;
    }
}
