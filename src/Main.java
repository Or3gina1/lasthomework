import java.time.LocalDate;

abstract class MilkProdukt{
    public int  currentDate;
    protected String nazvanie;
    protected int Fatness;
    protected int ves;
    public abstract LocalDate srokgodnosti();
    public abstract LocalDate dataizgotovleniay();
}
class Moloko extends MilkProdukt {
    String liquid;
    public LocalDate srokgodnosti(){
        System.out.println("Срок годности молока составляет: 7 дней");
        return dataizgotovleniay().plusDays(7);
    }
    @Override
    public LocalDate dataizgotovleniay() {
        LocalDate dataizgotovleniay = LocalDate.now();

        return dataizgotovleniay;
    }
}
class tvorog extends MilkProdukt {
    String crumbly;
    public LocalDate srokgodnosti() {
        System.out.println("Срок годности тврога составляет: 14 дней");
        return dataizgotovleniay().plusDays(14);
    }
    @Override
    public LocalDate dataizgotovleniay() {
        LocalDate dataizgotovleniay = LocalDate.now();
        return dataizgotovleniay;
    }

    public static void main(String[] args) {
        tvorog tvorog = new tvorog();
        System.out.println("Cрок годности творога до: " +tvorog.srokgodnosti());
        Moloko moloko = new Moloko();
        System.out.println("Cрок годности молока до: "+moloko.srokgodnosti());

    }
}
