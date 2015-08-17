package pengliu.me;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by peng on 8/17/15.
 */
@Qualifier("stringed")
public class Guitar extends Instrument
{
    public Guitar()
    {
        super("guitar");
    }

    @Override
    public void perform()
    {
        System.out.println("Perform a guitar");
    }
}
