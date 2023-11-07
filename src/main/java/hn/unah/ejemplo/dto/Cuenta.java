package hn.unah.ejemplo.dto;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {
    
    private int numero;

    private int codigoCliente;

    private int fechaApertura;

    private double saldo;    

    public void retirar(double monto){
        this.saldo -= monto;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    @Override
    public String toString(){
        return "Número cuenta: " + this.numero +
              "\n Código Cliente: " + this.codigoCliente +
              "\n Saldo: " + this.saldo;
    }

}
