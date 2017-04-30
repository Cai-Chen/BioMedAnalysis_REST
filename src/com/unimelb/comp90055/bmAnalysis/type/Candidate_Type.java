
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
 * Updated by JCasGen Sun Apr 30 12:34:28 AEST 2017
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

 
    casFeat_spans = jcas.getRequiredFeatureDE(casType, "spans", "uima.cas.FSArray", featOkTst);
    casFeatCode_spans  = (null == casFeat_spans) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_spans).getCode();

 
    casFeat_cui = jcas.getRequiredFeatureDE(casType, "cui", "uima.cas.String", featOkTst);
    casFeatCode_cui  = (null == casFeat_cui) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cui).getCode();

 
    casFeat_concept = jcas.getRequiredFeatureDE(casType, "concept", "uima.cas.String", featOkTst);
    casFeatCode_concept  = (null == casFeat_concept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_concept).getCode();

 
    casFeat_sources = jcas.getRequiredFeatureDE(casType, "sources", "uima.cas.StringArray", featOkTst);
    casFeatCode_sources  = (null == casFeat_sources) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sources).getCode();

 
    casFeat_semanticTypes = jcas.getRequiredFeatureDE(casType, "semanticTypes", "uima.cas.StringArray", featOkTst);
    casFeatCode_semanticTypes  = (null == casFeat_semanticTypes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_semanticTypes).getCode();

 
    casFeat_atoms = jcas.getRequiredFeatureDE(casType, "atoms", "uima.cas.FSArray", featOkTst);
    casFeatCode_atoms  = (null == casFeat_atoms) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_atoms).getCode();

  }
}



    