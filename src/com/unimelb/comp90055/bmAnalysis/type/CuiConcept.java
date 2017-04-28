

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Tue Apr 25 21:29:32 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMAnalysisEngineDescriptor.xml
 * @generated */
public class CuiConcept extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CuiConcept.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected CuiConcept() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CuiConcept(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CuiConcept(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: negExCui

  /** getter for negExCui - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNegExCui() {
    if (CuiConcept_Type.featOkTst && ((CuiConcept_Type)jcasType).casFeat_negExCui == null)
      jcasType.jcas.throwFeatMissing("negExCui", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CuiConcept_Type)jcasType).casFeatCode_negExCui);}
    
  /** setter for negExCui - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegExCui(String v) {
    if (CuiConcept_Type.featOkTst && ((CuiConcept_Type)jcasType).casFeat_negExCui == null)
      jcasType.jcas.throwFeatMissing("negExCui", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((CuiConcept_Type)jcasType).casFeatCode_negExCui, v);}    
   
    
  //*--------------*
  //* Feature: negExConcept

  /** getter for negExConcept - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNegExConcept() {
    if (CuiConcept_Type.featOkTst && ((CuiConcept_Type)jcasType).casFeat_negExConcept == null)
      jcasType.jcas.throwFeatMissing("negExConcept", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CuiConcept_Type)jcasType).casFeatCode_negExConcept);}
    
  /** setter for negExConcept - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegExConcept(String v) {
    if (CuiConcept_Type.featOkTst && ((CuiConcept_Type)jcasType).casFeat_negExConcept == null)
      jcasType.jcas.throwFeatMissing("negExConcept", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((CuiConcept_Type)jcasType).casFeatCode_negExConcept, v);}    
  }

    