import java.util.ServiceLoader;

/**
 * Created by Administrator on 2017/5/31.
 */
public class SpiTest {

    public static void main(String[] args){
        ServiceLoader<Command> serviceLoader= ServiceLoader.load(Command.class);

        for(Command command:serviceLoader){
            command.execute();
        }

    }

}
