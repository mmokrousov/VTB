package mmokrousov.Comparator;

import mmokrousov.Model.CheckAccess.Response.CheckAccessResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckAccessComparator implements IComparator<CheckAccessResponse>{

    public void compare(CheckAccessResponse response, CheckAccessResponse etalon) {
        assertThat(response)
                .usingRecursiveComparison()
                .ignoringFields("traceId", "userGuide")
                .isEqualTo(etalon);
    }
}
