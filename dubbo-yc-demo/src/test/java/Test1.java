import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.ProxyFactory;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Test1 {

    public static void main(String[] args){

        //很简单，初始化了type和objectFactory
        ExtensionLoader<ProxyFactory> proxyFactoryExtensionLoader = ExtensionLoader.getExtensionLoader(ProxyFactory.class);
        //核心
        ProxyFactory proxyFactory = proxyFactoryExtensionLoader.getAdaptiveExtension();


        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protocol = extensionLoader.getAdaptiveExtension();




        System.out.println("finish");


    }


}
