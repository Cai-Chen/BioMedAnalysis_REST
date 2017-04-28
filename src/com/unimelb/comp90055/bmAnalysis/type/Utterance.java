

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
public class Utterance extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Utterance.class);
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
  protected Utterance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Utterance(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Utterance(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Utterance(JCas jcas, int begin, int end) {
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
  //* Feature: pmid

  /** getter for pmid - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPmid() {
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_pmid == null)
      jcasType.jcas.throwFeatMissing("pmid", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Utterance_Type)jcasType).casFeatCode_pmid);}
    
  /** setter for pmid - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPmid(String v) {
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_pmid == null)
      jcasType.jcas.throwFeatMissing("pmid", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    jcasType.ll_cas.ll_setStringValue(addr, ((Utterance_Type)jcasType).casFeatCode_pmid, v);}    
   
    
  //*--------------*
  //* Feature: phrases

  /** getter for phrases - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getPhrases() {
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_phrases == null)
      jcasType.jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Utterance_Type)jcasType).casFeatCode_phrases)));}
    
  /** setter for phrases - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhrases(FSArray v) {
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_phrases == null)
      jcasType.jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    jcasType.ll_cas.ll_setRefValue(addr, ((Utterance_Type)jcasType).casFeatCode_phrases, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for phrases - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Phrase getPhrases(int i) {
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_phrases == null)
      jcasType.jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Utterance_Type)jcasType).casFeatCode_phrases), i);
    return (Phrase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Utterance_Type)jcasType).casFeatCode_phrases), i)));}

  /** indexed setter for phrases - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setPhrases(int i, Phrase v) { 
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_phrases == null)
      jcasType.jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Utterance_Type)jcasType).casFeatCode_phrases), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Utterance_Type)jcasType).casFeatCode_phrases), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: location

  /** getter for location - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLocation() {
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Utterance_Type)jcasType).casFeatCode_location);}
    
  /** setter for location - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocation(String v) {
    if (Utterance_Type.featOkTst && ((Utterance_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    jcasType.ll_cas.ll_setStringValue(addr, ((Utterance_Type)jcasType).casFeatCode_location, v);}    
  }

    