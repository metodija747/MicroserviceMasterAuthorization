import com.kumuluz.ee.discovery.annotations.RegisterService;
import org.eclipse.microprofile.auth.LoginConfig;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.logging.Logger;

@ApplicationPath("/")
@LoginConfig(authMethod = "MP-JWT")
@RegisterService
@OpenAPIDefinition(info = @Info(title = "User authorization API", version = "1.0.0"))
public class AuthorizationApplication extends Application {
    private static final Logger LOG = Logger.getLogger(AuthorizationApplication.class.getName());
    public AuthorizationApplication() {
        LOG.info("AuthorizationApplication started!");
    }
}
