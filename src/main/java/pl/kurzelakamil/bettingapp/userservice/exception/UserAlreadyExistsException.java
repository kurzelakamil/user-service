package pl.kurzelakamil.bettingapp.userservice.exception;

public class UserAlreadyExistsException extends RuntimeException {

    private static final long serialVersionUID = 4829489347681821357L;

    public UserAlreadyExistsException(String email) {super(String.format("UserAggregate already exists for email: %s", email));}
}
