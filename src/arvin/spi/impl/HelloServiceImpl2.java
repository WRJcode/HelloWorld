package arvin.spi.impl;

import arvin.spi.HelloService;

public class HelloServiceImpl2 implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("This is hello service2.");
    }
}
