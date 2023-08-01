import java.util.Objects;

public class Smartphone implements Cloneable
{
    private final String brandName;
    private final String modelName;
    private final int batteryMah;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brand, String modelName, int batteryMah, SmartphonePrice producerPrice, SmartphonePrice retailPrice)
    {
        this.brandName = brand;
        this.modelName = modelName;
        this.batteryMah = batteryMah;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException
    {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();
        return clonedSmartphone;
    }

    @Override
    public String toString()
    {
        return String.format("Brand: %s, Model: %s, Battery: %d mAh, Producer Price: %s, Retail Price: %s", brandName, modelName, batteryMah, producerPrice.getPriceInEuros(), retailPrice.getPriceInEuros());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Smartphone that = (Smartphone) obj;
        return batteryMah == that.batteryMah &&
                brandName.equals(that.brandName) &&
                modelName.equals(that.modelName) &&
                producerPrice.equals(that.producerPrice) &&
                retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(brandName, modelName, batteryMah, producerPrice, retailPrice);
    }
}