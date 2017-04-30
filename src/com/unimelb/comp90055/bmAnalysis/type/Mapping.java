

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** A meta mapping.
 * Updated by JCasGen Sun Apr 30 12:29:00 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMBasicType.xml
 * @generated */
public class Mapping extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Mapping.class);
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
  protected Mapping() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Mapping(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Mapping(JCas jcas) {
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
  //* Feature: score

  /** getter for score - gets The score of this mapping.
   * @generated
   * @return value of the feature 
   */
  public int getScore() {
    if (Mapping_Type.featOkTst && ((Mapping_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Mapping_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score of this mapping. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(int v) {
    if (Mapping_Type.featOkTst && ((Mapping_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    jcasType.ll_cas.ll_setIntValue(addr, ((Mapping_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: candidates

  /** getter for candidates - gets An array of elements of this mapping.
   * @generated
   * @return value of the feature 
   */
  public FSArray getCandidates() {
    if (Mapping_Type.featOkTst && ((Mapping_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Mapping_Type)jcasType).casFeatCode_candidates)));}
    
  /** setter for candidates - sets An array of elements of this mapping. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCandidates(FSArray v) {
    if (Mapping_Type.featOkTst && ((Mapping_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    jcasType.ll_cas.ll_setRefValue(addr, ((Mapping_Type)jcasType).casFeatCode_candidates, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for candidates - gets an indexed value - An array of elements of this mapping.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Candidate getCandidates(int i) {
    if (Mapping_Type.featOkTst && ((Mapping_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Mapping_Type)jcasType).casFeatCode_candidates), i);
    return (Candidate)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Mapping_Type)jcasType).casFeatCode_candidates), i)));}

  /** indexed setter for candidates - sets an indexed value - An array of elements of this mapping.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCandidates(int i, Candidate v) { 
    if (Mapping_Type.featOkTst && ((Mapping_Type)jcasType).casFeat_candidates == null)
      jcasType.jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Mapping_Type)jcasType).casFeatCode_candidates), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Mapping_Type)jcasType).casFeatCode_candidates), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    