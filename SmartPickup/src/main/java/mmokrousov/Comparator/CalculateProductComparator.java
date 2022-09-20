package mmokrousov.Comparator;

import mmokrousov.Model.CalculateProduct.Response.CalculateProductResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateProductComparator implements IComparator<CalculateProductResponse> {
    public void compare(CalculateProductResponse response, CalculateProductResponse etalon){
        assertThat(response)
                .usingRecursiveComparison().
                ignoringFields("")
                .isEqualTo(etalon);
    }
}
