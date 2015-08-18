package pengliu.me;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Actor
{
    Instrument instrument;

//    @Autowired
//    public Actor(Instrument instrument)
//    {
//        this.instrument = instrument;
//    }

    public void Perform()
    {
        this.instrument.perform();
    }

    @Autowired
    @StringedInstrument
    public void setInstrument(Instrument instrument)
    {
        this.instrument = instrument;
    }
}
