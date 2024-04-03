public class NoFrontElementInTheQueueExeption extends IllegalStateException{
    public NoFrontElementInTheQueueExeption(){super("No element in the front.");}
    public NoFrontElementInTheQueueExeption(String s){super(s);}
}
