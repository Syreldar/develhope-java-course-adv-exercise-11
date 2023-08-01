import java.util.Objects;

public class SmartphonePrice implements Cloneable
{
    private final String priceType;
    private final double priceInEuros;

    public SmartphonePrice(String type, double price)
    {
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException
    {
        return (SmartphonePrice) super.clone();
    }

    @Override
    public String toString()
    {
        return String.format("Price Type: %s, Price in Euros: %.2f", priceType, priceInEuros);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        SmartphonePrice that = (SmartphonePrice) obj;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && priceType.equals(that.priceType);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(priceType, priceInEuros);
    }

    public double getPriceInEuros()
    {
        return priceInEuros;
    }
}
