import GUI.Observer;

import java.util.ArrayList;


public interface Subject {

    public void attach(Observer a);

    public void detach(Observer b);

    public void notify2();

}
