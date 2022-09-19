package mmokrousov.Comparator;

import mmokrousov.Model.CreateContract.Response.CreateContractResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateContractComparator implements IComparator<CreateContractResponse>{
    public void compare(CreateContractResponse response, CreateContractResponse etalon){
        assertThat(response)
                .usingRecursiveComparison()
                .ignoringFields("traceId")
                .isEqualTo(etalon);
    }

}
