

import java.util.Scanner;
public class Bancotarefa {
    
    public String Banco;
    public int numdaconta;
    public String dono;
    protected boolean tipoconta;
    public double valor;
    public double valordepositado;
    public String resp;
    public double total;
    Scanner teclado = new Scanner(System.in);
    

    public void status(){
        System.out.println("Banco : " + this.Banco);
        System.out.println("N° da conta : "+ this.numdaconta);
        System.out.println("Portador da conta : " + this.dono);
        System.out.println("O quanto voce tem em sua conta : "+ "$"+this.valor + " reais.");
        System.out.println("QUer depositar algum dinheiro ? [S/N]");
        resp = teclado.next();
        if (resp.equals("S")){

            System.out.println("Quanto voce quer depositar ?");
            valordepositado = teclado.nextDouble();
            double total = valor+valordepositado;
            System.out.println("Seu valor agora é " + total);
            }
      
    }

    public static void main(String args[]){
        Bancotarefa c1 = new Bancotarefa();
        
        c1.Banco = "Banco do brasil";
        c1.numdaconta= 334423;
        c1.dono = "jorel martins deczuta";
        c1.valor = 343.00;
        c1.total();
        c1.corrente();
        c1.status();
        c1.banco2();
        
}

public void total(){
    
}


public void banco2(){
    if (this.tipoconta == true){
        System.out.println("Sua conta é corrente");
    }
    else {
        System.out.println("Sua conta e poupanca");
    }
}
    
    protected void corrente(){
        this.tipoconta = true;
        }
        
    protected void poupanca(){
        this.tipoconta = false;
        }

    protected void Sim(){
        
    }

    protected void Nao(){
        
    }

}

