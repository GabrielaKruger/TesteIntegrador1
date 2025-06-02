package exceptions;

public class DriverInicializationErrorException extends Exception{
    public DriverInicializationErrorException(Exception exception) {
        super("Erro ao inicializar o Driver - " +exception.getMessage());
    }
}
