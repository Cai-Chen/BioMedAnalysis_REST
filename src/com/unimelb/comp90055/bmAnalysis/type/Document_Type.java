
/* First created by JCasGen Sun Apr 23 23:08:14 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Apr 25 21:29:32 AEST 2017
 * @generated */
public class Document_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Document.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.Document");
 
  /** @generated */
  final Feature casFeat_acronymAbbrevs;
  /** @generated */
  final int     casFeatCode_acronymAbbrevs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAcronymAbbrevs(int addr) {
        if (featOkTst && casFeat_acronymAbbrevs == null)
      jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    return ll_cas.ll_getRefValue(addr, casFeatCode_acronymAbbrevs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAcronymAbbrevs(int addr, int v) {
        if (featOkTst && casFeat_acronymAbbrevs == null)
      jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    ll_cas.ll_setRefValue(addr, casFeatCode_acronymAbbrevs, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getAcronymAbbrevs(int addr, int i) {
        if (featOkTst && casFeat_acronymAbbrevs == null)
      jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acronymAbbrevs), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_acronymAbbrevs), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acronymAbbrevs), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAcronymAbbrevs(int addr, int i, int v) {
        if (featOkTst && casFeat_acronymAbbrevs == null)
      jcas.throwFeatMissing("acronymAbbrevs", "com.unimelb.comp90055.bmAnalysis.type.Document");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acronymAbbrevs), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_acronymAbbrevs), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acronymAbbrevs), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_negations;
  /** @generated */
  final int     casFeatCode_negations;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNegations(int addr) {
        if (featOkTst && casFeat_negations == null)
      jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    return ll_cas.ll_getRefValue(addr, casFeatCode_negations);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegations(int addr, int v) {
        if (featOkTst && casFeat_negations == null)
      jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    ll_cas.ll_setRefValue(addr, casFeatCode_negations, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getNegations(int addr, int i) {
        if (featOkTst && casFeat_negations == null)
      jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_negations), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_negations), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_negations), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setNegations(int addr, int i, int v) {
        if (featOkTst && casFeat_negations == null)
      jcas.throwFeatMissing("negations", "com.unimelb.comp90055.bmAnalysis.type.Document");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_negations), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_negations), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_negations), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_utterances;
  /** @generated */
  final int     casFeatCode_utterances;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getUtterances(int addr) {
        if (featOkTst && casFeat_utterances == null)
      jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    return ll_cas.ll_getRefValue(addr, casFeatCode_utterances);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUtterances(int addr, int v) {
        if (featOkTst && casFeat_utterances == null)
      jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    ll_cas.ll_setRefValue(addr, casFeatCode_utterances, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getUtterances(int addr, int i) {
        if (featOkTst && casFeat_utterances == null)
      jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_utterances), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_utterances), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_utterances), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setUtterances(int addr, int i, int v) {
        if (featOkTst && casFeat_utterances == null)
      jcas.throwFeatMissing("utterances", "com.unimelb.comp90055.bmAnalysis.type.Document");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_utterances), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_utterances), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_utterances), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Document_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_acronymAbbrevs = jcas.getRequiredFeatureDE(casType, "acronymAbbrevs", "uima.cas.FSArray", featOkTst);
    casFeatCode_acronymAbbrevs  = (null == casFeat_acronymAbbrevs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_acronymAbbrevs).getCode();

 
    casFeat_negations = jcas.getRequiredFeatureDE(casType, "negations", "uima.cas.FSArray", featOkTst);
    casFeatCode_negations  = (null == casFeat_negations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negations).getCode();

 
    casFeat_utterances = jcas.getRequiredFeatureDE(casType, "utterances", "uima.cas.FSArray", featOkTst);
    casFeatCode_utterances  = (null == casFeat_utterances) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_utterances).getCode();

  }
}



    