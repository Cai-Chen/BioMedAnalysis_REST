

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Retrieve atoms from Metathesaurus of UMLS according to cui
 * Updated by JCasGen Sun Apr 30 12:34:28 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMAnalysisEngineDescriptor.xml
 * @generated */
public class Atom extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Atom.class);
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
  protected Atom() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Atom(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Atom(JCas jcas) {
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
  //* Feature: aui

  /** getter for aui - gets AUI
   * @generated
   * @return value of the feature 
   */
  public String getAui() {
    if (Atom_Type.featOkTst && ((Atom_Type)jcasType).casFeat_aui == null)
      jcasType.jcas.throwFeatMissing("aui", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Atom_Type)jcasType).casFeatCode_aui);}
    
  /** setter for aui - sets AUI 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAui(String v) {
    if (Atom_Type.featOkTst && ((Atom_Type)jcasType).casFeat_aui == null)
      jcasType.jcas.throwFeatMissing("aui", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    jcasType.ll_cas.ll_setStringValue(addr, ((Atom_Type)jcasType).casFeatCode_aui, v);}    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets Name
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (Atom_Type.featOkTst && ((Atom_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Atom_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets Name 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Atom_Type.featOkTst && ((Atom_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    jcasType.ll_cas.ll_setStringValue(addr, ((Atom_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: language

  /** getter for language - gets Source Language
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() {
    if (Atom_Type.featOkTst && ((Atom_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Atom_Type)jcasType).casFeatCode_language);}
    
  /** setter for language - sets Source Language 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    if (Atom_Type.featOkTst && ((Atom_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    jcasType.ll_cas.ll_setStringValue(addr, ((Atom_Type)jcasType).casFeatCode_language, v);}    
  }

    