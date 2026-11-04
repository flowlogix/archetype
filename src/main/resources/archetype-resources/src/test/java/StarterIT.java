package ${package}.its;

import com.flowlogix.test.AppServerLifecycle;
import org.eu.ingwar.tools.arquillian.extension.suite.annotations.ArquillianSuiteDeployment;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@AppServerLifecycle
@ArquillianSuiteDeployment
class StarterIT {
    @Test
    void sanityCheck() {
        assertThat(true).isTrue();
    }
}
