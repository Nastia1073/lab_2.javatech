package pro.java.tech;

import org.apache.log4j.Logger;

/**
 * Created by nastu on 3/16/2017.
 */
public class BooleanOperations {
    Boolean operand1;
    Boolean operand2;

    static final Logger logger = Logger.getLogger(BooleanOperations.class);

    public BooleanOperations(Boolean operand1, Boolean operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public BooleanOperations() {
    }

    public Boolean isOperand1() {
        return operand1;
    }

    public void setOperand1(Boolean operand1) {
        this.operand1 = operand1;
    }

    public Boolean isOperand2() {
        return operand2;
    }

    public void setOperand2(Boolean operand2) {
        this.operand2 = operand2;
    }



    public Boolean conjunction(Boolean operand1, Boolean operand2) {
        logger.info("conjunction operation " + " " + operand1+ " " + operand2);

        try {
            if (operand1 == true && operand2 == true) {
                logger.info("result is true");
                return true;

            } else { logger.info("result is FALSE");
                return false;}
        }
        catch (NullPointerException exp){
            logger.info("result is null");
            return null;
        }

    }

    public Boolean disjunction(Boolean operand1, Boolean operand2) {
        if (operand1 == false && operand2 == false) {
            return false;
        } else return true;
    }

    public Boolean complementOperand1(Boolean operand1, Boolean operand2) {
        if (operand1 == false) {
            return true;
        } else return false;
    }

    public Boolean complementOperand2(Boolean operand1, Boolean operand2) {
        if (operand2 == false) {
            return true;
        }else return  false;
    }
    public Boolean const0 (Boolean operand1, Boolean operand2) {
        return false;
    }
    public Boolean const1 (Boolean operand1, Boolean operand2) {
        return true;
    }
    public Boolean sheffer(Boolean operand1, Boolean operand2) {
        if (operand1 == true && operand2 == true ) {
            return false;
        }else return  true;
    }
    public Boolean implication(Boolean operand1, Boolean operand2) {//x1->x2
        if (operand1 == true && operand2 == false ) {
            return false;
        }else return  true;
    }
    public Boolean inversionOperand1(Boolean operand1, Boolean operand2) {
        //boolean result = false;
        if ((operand1 == false && operand2 == false) || (operand1 == false && operand2 == true)) {
                return true;
            }else return false;
        }
        public Boolean 	identicalOfOperand1(Boolean operand1, Boolean operand2) {
        //boolean result = false;
        if ((operand1 == false && operand2 == false) || (operand1 == false && operand2 == true)) {
                return false;
            }else return true;
        }
    public Boolean implication2(Boolean operand1, Boolean operand2) {//x2->x1
        if (operand1 == false && operand2 == true ) {
            return false;
        }else return  true;
    }
    public Boolean 	identicalOfOperand2(Boolean operand1, Boolean operand2) {
        //boolean result = false;
        if ((operand1 == false && operand2 == true) || (operand1 == true && operand2 == true)) {
            return false;
        }else return true;
    }
    public Boolean 	biconditional(Boolean operand1, Boolean operand2) {
        if ((operand1 == false && operand2 == false) || (operand1 == true && operand2 == true)) {
            return true;
        }else return false;
    }
    public Boolean 	pirs(Boolean operand1, Boolean operand2) {
        if (operand1 == false && operand2 == false){
            return true;
        }else return false;
    }
    public Boolean 	xor(Boolean operand1, Boolean operand2) {
        if ((operand1 == false && operand2 == false) || (operand1 == true && operand2 == true)) {
            return false;
        }else return true;
    }
    public Boolean 	identicalimplication1(Boolean operand1, Boolean operand2) {
        if (operand1 == false && operand2 == true){
            return true;
        }else return false;
    }
    public Boolean 	identicalimplication2(Boolean operand1, Boolean operand2) {
        if (operand1 == true && operand2 == false){
            return true;
        }else return false;
    }



}



