
/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Sun Apr 30 12:29:00 AEST 2017
 * @generated */
public class Phrase_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Phrase.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.Phrase");
 
  /** @generated */
  final Feature casFeat_candidates;
  /** @generated */
  final int     casFeatCode_candidates;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCandidates(int addr) {
        if (featOkTst && casFeat_candidates == null)
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    return ll_cas.ll_getRefValue(addr, casFeatCode_candidates);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCandidates(int addr, int v) {
        if (featOkTst && casFeat_candidates == null)
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    ll_cas.ll_setRefValue(addr, casFeatCode_candidates, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getCandidates(int addr, int i) {
        if (featOkTst && casFeat_candidates == null)
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCandidates(int addr, int i, int v) {
        if (featOkTst && casFeat_candidates == null)
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_mappings;
  /** @generated */
  final int     casFeatCode_mappings;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMappings(int addr) {
        if (featOkTst && casFeat_mappings == null)
      jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mappings);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMappings(int addr, int v) {
        if (featOkTst && casFeat_mappings == null)
      jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    ll_cas.ll_setRefValue(addr, casFeatCode_mappings, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getMappings(int addr, int i) {
        if (featOkTst && casFeat_mappings == null)
      jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mappings), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mappings), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mappings), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMappings(int addr, int i, int v) {
        if (featOkTst && casFeat_mappings == null)
      jcas.throwFeatMissing("mappings", "com.unimelb.comp90055.bmAnalysis.type.Phrase");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mappings), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mappings), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mappings), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Phrase_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_candidates = jcas.getRequiredFeatureDE(casType, "candidates", "uima.cas.FSArray", featOkTst);
    casFeatCode_candidates  = (null == casFeat_candidates) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_candidates).getCode();

 
    casFeat_mappings = jcas.getRequiredFeatureDE(casType, "mappings", "uima.cas.FSArray", featOkTst);
    casFeatCode_mappings  = (null == casFeat_mappings) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mappings).getCode();

  }
}



    