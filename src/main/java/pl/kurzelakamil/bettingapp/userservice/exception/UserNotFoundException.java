package pl.kurzelakamil.bettingapp.userservice.exception;

public class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -1848211587111510801L;

    public UserNotFoundException(Long id) {super(String.format("UserAggregate not found for id: %d", id));}
}
