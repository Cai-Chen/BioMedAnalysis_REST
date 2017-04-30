
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
public class Negation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Negation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.Negation");
 
  /** @generated */
  final Feature casFeat_negType;
  /** @generated */
  final int     casFeatCode_negType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegType(int addr) {
        if (featOkTst && casFeat_negType == null)
      jcas.throwFeatMissing("negType", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_negType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegType(int addr, String v) {
        if (featOkTst && casFeat_negType == null)
      jcas.throwFeatMissing("negType", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    ll_cas.ll_setStringValue(addr, casFeatCode_negType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_negTrigger;
  /** @generated */
  final int     casFeatCode_negTrigger;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegTrigger(int addr) {
        if (featOkTst && casFeat_negTrigger == null)
      jcas.throwFeatMissing("negTrigger", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_negTrigger);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegTrigger(int addr, String v) {
        if (featOkTst && casFeat_negTrigger == null)
      jcas.throwFeatMissing("negTrigger", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    ll_cas.ll_setStringValue(addr, casFeatCode_negTrigger, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ntSpans;
  /** @generated */
  final int     casFeatCode_ntSpans;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNtSpans(int addr) {
        if (featOkTst && casFeat_ntSpans == null)
      jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ntSpans);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNtSpans(int addr, int v) {
        if (featOkTst && casFeat_ntSpans == null)
      jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    ll_cas.ll_setRefValue(addr, casFeatCode_ntSpans, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getNtSpans(int addr, int i) {
        if (featOkTst && casFeat_ntSpans == null)
      jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ntSpans), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ntSpans), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ntSpans), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setNtSpans(int addr, int i, int v) {
        if (featOkTst && casFeat_ntSpans == null)
      jcas.throwFeatMissing("ntSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ntSpans), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ntSpans), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ntSpans), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_cuiConcepts;
  /** @generated */
  final int     casFeatCode_cuiConcepts;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCuiConcepts(int addr) {
        if (featOkTst && casFeat_cuiConcepts == null)
      jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_cuiConcepts);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCuiConcepts(int addr, int v) {
        if (featOkTst && casFeat_cuiConcepts == null)
      jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    ll_cas.ll_setRefValue(addr, casFeatCode_cuiConcepts, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getCuiConcepts(int addr, int i) {
        if (featOkTst && casFeat_cuiConcepts == null)
      jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiConcepts), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_cuiConcepts), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiConcepts), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCuiConcepts(int addr, int i, int v) {
        if (featOkTst && casFeat_cuiConcepts == null)
      jcas.throwFeatMissing("cuiConcepts", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiConcepts), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_cuiConcepts), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiConcepts), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_ncSpans;
  /** @generated */
  final int     casFeatCode_ncSpans;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNcSpans(int addr) {
        if (featOkTst && casFeat_ncSpans == null)
      jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ncSpans);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNcSpans(int addr, int v) {
        if (featOkTst && casFeat_ncSpans == null)
      jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    ll_cas.ll_setRefValue(addr, casFeatCode_ncSpans, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getNcSpans(int addr, int i) {
        if (featOkTst && casFeat_ncSpans == null)
      jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ncSpans), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ncSpans), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ncSpans), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setNcSpans(int addr, int i, int v) {
        if (featOkTst && casFeat_ncSpans == null)
      jcas.throwFeatMissing("ncSpans", "com.unimelb.comp90055.bmAnalysis.type.Negation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ncSpans), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ncSpans), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ncSpans), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Negation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_negType = jcas.getRequiredFeatureDE(casType, "negType", "uima.cas.String", featOkTst);
    casFeatCode_negType  = (null == casFeat_negType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negType).getCode();

 
    casFeat_negTrigger = jcas.getRequiredFeatureDE(casType, "negTrigger", "uima.cas.String", featOkTst);
    casFeatCode_negTrigger  = (null == casFeat_negTrigger) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negTrigger).getCode();

 
    casFeat_ntSpans = jcas.getRequiredFeatureDE(casType, "ntSpans", "uima.cas.FSArray", featOkTst);
    casFeatCode_ntSpans  = (null == casFeat_ntSpans) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ntSpans).getCode();

 
    casFeat_cuiConcepts = jcas.getRequiredFeatureDE(casType, "cuiConcepts", "uima.cas.FSArray", featOkTst);
    casFeatCode_cuiConcepts  = (null == casFeat_cuiConcepts) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cuiConcepts).getCode();

 
    casFeat_ncSpans = jcas.getRequiredFeatureDE(casType, "ncSpans", "uima.cas.FSArray", featOkTst);
    casFeatCode_ncSpans  = (null == casFeat_ncSpans) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ncSpans).getCode();

  }
}



    