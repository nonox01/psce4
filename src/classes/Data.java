package classes;

import java.time.Year;

public class Data {
    public int dia;
    public int mes;
    public int ano;

public Data(int dia, int mes, int ano) {

        if(mes>0&&mes<=12){
            if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                if(dia>0&&dia<=31){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                } else {
                    System.out.println("Data inválida!");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            } else if(mes==4||mes==6||mes==9||mes==11){
                if(dia>0&&dia<=30){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                } else {
                    System.out.println("Data inválida!");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            } else if(mes==2){
                if(Year.isLeap(ano)){
                    if(dia>0&&dia<=29){
                        this.dia = dia;
                        this.mes = mes;
                        this.ano = ano;
                    } else {
                        System.out.println("Data inválida!");
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }

                } else if(Year.isLeap(ano)==false){
                    if(dia>0&&dia<=28){
                        this.dia = dia;
                        this.mes = mes;
                        this.ano = ano;
                    } else {
                        System.out.println("Data inválida!");
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }
                }
            } else {
                System.out.println("Data inválida!");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            }
        } else {
            System.out.println("Data inválida!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

   
    public String toString() {
        return dia + "/" + mes + "/" + ano;

    }

    public boolean verificaAnoBissexto(){
        if(ano % 400 == 0){
            return true;
        } else if(ano % 4 == 0&&ano % 100 != 0){
            return true;
        } else{
           return false;
        }
    }


}
    
