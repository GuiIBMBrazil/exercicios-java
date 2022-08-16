public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    @Override
    public Double payment() {
        double valor = super.payment();
        valor += additionalCharge*1.10;
        return  valor;
    }
}
