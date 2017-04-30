
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
 * Updated by JCasGen Sun Apr 30 12:28:59 AEST 2017
 * @generated */
public class AcronymAbbrev_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AcronymAbbrev.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
 
  /** @generated */
  final Feature casFeat_acronym;
  /** @generated */
  final int     casFeatCode_acronym;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAcronym(int addr) {
        if (featOkTst && casFeat_acronym == null)
      jcas.throwFeatMissing("acronym", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return ll_cas.ll_getStringValue(addr, casFeatCode_acronym);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAcronym(int addr, String v) {
        if (featOkTst && casFeat_acronym == null)
      jcas.throwFeatMissing("acronym", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    ll_cas.ll_setStringValue(addr, casFeatCode_acronym, v);}
    
  
 
  /** @generated */
  final Feature casFeat_expansion;
  /** @generated */
  final int     casFeatCode_expansion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExpansion(int addr) {
        if (featOkTst && casFeat_expansion == null)
      jcas.throwFeatMissing("expansion", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return ll_cas.ll_getStringValue(addr, casFeatCode_expansion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExpansion(int addr, String v) {
        if (featOkTst && casFeat_expansion == null)
      jcas.throwFeatMissing("expansion", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    ll_cas.ll_setStringValue(addr, casFeatCode_expansion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_countList;
  /** @generated */
  final int     casFeatCode_countList;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCountList(int addr) {
        if (featOkTst && casFeat_countList == null)
      jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return ll_cas.ll_getRefValue(addr, casFeatCode_countList);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountList(int addr, int v) {
        if (featOkTst && casFeat_countList == null)
      jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    ll_cas.ll_setRefValue(addr, casFeatCode_countList, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getCountList(int addr, int i) {
        if (featOkTst && casFeat_countList == null)
      jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_countList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_countList), i);
  return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_countList), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCountList(int addr, int i, int v) {
        if (featOkTst && casFeat_countList == null)
      jcas.throwFeatMissing("countList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_countList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_countList), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_countList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_cuiList;
  /** @generated */
  final int     casFeatCode_cuiList;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCuiList(int addr) {
        if (featOkTst && casFeat_cuiList == null)
      jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    return ll_cas.ll_getRefValue(addr, casFeatCode_cuiList);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCuiList(int addr, int v) {
        if (featOkTst && casFeat_cuiList == null)
      jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    ll_cas.ll_setRefValue(addr, casFeatCode_cuiList, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getCuiList(int addr, int i) {
        if (featOkTst && casFeat_cuiList == null)
      jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_cuiList), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiList), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCuiList(int addr, int i, String v) {
        if (featOkTst && casFeat_cuiList == null)
      jcas.throwFeatMissing("cuiList", "com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_cuiList), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_cuiList), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AcronymAbbrev_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_acronym = jcas.getRequiredFeatureDE(casType, "acronym", "uima.cas.String", featOkTst);
    casFeatCode_acronym  = (null == casFeat_acronym) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_acronym).getCode();

 
    casFeat_expansion = jcas.getRequiredFeatureDE(casType, "expansion", "uima.cas.String", featOkTst);
    casFeatCode_expansion  = (null == casFeat_expansion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_expansion).getCode();

 
    casFeat_countList = jcas.getRequiredFeatureDE(casType, "countList", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_countList  = (null == casFeat_countList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_countList).getCode();

 
    casFeat_cuiList = jcas.getRequiredFeatureDE(casType, "cuiList", "uima.cas.StringArray", featOkTst);
    casFeatCode_cuiList  = (null == casFeat_cuiList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cuiList).getCode();

  }
}



    