package mmokrousov.Comparator;

import mmokrousov.Model.Calculate.Response.CalculateResponse;
import mmokrousov.Model.CancelContract.Response.CancelContractResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class CancelContractComparator implements IComparator<CancelContractResponse> {
    public void compare(CancelContractResponse response, CancelContractResponse etalon){
        assertThat(response)
                .usingRecursiveComparison()
                .ignoringFields("traceId")
                .isEqualTo(etalon);
    }
}
