package designpattern.proxy;

/**
 * Created by justin on 7/11/17.
 */
public class PortfoiloServiceClient implements PortfolioService {

    PortfolioService delegate;

    public PortfoiloServiceClient( ) {
        this.delegate = new PortfolioServiceServer();
    }

    @Override
    public Object getPortfolio(String ticker) {
        // can add preprocessing
        Object response =  delegate.getPortfolio(ticker);
        // can add post processing
        return response;
    }
}
