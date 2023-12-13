package Maps;

public class CountryNotInMapException extends Exception{
    public CountryNotInMapException(String _message){
        super(_message);
    }
}
