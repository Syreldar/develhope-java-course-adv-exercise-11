public class Tester
{
    public static void main(String[] args)
    {
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 500.00);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 700.00);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 800.00);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 1000.00);

        Smartphone smartphone1 = new Smartphone("BrandA", "Model1", 5000, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("BrandB", "Model2", 6000, producerPrice2, retailPrice2);

        System.out.printf("Details of smartphone1: %s\n", smartphone1);
        System.out.printf("Details of smartphone2: %s\n", smartphone2);

        System.out.printf("Are smartphone1 and smartphone2 equal? %s\n", smartphone1.equals(smartphone2) ? "Yes" : "No");

        try
        {
            Smartphone clonedSmartphone = smartphone2.clone();

            System.out.printf("Details of cloned smartphone: %s\n", clonedSmartphone);
            System.out.printf("Is smartphone2 equal to the cloned smartphone? %s\n", smartphone2.equals(clonedSmartphone) ? "Yes" : "No");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            System.out.println("An error occurred while trying to clone the smartphone.");
        }
    }
}
