package mmokrousov.Comparator;

import mmokrousov.Model.Calculate.CalculateTestCase;
import mmokrousov.Model.Calculate.Response.CalculateResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateComparator implements IComparator<CalculateResponse>{
    public void compare(CalculateResponse response, CalculateResponse etalon){
        assertThat(response)
                .usingRecursiveComparison().
                ignoringFields("traceId")
                .isEqualTo(etalon);
    }

}
