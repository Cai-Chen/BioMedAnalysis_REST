
/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** A meta mapping.
 * Updated by JCasGen Tue Apr 25 21:29:32 AEST 2017
 * @generated */
public class Mapping_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Mapping.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.Mapping");
 
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
      jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    return ll_cas.ll_getIntValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, int v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    ll_cas.ll_setIntValue(addr, casFeatCode_score, v);}
    
  
 
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
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    return ll_cas.ll_getRefValue(addr, casFeatCode_candidates);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCandidates(int addr, int v) {
        if (featOkTst && casFeat_candidates == null)
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    ll_cas.ll_setRefValue(addr, casFeatCode_candidates, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getCandidates(int addr, int i) {
        if (featOkTst && casFeat_candidates == null)
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
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
      jcas.throwFeatMissing("candidates", "com.unimelb.comp90055.bmAnalysis.type.Mapping");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_candidates), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Mapping_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Integer", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_candidates = jcas.getRequiredFeatureDE(casType, "candidates", "uima.cas.FSArray", featOkTst);
    casFeatCode_candidates  = (null == casFeat_candidates) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_candidates).getCode();

  }
}



    