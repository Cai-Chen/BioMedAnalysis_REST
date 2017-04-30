

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** The meta elements found in the text. Those are then used as candidates and mappings.
 * Updated by JCasGen Sun Apr 30 12:34:28 AEST 2017
 * XML source: C:/Users/Administrator/workspace/BioMedAnalysis_REST/desc/BMAnalysisEngineDescriptor.xml
 * @generated */
public class Candidate extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Candidate.class);
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
  protected Candidate() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Candidate(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Candidate(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Candidate(JCas jcas, int begin, int end) {
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
  //* Feature: spans

  /** getter for spans - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getSpans() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_spans == null)
      jcasType.jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_spans)));}
    
  /** setter for spans - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpans(FSArray v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_spans == null)
      jcasType.jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_spans, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for spans - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Span getSpans(int i) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_spans == null)
      jcasType.jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_spans), i);
    return (Span)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_spans), i)));}

  /** indexed setter for spans - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSpans(int i, Span v) { 
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_spans == null)
      jcasType.jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_spans), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_spans), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: cui

  /** getter for cui - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCui() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_cui == null)
      jcasType.jcas.throwFeatMissing("cui", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Candidate_Type)jcasType).casFeatCode_cui);}
    
  /** setter for cui - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCui(String v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_cui == null)
      jcasType.jcas.throwFeatMissing("cui", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setStringValue(addr, ((Candidate_Type)jcasType).casFeatCode_cui, v);}    
   
    
  //*--------------*
  //* Feature: concept

  /** getter for concept - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConcept() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_concept == null)
      jcasType.jcas.throwFeatMissing("concept", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Candidate_Type)jcasType).casFeatCode_concept);}
    
  /** setter for concept - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConcept(String v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_concept == null)
      jcasType.jcas.throwFeatMissing("concept", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setStringValue(addr, ((Candidate_Type)jcasType).casFeatCode_concept, v);}    
   
    
  //*--------------*
  //* Feature: sources

  /** getter for sources - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getSources() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_sources == null)
      jcasType.jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_sources)));}
    
  /** setter for sources - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSources(StringArray v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_sources == null)
      jcasType.jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_sources, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sources - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getSources(int i) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_sources == null)
      jcasType.jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_sources), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_sources), i);}

  /** indexed setter for sources - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSources(int i, String v) { 
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_sources == null)
      jcasType.jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_sources), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_sources), i, v);}
   
    
  //*--------------*
  //* Feature: semanticTypes

  /** getter for semanticTypes - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getSemanticTypes() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_semanticTypes == null)
      jcasType.jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_semanticTypes)));}
    
  /** setter for semanticTypes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSemanticTypes(StringArray v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_semanticTypes == null)
      jcasType.jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_semanticTypes, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for semanticTypes - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getSemanticTypes(int i) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_semanticTypes == null)
      jcasType.jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_semanticTypes), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_semanticTypes), i);}

  /** indexed setter for semanticTypes - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSemanticTypes(int i, String v) { 
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_semanticTypes == null)
      jcasType.jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_semanticTypes), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_semanticTypes), i, v);}
   
    
  //*--------------*
  //* Feature: atoms

  /** getter for atoms - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getAtoms() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_atoms == null)
      jcasType.jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_atoms)));}
    
  /** setter for atoms - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAtoms(FSArray v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_atoms == null)
      jcasType.jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_atoms, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for atoms - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Atom getAtoms(int i) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_atoms == null)
      jcasType.jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_atoms), i);
    return (Atom)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_atoms), i)));}

  /** indexed setter for atoms - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAtoms(int i, Atom v) { 
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_atoms == null)
      jcasType.jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_atoms), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_atoms), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    