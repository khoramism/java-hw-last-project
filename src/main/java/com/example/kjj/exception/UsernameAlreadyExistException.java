package src.exception;

public class UsernameAlreadyExistException extends Exception{
    public UsernameAlreadyExistException(){
        super();
    }

    public UsernameAlreadyExistException(String message){
        super(message);
    }
}
