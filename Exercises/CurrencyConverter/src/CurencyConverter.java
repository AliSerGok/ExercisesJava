public class CurencyConverter {
    public double money1;

    CurencyConverter(double money1){
        this.money1=money1;


    }

    public double dolarToLira(){
        return this.money1 * 18.62;
    }

    public double liraToDolar(){
        return this.money1/18.62;
    }

    public double euroToLira(){
        return this.money1*19.31;

    }

    public double liraToEuro(){
        return this.money1/19.31;
    }

    public double dolarToEuro(){
        return  this.money1/1.04;
    }

    public double euroToDolar(){
        return  this.money1*1.04;
    }

    public double same(){
        return this.money1;
    }

}
