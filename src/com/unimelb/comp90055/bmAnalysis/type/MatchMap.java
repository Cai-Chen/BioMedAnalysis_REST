

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Apr 30 12:29:00 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMBasicType.xml
 * @generated */
public class MatchMap extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MatchMap.class);
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
  protected MatchMap() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MatchMap(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MatchMap(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MatchMap(JCas jcas, int begin, int end) {
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
  //* Feature: phraseMatchStart

  /** getter for phraseMatchStart - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPhraseMatchStart() {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_phraseMatchStart == null)
      jcasType.jcas.throwFeatMissing("phraseMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_phraseMatchStart);}
    
  /** setter for phraseMatchStart - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhraseMatchStart(int v) {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_phraseMatchStart == null)
      jcasType.jcas.throwFeatMissing("phraseMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    jcasType.ll_cas.ll_setIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_phraseMatchStart, v);}    
   
    
  //*--------------*
  //* Feature: phraseMatchEnd

  /** getter for phraseMatchEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPhraseMatchEnd() {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_phraseMatchEnd == null)
      jcasType.jcas.throwFeatMissing("phraseMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_phraseMatchEnd);}
    
  /** setter for phraseMatchEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhraseMatchEnd(int v) {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_phraseMatchEnd == null)
      jcasType.jcas.throwFeatMissing("phraseMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    jcasType.ll_cas.ll_setIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_phraseMatchEnd, v);}    
   
    
  //*--------------*
  //* Feature: conceptMatchStart

  /** getter for conceptMatchStart - gets 
   * @generated
   * @return value of the feature 
   */
  public int getConceptMatchStart() {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_conceptMatchStart == null)
      jcasType.jcas.throwFeatMissing("conceptMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_conceptMatchStart);}
    
  /** setter for conceptMatchStart - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConceptMatchStart(int v) {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_conceptMatchStart == null)
      jcasType.jcas.throwFeatMissing("conceptMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    jcasType.ll_cas.ll_setIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_conceptMatchStart, v);}    
   
    
  //*--------------*
  //* Feature: conceptMatchEnd

  /** getter for conceptMatchEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getConceptMatchEnd() {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_conceptMatchEnd == null)
      jcasType.jcas.throwFeatMissing("conceptMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_conceptMatchEnd);}
    
  /** setter for conceptMatchEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConceptMatchEnd(int v) {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_conceptMatchEnd == null)
      jcasType.jcas.throwFeatMissing("conceptMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    jcasType.ll_cas.ll_setIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_conceptMatchEnd, v);}    
   
    
  //*--------------*
  //* Feature: lexVariation

  /** getter for lexVariation - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLexVariation() {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_lexVariation == null)
      jcasType.jcas.throwFeatMissing("lexVariation", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_lexVariation);}
    
  /** setter for lexVariation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLexVariation(int v) {
    if (MatchMap_Type.featOkTst && ((MatchMap_Type)jcasType).casFeat_lexVariation == null)
      jcasType.jcas.throwFeatMissing("lexVariation", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    jcasType.ll_cas.ll_setIntValue(addr, ((MatchMap_Type)jcasType).casFeatCode_lexVariation, v);}    
  }

    