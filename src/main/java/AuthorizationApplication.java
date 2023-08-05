import com.kumuluz.ee.discovery.annotations.RegisterService;
import org.eclipse.microprofile.auth.LoginConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.logging.Logger;

@ApplicationPath("/")
@LoginConfig(authMethod = "MP-JWT")
@RegisterService
public class AuthorizationApplication extends Application {
    private static final Logger LOG = Logger.getLogger(AuthorizationApplication.class.getName());
    public AuthorizationApplication() {
        LOG.info("AuthorizationApplication started!");
    }
}
