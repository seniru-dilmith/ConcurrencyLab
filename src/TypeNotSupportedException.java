import java.lang.reflect.Type;

public class TypeNotSupportedException extends IllegalArgumentException{
    public TypeNotSupportedException(){
        super("Not supported file type!!!");
    }

    public TypeNotSupportedException(String s){
        super(s);
    }
}
