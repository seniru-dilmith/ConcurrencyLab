public class PrintJobOverloadException extends IllegalStateException{
    public PrintJobOverloadException(){
        super("Possible number of print jobs exceeded!!!");
    }
    public PrintJobOverloadException(String s){
        super(s);
    }


}
