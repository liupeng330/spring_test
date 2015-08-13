package pengliu.me;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor
{
    Instrument instrument;

    @Autowired
    public Actor(Instrument instrument)
    {
        this.instrument = instrument;
    }

    public void Perfom()
    {
        this.instrument.perform();
    }
}
