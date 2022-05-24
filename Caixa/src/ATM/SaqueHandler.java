package ATM;

import java.util.List;

public interface SaqueHandler {

    public void setNextHandler(SaqueHandler handler);

    public void processHander(List lista, int valor);
}
