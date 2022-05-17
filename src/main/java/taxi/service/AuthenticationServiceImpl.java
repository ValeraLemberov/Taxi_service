package taxi.service;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.dao.DriverDao;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        logger.info("Login method was called. Incoming params login = {}", login);
        Optional<Driver> driverOptional = driverDao.findByLogin(login);
        if (driverOptional.isEmpty() || !driverOptional.get().getPassword().equals(password)) {
            logger.warn("Authentication was failed. Incoming params login = {};", login);
            throw new AuthenticationException("User name or password was incorrect");
        }
        return driverOptional.get();
    }

    @Override
    public boolean isExist(String login) {
        return !driverDao.findByLogin(login).isEmpty();
    }
}
