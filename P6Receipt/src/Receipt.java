
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
       private ProductDB pdb = new ProductDB();
       public Receipt(BigDecimal pricePerUnit,int numUnits) {
         this.numUnits = numUnits;
         this.pricePerUnit = pricePerUnit;
       }
       public Receipt(IProductDB pdb){
          this.pdb = createDB();
       }
      IProductDB createDB(){
          return new ProductDB();
    }
}
