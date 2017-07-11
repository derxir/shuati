package designpattern.proxy;

import javax.sound.sampled.Port;

/**
 * Created by justin on 7/11/17.
 */
public class PortfolioServiceServer implements PortfolioService {
    @Override
    public Object getPortfolio(String ticker) {
        return "portfolio object";
    }
}
