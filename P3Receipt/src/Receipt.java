
import java.math.BigDecimal;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtv1
 */
public class Receipt {
       
       BigDecimal pricePerUnit;
       int numUnits;
       public Receipt(BigDecimal pricePerUnit,int numUnits) {
         this.numUnits = numUnits;
         this.pricePerUnit = pricePerUnit;
       }             
       public void addLine(BigDecimal pricePerUnit,int numUnits)throws IsClosed{
       }
       public void addTaxes(BigDecimal percent)throws IsClosed{
       }
       public BigDecimal total(){
           BigDecimal bd = new BigDecimal(1.0);
           return bd;
       }
}
