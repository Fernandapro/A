/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */

public class TDAEJERCICIO1 {
    private double radio;
    
    public TDAEJERCICIO1(double radio) {
        if (radio>0){
            this.radio=radio;
        }else{
            this.radio=0.0;
        }
    }
    
    public double getRadio(){
        return this.radio;
    }
    public double getDiametro(){
        return (radio*2);
    }
    public double getCircunferencia(){
        return (Math.PI*getDiametro());
    }
    public double getVolumen(){
        return (4*Math.PI*Math.pow(radio, 3))/3;
    }
    public double getArea(){
        return (4*Math.PI*radio*radio);
    }
}