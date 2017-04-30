

/* First created by JCasGen Sun Apr 23 23:08:14 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.IntegerArray;


/** 
 * Updated by JCasGen Sun Apr 30 12:28:59 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMBasicType.xml
 * @generated */
public class AcronymAbbrev extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AcronymAbbrev.class);
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
  protected AcronymAbbrev() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AcronymAbbrev(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AcronymAbbrev(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AcronymAbbrev(JCas jcas, int begin, int end) {
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
  //* Feature: acronym

  /** getter for acronym - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAcronym() {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_acronym == null)
      jcasType.jcas.throwFeatMissing("acronym", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_acronym);}
    
  /** setter for acronym - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAcronym(String v) {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_acronym == null)
      jcasType.jcas.throwFeatMissing("acronym", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.ll_cas.ll_setStringValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_acronym, v);}    
   
    
  //*--------------*
  //* Feature: expansion

  /** getter for expansion - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExpansion() {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_expansion == null)
      jcasType.jcas.throwFeatMissing("expansion", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_expansion);}
    
  /** setter for expansion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExpansion(String v) {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_expansion == null)
      jcasType.jcas.throwFeatMissing("expansion", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.ll_cas.ll_setStringValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_expansion, v);}    
   
    
  //*--------------*
  //* Feature: countList

  /** getter for countList - gets 
   * @generated
   * @return value of the feature 
   */
  public IntegerArray getCountList() {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_countList == null)
      jcasType.jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_countList)));}
    
  /** setter for countList - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountList(IntegerArray v) {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_countList == null)
      jcasType.jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.ll_cas.ll_setRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_countList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for countList - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public int getCountList(int i) {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_countList == null)
      jcasType.jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_countList), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_countList), i);}

  /** indexed setter for countList - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCountList(int i, int v) { 
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_countList == null)
      jcasType.jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_countList), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_countList), i, v);}
   
    
  //*--------------*
  //* Feature: cuiList

  /** getter for cuiList - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getCuiList() {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_cuiList == null)
      jcasType.jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_cuiList)));}
    
  /** setter for cuiList - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCuiList(StringArray v) {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_cuiList == null)
      jcasType.jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.ll_cas.ll_setRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_cuiList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for cuiList - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getCuiList(int i) {
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_cuiList == null)
      jcasType.jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_cuiList), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_cuiList), i);}

  /** indexed setter for cuiList - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCuiList(int i, String v) { 
    if (AcronymAbbrev_Type.featOkTst && ((AcronymAbbrev_Type)jcasType).casFeat_cuiList == null)
      jcasType.jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_cuiList), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AcronymAbbrev_Type)jcasType).casFeatCode_cuiList), i, v);}
  }

    