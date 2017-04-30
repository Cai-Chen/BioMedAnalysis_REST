

/* First created by JCasGen Sun Apr 23 23:08:14 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Apr 30 12:28:59 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMBasicType.xml
 * @generated */
public class Document extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Document.class);
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
  protected Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Document(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Document(JCas jcas, int begin, int end) {
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
  //* Feature: acronymAbbrevs

  /** getter for acronymAbbrevs - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getAcronymAbbrevs() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_acronymAbbrevs == null)
      jcasType.jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_acronymAbbrevs)));}
    
  /** setter for acronymAbbrevs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAcronymAbbrevs(FSArray v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_acronymAbbrevs == null)
      jcasType.jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.ll_cas.ll_setRefValue(addr, ((Document_Type)jcasType).casFeatCode_acronymAbbrevs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for acronymAbbrevs - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AcronymAbbrev getAcronymAbbrevs(int i) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_acronymAbbrevs == null)
      jcasType.jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_acronymAbbrevs), i);
    return (AcronymAbbrev)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_acronymAbbrevs), i)));}

  /** indexed setter for acronymAbbrevs - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAcronymAbbrevs(int i, AcronymAbbrev v) { 
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_acronymAbbrevs == null)
      jcasType.jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_acronymAbbrevs), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_acronymAbbrevs), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: negations

  /** getter for negations - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getNegations() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_negations == null)
      jcasType.jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_negations)));}
    
  /** setter for negations - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegations(FSArray v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_negations == null)
      jcasType.jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.ll_cas.ll_setRefValue(addr, ((Document_Type)jcasType).casFeatCode_negations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for negations - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Negation getNegations(int i) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_negations == null)
      jcasType.jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_negations), i);
    return (Negation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_negations), i)));}

  /** indexed setter for negations - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNegations(int i, Negation v) { 
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_negations == null)
      jcasType.jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_negations), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_negations), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: utterances

  /** getter for utterances - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getUtterances() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_utterances == null)
      jcasType.jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_utterances)));}
    
  /** setter for utterances - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUtterances(FSArray v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_utterances == null)
      jcasType.jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.ll_cas.ll_setRefValue(addr, ((Document_Type)jcasType).casFeatCode_utterances, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for utterances - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Utterance getUtterances(int i) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_utterances == null)
      jcasType.jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_utterances), i);
    return (Utterance)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_utterances), i)));}

  /** indexed setter for utterances - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setUtterances(int i, Utterance v) { 
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_utterances == null)
      jcasType.jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_utterances), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_utterances), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    