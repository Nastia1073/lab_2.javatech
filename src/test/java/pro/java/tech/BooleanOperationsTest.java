package pro.java.tech;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nastu on 3/16/2017.
 */
public class BooleanOperationsTest {
    BooleanOperations booleanOperations = new BooleanOperations();
    @Test
    public void conjunctionTrueTrue() throws Exception {
     boolean result = booleanOperations.conjunction(true, true );
        Assert.assertEquals(true, result);
    }
    @Test
    public void conjunctionTrueFalse() throws Exception {
     boolean result = booleanOperations.conjunction(true, false );
        Assert.assertEquals(false, result);
    }
    @Test
    public void conjunctionFalseTrue() throws Exception {
     boolean result = booleanOperations.conjunction(false, true );
        Assert.assertEquals(false, result);
    }
    @Test
    public void conjunctionFalseFalse() throws Exception {
        boolean result = booleanOperations.conjunction(false, false );
        Assert.assertEquals(false, result);
    }
    @Test
    public void disjunctionFalseFalse() throws Exception {
        boolean result = booleanOperations.disjunction(false, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void disjunctionTrueFalse() throws Exception {
        boolean result = booleanOperations.disjunction(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void disjunctionFalseTrue() throws Exception {
        boolean result = booleanOperations.disjunction(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void disjunctionTrueTrue() throws Exception {
        boolean result = booleanOperations.disjunction(true, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void complementOperand1TrueTrue() throws Exception {
        boolean result = booleanOperations.complementOperand1(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void complementOperand1TrueFalse() throws Exception {
        boolean result = booleanOperations.complementOperand1(true, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void complementOperand1FalseTrue() throws Exception {
        boolean result = booleanOperations.complementOperand1(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void complementOperand1FalseFalse() throws Exception {
        boolean result = booleanOperations.complementOperand1(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void complementOperand2TrueTrue() throws Exception {
        boolean result = booleanOperations.complementOperand2(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void complementOperand2TrueFalse() throws Exception {
        boolean result = booleanOperations.complementOperand2(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void complementOperand2FalseTrue() throws Exception {
        boolean result = booleanOperations.complementOperand2(false, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void complementOperand2FalseFalse() throws Exception {
        boolean result = booleanOperations.complementOperand2(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void const0TrueTrue() throws Exception {
        boolean result = booleanOperations.const0(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const0TrueFalse() throws Exception {
        boolean result = booleanOperations.const0(true, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const0FalseFalse() throws Exception {
        boolean result = booleanOperations.const0(false, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const0FalseTrue() throws Exception {
        boolean result = booleanOperations.const0(false, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const1TrueTrue() throws Exception {
        boolean result = booleanOperations.const1(true, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void const1TrueFalse() throws Exception {
        boolean result = booleanOperations.const1(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void const1FalseFalse() throws Exception {
        boolean result = booleanOperations.const1(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void const1FalseTrue() throws Exception {
        boolean result = booleanOperations.const1(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void shefferTrueTrue() throws Exception {
        boolean result = booleanOperations.sheffer(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void shefferTrueFalse() throws Exception {
        boolean result = booleanOperations.sheffer(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void shefferFalseFalse() throws Exception {
        boolean result = booleanOperations.sheffer(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void shefferFalseTrue() throws Exception {
        boolean result = booleanOperations.sheffer(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implicationTrueTrue() throws Exception {
        boolean result = booleanOperations.implication(true, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implicationTrueFalse() throws Exception {
        boolean result = booleanOperations.implication(true, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void implicationFalseFalse() throws Exception {
        boolean result = booleanOperations.implication(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implicationFalseTrue() throws Exception {
        boolean result = booleanOperations.implication(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void inversionOperand1TrueTrue() throws Exception {
        boolean result = booleanOperations.inversionOperand1(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void inversionOperand1TrueFalse() throws Exception {
        boolean result = booleanOperations.inversionOperand1(true, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void inversionOperand1FalseFalse() throws Exception {
        boolean result = booleanOperations.inversionOperand1(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void inversionOperand1FalseTrue() throws Exception {
        boolean result = booleanOperations.inversionOperand1(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalOfOperand1TrueTrue() throws Exception {
        boolean result = booleanOperations.identicalOfOperand1(true, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalOfOperand1TrueFalse() throws Exception {
        boolean result = booleanOperations.identicalOfOperand1(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalOfOperand1FalseFalse() throws Exception {
        boolean result = booleanOperations.identicalOfOperand1(false, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalOfOperand1FalseTrue() throws Exception {
        boolean result = booleanOperations.identicalOfOperand1(false, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void implication2TrueTrue() throws Exception {
        boolean result = booleanOperations.implication2(true, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implication2TrueFalse() throws Exception {
        boolean result = booleanOperations.implication2(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implication2FalseFalse() throws Exception {
        boolean result = booleanOperations.implication2(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implication2FalseTrue() throws Exception {
        boolean result = booleanOperations.implication2(false, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalOfOperand2TrueTrue() throws Exception {
        boolean result = booleanOperations.identicalOfOperand2(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalOfOperand2TrueFalse() throws Exception {
        boolean result = booleanOperations.identicalOfOperand2(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalOfOperand2FalseFalse() throws Exception {
        boolean result = booleanOperations.identicalOfOperand2(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalOfOperand2FalseTrue() throws Exception {
        boolean result = booleanOperations.identicalOfOperand2(false, true);
        Assert.assertEquals(false, result);
    }    @Test
    public void biconditionalTrueTrue() throws Exception {
        boolean result = booleanOperations.biconditional(true, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void biconditionalTrueFalse() throws Exception {
        boolean result = booleanOperations.biconditional(true, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void biconditionalFalseFalse() throws Exception {
        boolean result = booleanOperations.biconditional(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void biconditionalFalseTrue() throws Exception {
        boolean result = booleanOperations.biconditional(false, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void pirsFalseTrue() throws Exception {
        boolean result = booleanOperations.pirs(false, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void pirsTrueTrue() throws Exception {
        boolean result = booleanOperations.pirs(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void pirsTrueFalse() throws Exception {
        boolean result = booleanOperations.pirs(true, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void pirsFalseFalse() throws Exception {
        boolean result = booleanOperations.pirs(false, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void xor() throws Exception {
        boolean result = booleanOperations.xor(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void xorTrueTrue() throws Exception {
        boolean result = booleanOperations.xor(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void xorTrueFalse() throws Exception {
        boolean result = booleanOperations.xor(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void xorFalseFalse() throws Exception {
        boolean result = booleanOperations.xor(false, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalimplication1FalseTrue() throws Exception {
        boolean result = booleanOperations.identicalimplication1(false, true);
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalimplication1TrueTrue() throws Exception {
        boolean result = booleanOperations.identicalimplication1(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalimplication1TrueFalse() throws Exception {
        boolean result = booleanOperations.identicalimplication1(true, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalimplication1FalseFalse() throws Exception {
        boolean result = booleanOperations.identicalimplication1(false, false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalimplication2FalseTrue() throws Exception {
        boolean result = booleanOperations.identicalimplication2(false, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalimplication2TrueTrue() throws Exception {
        boolean result = booleanOperations.identicalimplication2(true, true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void identicalimplication2TrueFalse() throws Exception {
        boolean result = booleanOperations.identicalimplication2(true, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalimplication2FalseFalse() throws Exception {
        boolean result = booleanOperations.identicalimplication2(false, false);
        Assert.assertEquals(false, result);
    }


    @Test
    public void const0_null_null() throws Exception {
        Boolean result = booleanOperations.const0(null, null);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const0_null_false() throws Exception {
        Boolean result = booleanOperations.const0(null,false);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const0_null_true() throws Exception {
        Boolean result = booleanOperations.const0(null,true);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const0_false_null() throws Exception {
        Boolean result = booleanOperations.const0(false,null);
        Assert.assertEquals(false, result);
    }
    @Test
    public void const0_true_null() throws Exception {
        Boolean result = booleanOperations.const0(true,null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void conjunction_null_null() throws Exception {
        Boolean result = booleanOperations.conjunction(null, null);
        Assert.assertEquals(null, result);
    }
    @Test
    public void conjunction_null_false() throws Exception {
        Boolean result = booleanOperations.conjunction(null, false);
        Assert.assertEquals(null, result);
    }
    @Test
    public void f1_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication2(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f1_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication2(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f1_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication2(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f1_false_null() throws Exception {
        Boolean result = null;
        result = booleanOperations.identicalimplication2(false, null);
        Assert.assertEquals(false, result);
    }
    @Test
    public void f1_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication2(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f15_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.const1(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f15_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.const1(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f15_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.const1(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f15_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.const1(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f15_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.const1(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f14_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f14_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f14_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f14_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f14_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f13_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f13_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f13_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f13_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f12_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f12_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f12_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f12_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f12_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand1(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void f11_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication2(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f11_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication2(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f11_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication2(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f11_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication2(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void f11_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.implication2(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void identicalOfOperand2_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand2(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalOfOperand2_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand2(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalOfOperand2_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand2(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalOfOperand2_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalOfOperand2(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalimplication2_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication2(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void biconditional_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.biconditional(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void biconditional_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.biconditional(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void biconditional_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.biconditional(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void biconditional_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.biconditional(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void biconditional_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.biconditional(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void pirs_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.pirs(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(false, result);
    }
    @Test
    public void pirs_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.pirs(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void pirs_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.pirs(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void pirs_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.pirs(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void pirs_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.pirs(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void disjunction_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.disjunction(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void disjunction_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.disjunction(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void disjunction_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.disjunction(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void disjunction_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.disjunction(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void disjunction_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.disjunction(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void xor_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.xor(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void xor_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.xor(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void xor_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.xor(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void xor_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.xor(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void xor_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.xor(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void complementOperand2_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.complementOperand2(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void complementOperand2_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.complementOperand2(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void complementOperand2_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.complementOperand2(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }
    @Test
    public void complementOperand2_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.complementOperand2(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(false, result);
    }
    @Test
    public void complementOperand2_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.complementOperand2(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalimplication1_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication1(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalimplication1_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication1(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalimplication1_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication1(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalimplication1_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication1(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void identicalimplication1_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.identicalimplication1(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(false, result);
    }
    @Test
    public void sheffer_true_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.sheffer(true, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void sheffer_null_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.sheffer(null, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void sheffer_null_false() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.sheffer(null, false);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void sheffer_null_true() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.sheffer(null, true);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(null, result);
    }
    @Test
    public void sheffer_false_null() throws Exception {
        Boolean result = null;
        try {
            result = booleanOperations.sheffer(false, null);
        }
        catch (NullPointerException e){

        }
        Assert.assertEquals(true, result);
    }


}