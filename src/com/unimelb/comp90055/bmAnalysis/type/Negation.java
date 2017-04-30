

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Apr 30 12:29:00 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMBasicType.xml
 * @generated */
public class Negation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Negation.class);
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
  protected Negation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Negation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Negation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Negation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: negType

  /** getter for negType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNegType() {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_negType == null)
      jcasType.jcas.throwFeatMissing("negType", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Negation_Type)jcasType).casFeatCode_negType);}
    
  /** setter for negType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegType(String v) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_negType == null)
      jcasType.jcas.throwFeatMissing("negType", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Negation_Type)jcasType).casFeatCode_negType, v);}    
   
    
  //*--------------*
  //* Feature: negTrigger

  /** getter for negTrigger - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNegTrigger() {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_negTrigger == null)
      jcasType.jcas.throwFeatMissing("negTrigger", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Negation_Type)jcasType).casFeatCode_negTrigger);}
    
  /** setter for negTrigger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegTrigger(String v) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_negTrigger == null)
      jcasType.jcas.throwFeatMissing("negTrigger", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Negation_Type)jcasType).casFeatCode_negTrigger, v);}    
   
    
  //*--------------*
  //* Feature: ntSpans

  /** getter for ntSpans - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getNtSpans() {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ntSpans == null)
      jcasType.jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ntSpans)));}
    
  /** setter for ntSpans - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNtSpans(FSArray v) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ntSpans == null)
      jcasType.jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ntSpans, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ntSpans - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Span getNtSpans(int i) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ntSpans == null)
      jcasType.jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ntSpans), i);
    return (Span)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ntSpans), i)));}

  /** indexed setter for ntSpans - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNtSpans(int i, Span v) { 
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ntSpans == null)
      jcasType.jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ntSpans), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ntSpans), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: cuiConcepts

  /** getter for cuiConcepts - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getCuiConcepts() {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_cuiConcepts == null)
      jcasType.jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_cuiConcepts)));}
    
  /** setter for cuiConcepts - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCuiConcepts(FSArray v) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_cuiConcepts == null)
      jcasType.jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Negation_Type)jcasType).casFeatCode_cuiConcepts, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for cuiConcepts - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public CuiConcept getCuiConcepts(int i) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_cuiConcepts == null)
      jcasType.jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_cuiConcepts), i);
    return (CuiConcept)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_cuiConcepts), i)));}

  /** indexed setter for cuiConcepts - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCuiConcepts(int i, CuiConcept v) { 
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_cuiConcepts == null)
      jcasType.jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_cuiConcepts), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_cuiConcepts), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: ncSpans

  /** getter for ncSpans - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getNcSpans() {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ncSpans == null)
      jcasType.jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ncSpans)));}
    
  /** setter for ncSpans - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNcSpans(FSArray v) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ncSpans == null)
      jcasType.jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ncSpans, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ncSpans - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Span getNcSpans(int i) {
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ncSpans == null)
      jcasType.jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ncSpans), i);
    return (Span)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ncSpans), i)));}

  /** indexed setter for ncSpans - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNcSpans(int i, Span v) { 
    if (Negation_Type.featOkTst && ((Negation_Type)jcasType).casFeat_ncSpans == null)
      jcasType.jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ncSpans), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Negation_Type)jcasType).casFeatCode_ncSpans), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    