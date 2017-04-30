
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
public class Utterance_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Utterance.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.Utterance");
 
  /** @generated */
  final Feature casFeat_pmid;
  /** @generated */
  final int     casFeatCode_pmid;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPmid(int addr) {
        if (featOkTst && casFeat_pmid == null)
      jcas.throwFeatMissing("pmid", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pmid);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPmid(int addr, String v) {
        if (featOkTst && casFeat_pmid == null)
      jcas.throwFeatMissing("pmid", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    ll_cas.ll_setStringValue(addr, casFeatCode_pmid, v);}
    
  
 
  /** @generated */
  final Feature casFeat_phrases;
  /** @generated */
  final int     casFeatCode_phrases;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPhrases(int addr) {
        if (featOkTst && casFeat_phrases == null)
      jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    return ll_cas.ll_getRefValue(addr, casFeatCode_phrases);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPhrases(int addr, int v) {
        if (featOkTst && casFeat_phrases == null)
      jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    ll_cas.ll_setRefValue(addr, casFeatCode_phrases, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getPhrases(int addr, int i) {
        if (featOkTst && casFeat_phrases == null)
      jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phrases), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phrases), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phrases), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setPhrases(int addr, int i, int v) {
        if (featOkTst && casFeat_phrases == null)
      jcas.throwFeatMissing("phrases", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phrases), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phrases), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phrases), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_location;
  /** @generated */
  final int     casFeatCode_location;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLocation(int addr) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_location);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLocation(int addr, String v) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "com.unimelb.comp90055.bmAnalysis.type.Utterance");
    ll_cas.ll_setStringValue(addr, casFeatCode_location, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Utterance_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_pmid = jcas.getRequiredFeatureDE(casType, "pmid", "uima.cas.String", featOkTst);
    casFeatCode_pmid  = (null == casFeat_pmid) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pmid).getCode();

 
    casFeat_phrases = jcas.getRequiredFeatureDE(casType, "phrases", "uima.cas.FSArray", featOkTst);
    casFeatCode_phrases  = (null == casFeat_phrases) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phrases).getCode();

 
    casFeat_location = jcas.getRequiredFeatureDE(casType, "location", "uima.cas.String", featOkTst);
    casFeatCode_location  = (null == casFeat_location) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_location).getCode();

  }
}



    