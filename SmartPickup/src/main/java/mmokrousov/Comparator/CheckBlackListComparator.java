package mmokrousov.Comparator;

import mmokrousov.Model.CheckBlackList.Response.CheckBlackListResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckBlackListComparator implements IComparator<CheckBlackListResponse>{
    public void compare(CheckBlackListResponse response, CheckBlackListResponse etalon){
        assertThat(response)
                .usingRecursiveComparison()
                .ignoringFields("traceId")
                .isEqualTo(etalon);
    }
}
