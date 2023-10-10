package trabalho.DTO;

import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */

public class estoqueDTO {
    private int estID;
    private int estQTD;
    private double estValorTotal;

    public int getEstID() {
        return estID;
    }

    public void setEstID(int estID) {
        this.estID = estID;
    }

    public int getEstQTD() {
        return estQTD;
    }

    public void setEstQTD(int estQTD) {
        this.estQTD = estQTD;
    }

    public double getEstValorTotal() {
        return estValorTotal;
    }

    public void setEstValorTotal(double estValorTotal) {
        this.estValorTotal = estValorTotal;
    }

    public void setEstQTD(String valorString) {
        try {
           this.estQTD = Integer.parseInt(valorString);
        } catch (NumberFormatException ex) {
            throw new UnsupportedOperationException("Formato invalido, por favor insira um numero inteiro");
        }
    }
    
    public void setEstValorTotal(String valorString) {
        try {
            this.estValorTotal = Double.parseDouble(valorString);
        } catch (NumberFormatException ex) {
            throw new UnsupportedOperationException("Formato invalido, por favor insira um numero inteiro");
        }
    }
}