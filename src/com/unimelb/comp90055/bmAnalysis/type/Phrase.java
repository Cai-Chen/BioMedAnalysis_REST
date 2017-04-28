

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Apr 25 21:29:32 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMAnalysisEngineDescriptor.xml
 * @generated */
public class Phrase extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Phrase.class);
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
  protected Phrase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Phrase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Phrase(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Phrase(JCas jcas, int begin, int end) {
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
  //* Feature: candidates

  /** getter for candidates - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getCandidates() {
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_candidates)));}
    
  /** setter for candidates - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCandidates(FSArray v) {
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    jcasType.ll_cas.ll_setRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_candidates, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for candidates - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Candidate getCandidates(int i) {
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_candidates), i);
    return (Candidate)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_candidates), i)));}

  /** indexed setter for candidates - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCandidates(int i, Candidate v) { 
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_candidates), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_candidates), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: mappings

  /** getter for mappings - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMappings() {
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_mappings == null)
      jcasType.jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_mappings)));}
    
  /** setter for mappings - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMappings(FSArray v) {
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_mappings == null)
      jcasType.jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    jcasType.ll_cas.ll_setRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_mappings, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for mappings - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Mapping getMappings(int i) {
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_mappings == null)
      jcasType.jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_mappings), i);
    return (Mapping)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_mappings), i)));}

  /** indexed setter for mappings - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMappings(int i, Mapping v) { 
    if (Phrase_Type.featOkTst && ((Phrase_Type)jcasType).casFeat_mappings == null)
      jcasType.jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_mappings), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Phrase_Type)jcasType).casFeatCode_mappings), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    