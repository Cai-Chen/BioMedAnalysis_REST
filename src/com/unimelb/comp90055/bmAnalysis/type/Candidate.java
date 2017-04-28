

/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** The meta elements found in the text. Those are then used as candidates and mappings.
 * Updated by JCasGen Tue Apr 25 21:29:31 AEST 2017
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
  //* Feature: score

  /** getter for score - gets The score of this meta element (0 <= x <= 1000).
   * @generated
   * @return value of the feature 
   */
  public int getScore() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Candidate_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score of this meta element (0 <= x <= 1000). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(int v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setIntValue(addr, ((Candidate_Type)jcasType).casFeatCode_score, v);}    
   
    
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
  //* Feature: preferred

  /** getter for preferred - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPreferred() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_preferred == null)
      jcasType.jcas.throwFeatMissing("preferred", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Candidate_Type)jcasType).casFeatCode_preferred);}
    
  /** setter for preferred - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPreferred(String v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_preferred == null)
      jcasType.jcas.throwFeatMissing("preferred", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setStringValue(addr, ((Candidate_Type)jcasType).casFeatCode_preferred, v);}    
   
    
  //*--------------*
  //* Feature: head

  /** getter for head - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHead() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Candidate_Type)jcasType).casFeatCode_head);}
    
  /** setter for head - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHead(boolean v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Candidate_Type)jcasType).casFeatCode_head, v);}    
   
    
  //*--------------*
  //* Feature: overmatch

  /** getter for overmatch - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getOvermatch() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_overmatch == null)
      jcasType.jcas.throwFeatMissing("overmatch", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Candidate_Type)jcasType).casFeatCode_overmatch);}
    
  /** setter for overmatch - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOvermatch(boolean v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_overmatch == null)
      jcasType.jcas.throwFeatMissing("overmatch", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Candidate_Type)jcasType).casFeatCode_overmatch, v);}    
   
    
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
  //* Feature: matchedwords

  /** getter for matchedwords - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getMatchedwords() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchedwords == null)
      jcasType.jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchedwords)));}
    
  /** setter for matchedwords - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedwords(StringArray v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchedwords == null)
      jcasType.jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchedwords, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for matchedwords - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getMatchedwords(int i) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchedwords == null)
      jcasType.jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchedwords), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchedwords), i);}

  /** indexed setter for matchedwords - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMatchedwords(int i, String v) { 
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchedwords == null)
      jcasType.jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchedwords), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchedwords), i, v);}
   
    
  //*--------------*
  //* Feature: matchMap

  /** getter for matchMap - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMatchMap() {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchMap == null)
      jcasType.jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchMap)));}
    
  /** setter for matchMap - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchMap(FSArray v) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchMap == null)
      jcasType.jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchMap, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for matchMap - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public MatchMap getMatchMap(int i) {
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchMap == null)
      jcasType.jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchMap), i);
    return (MatchMap)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchMap), i)));}

  /** indexed setter for matchMap - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMatchMap(int i, MatchMap v) { 
    if (Candidate_Type.featOkTst && ((Candidate_Type)jcasType).casFeat_matchMap == null)
      jcasType.jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchMap), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Candidate_Type)jcasType).casFeatCode_matchMap), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
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

    