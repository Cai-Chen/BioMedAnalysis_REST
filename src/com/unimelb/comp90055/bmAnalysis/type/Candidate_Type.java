
/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The meta elements found in the text. Those are then used as candidates and mappings.
 * Updated by JCasGen Tue Apr 25 21:29:31 AEST 2017
 * @generated */
public class Candidate_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Candidate.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.Candidate");
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getIntValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, int v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setIntValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_spans;
  /** @generated */
  final int     casFeatCode_spans;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpans(int addr) {
        if (featOkTst && casFeat_spans == null)
      jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_spans);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpans(int addr, int v) {
        if (featOkTst && casFeat_spans == null)
      jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setRefValue(addr, casFeatCode_spans, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getSpans(int addr, int i) {
        if (featOkTst && casFeat_spans == null)
      jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_spans), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_spans), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_spans), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSpans(int addr, int i, int v) {
        if (featOkTst && casFeat_spans == null)
      jcas.throwFeatMissing("spans", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_spans), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_spans), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_spans), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_cui;
  /** @generated */
  final int     casFeatCode_cui;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCui(int addr) {
        if (featOkTst && casFeat_cui == null)
      jcas.throwFeatMissing("cui", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cui);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCui(int addr, String v) {
        if (featOkTst && casFeat_cui == null)
      jcas.throwFeatMissing("cui", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setStringValue(addr, casFeatCode_cui, v);}
    
  
 
  /** @generated */
  final Feature casFeat_concept;
  /** @generated */
  final int     casFeatCode_concept;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConcept(int addr) {
        if (featOkTst && casFeat_concept == null)
      jcas.throwFeatMissing("concept", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getStringValue(addr, casFeatCode_concept);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConcept(int addr, String v) {
        if (featOkTst && casFeat_concept == null)
      jcas.throwFeatMissing("concept", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setStringValue(addr, casFeatCode_concept, v);}
    
  
 
  /** @generated */
  final Feature casFeat_preferred;
  /** @generated */
  final int     casFeatCode_preferred;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPreferred(int addr) {
        if (featOkTst && casFeat_preferred == null)
      jcas.throwFeatMissing("preferred", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getStringValue(addr, casFeatCode_preferred);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPreferred(int addr, String v) {
        if (featOkTst && casFeat_preferred == null)
      jcas.throwFeatMissing("preferred", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setStringValue(addr, casFeatCode_preferred, v);}
    
  
 
  /** @generated */
  final Feature casFeat_head;
  /** @generated */
  final int     casFeatCode_head;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHead(int addr) {
        if (featOkTst && casFeat_head == null)
      jcas.throwFeatMissing("head", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_head);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHead(int addr, boolean v) {
        if (featOkTst && casFeat_head == null)
      jcas.throwFeatMissing("head", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_head, v);}
    
  
 
  /** @generated */
  final Feature casFeat_overmatch;
  /** @generated */
  final int     casFeatCode_overmatch;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getOvermatch(int addr) {
        if (featOkTst && casFeat_overmatch == null)
      jcas.throwFeatMissing("overmatch", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_overmatch);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOvermatch(int addr, boolean v) {
        if (featOkTst && casFeat_overmatch == null)
      jcas.throwFeatMissing("overmatch", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_overmatch, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sources;
  /** @generated */
  final int     casFeatCode_sources;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSources(int addr) {
        if (featOkTst && casFeat_sources == null)
      jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sources);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSources(int addr, int v) {
        if (featOkTst && casFeat_sources == null)
      jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setRefValue(addr, casFeatCode_sources, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getSources(int addr, int i) {
        if (featOkTst && casFeat_sources == null)
      jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sources), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sources), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sources), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSources(int addr, int i, String v) {
        if (featOkTst && casFeat_sources == null)
      jcas.throwFeatMissing("sources", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sources), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sources), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sources), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_semanticTypes;
  /** @generated */
  final int     casFeatCode_semanticTypes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSemanticTypes(int addr) {
        if (featOkTst && casFeat_semanticTypes == null)
      jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_semanticTypes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSemanticTypes(int addr, int v) {
        if (featOkTst && casFeat_semanticTypes == null)
      jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setRefValue(addr, casFeatCode_semanticTypes, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getSemanticTypes(int addr, int i) {
        if (featOkTst && casFeat_semanticTypes == null)
      jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_semanticTypes), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_semanticTypes), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_semanticTypes), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSemanticTypes(int addr, int i, String v) {
        if (featOkTst && casFeat_semanticTypes == null)
      jcas.throwFeatMissing("semanticTypes", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_semanticTypes), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_semanticTypes), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_semanticTypes), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_matchedwords;
  /** @generated */
  final int     casFeatCode_matchedwords;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMatchedwords(int addr) {
        if (featOkTst && casFeat_matchedwords == null)
      jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_matchedwords);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatchedwords(int addr, int v) {
        if (featOkTst && casFeat_matchedwords == null)
      jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setRefValue(addr, casFeatCode_matchedwords, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getMatchedwords(int addr, int i) {
        if (featOkTst && casFeat_matchedwords == null)
      jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedwords), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matchedwords), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedwords), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMatchedwords(int addr, int i, String v) {
        if (featOkTst && casFeat_matchedwords == null)
      jcas.throwFeatMissing("matchedwords", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedwords), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matchedwords), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedwords), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_matchMap;
  /** @generated */
  final int     casFeatCode_matchMap;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMatchMap(int addr) {
        if (featOkTst && casFeat_matchMap == null)
      jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_matchMap);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatchMap(int addr, int v) {
        if (featOkTst && casFeat_matchMap == null)
      jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setRefValue(addr, casFeatCode_matchMap, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getMatchMap(int addr, int i) {
        if (featOkTst && casFeat_matchMap == null)
      jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchMap), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matchMap), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchMap), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMatchMap(int addr, int i, int v) {
        if (featOkTst && casFeat_matchMap == null)
      jcas.throwFeatMissing("matchMap", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchMap), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matchMap), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchMap), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_atoms;
  /** @generated */
  final int     casFeatCode_atoms;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAtoms(int addr) {
        if (featOkTst && casFeat_atoms == null)
      jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_atoms);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAtoms(int addr, int v) {
        if (featOkTst && casFeat_atoms == null)
      jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    ll_cas.ll_setRefValue(addr, casFeatCode_atoms, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getAtoms(int addr, int i) {
        if (featOkTst && casFeat_atoms == null)
      jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_atoms), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_atoms), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_atoms), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAtoms(int addr, int i, int v) {
        if (featOkTst && casFeat_atoms == null)
      jcas.throwFeatMissing("atoms", "com.unimelb.comp90055.bmAnalysis.type.Candidate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_atoms), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_atoms), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_atoms), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Candidate_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Integer", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_spans = jcas.getRequiredFeatureDE(casType, "spans", "uima.cas.FSArray", featOkTst);
    casFeatCode_spans  = (null == casFeat_spans) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_spans).getCode();

 
    casFeat_cui = jcas.getRequiredFeatureDE(casType, "cui", "uima.cas.String", featOkTst);
    casFeatCode_cui  = (null == casFeat_cui) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cui).getCode();

 
    casFeat_concept = jcas.getRequiredFeatureDE(casType, "concept", "uima.cas.String", featOkTst);
    casFeatCode_concept  = (null == casFeat_concept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_concept).getCode();

 
    casFeat_preferred = jcas.getRequiredFeatureDE(casType, "preferred", "uima.cas.String", featOkTst);
    casFeatCode_preferred  = (null == casFeat_preferred) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_preferred).getCode();

 
    casFeat_head = jcas.getRequiredFeatureDE(casType, "head", "uima.cas.Boolean", featOkTst);
    casFeatCode_head  = (null == casFeat_head) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_head).getCode();

 
    casFeat_overmatch = jcas.getRequiredFeatureDE(casType, "overmatch", "uima.cas.Boolean", featOkTst);
    casFeatCode_overmatch  = (null == casFeat_overmatch) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_overmatch).getCode();

 
    casFeat_sources = jcas.getRequiredFeatureDE(casType, "sources", "uima.cas.StringArray", featOkTst);
    casFeatCode_sources  = (null == casFeat_sources) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sources).getCode();

 
    casFeat_semanticTypes = jcas.getRequiredFeatureDE(casType, "semanticTypes", "uima.cas.StringArray", featOkTst);
    casFeatCode_semanticTypes  = (null == casFeat_semanticTypes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_semanticTypes).getCode();

 
    casFeat_matchedwords = jcas.getRequiredFeatureDE(casType, "matchedwords", "uima.cas.StringArray", featOkTst);
    casFeatCode_matchedwords  = (null == casFeat_matchedwords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matchedwords).getCode();

 
    casFeat_matchMap = jcas.getRequiredFeatureDE(casType, "matchMap", "uima.cas.FSArray", featOkTst);
    casFeatCode_matchMap  = (null == casFeat_matchMap) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matchMap).getCode();

 
    casFeat_atoms = jcas.getRequiredFeatureDE(casType, "atoms", "uima.cas.FSArray", featOkTst);
    casFeatCode_atoms  = (null == casFeat_atoms) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_atoms).getCode();

  }
}



    