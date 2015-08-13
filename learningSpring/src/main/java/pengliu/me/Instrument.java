package pengliu.me;

public abstract  class Instrument
{
    private String type;
    public Instrument(String type)
    {
        this.type = type;
    }

    public abstract void perform();
}
