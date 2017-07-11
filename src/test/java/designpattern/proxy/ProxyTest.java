package designpattern.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by justin on 7/11/17.
 */
public class ProxyTest {

    @Test
    public void main(){
        PortfolioService client = new PortfoiloServiceClient();

        System.out.println(client.getPortfolio("ticker"));
    }

}