package pengliu.me;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by peng on 8/13/15.
 */
public class Saxphone extends Instrument
{
    public Saxphone()
    {
        super("saxphone");
    }

    @Override
    public void perform()
    {
        System.out.println("Perform a saxphone");
    }
}
