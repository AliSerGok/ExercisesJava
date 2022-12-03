public class HesapMakinası {

    public double number1;
    public double number2;
    public String operation;

    HesapMakinası(double number1,double number2,String operation){
        this.number1=number1;
        this.number2=number2;
        this.operation=operation;

    }


    public double addition(){
        return this.number1+this.number2;
    }

    public double minus(){
        return this.number1-this.number2;
    }

    public double multiply(){
        return this.number1*this.number2;
    }

    public double divition(){
        return this.number1/this.number2;
    }

    public double square(){
        return Math.pow(this.number1,this.number2);
    }







}
