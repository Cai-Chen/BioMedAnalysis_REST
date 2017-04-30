
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
public class MatchMap_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MatchMap.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.MatchMap");
 
  /** @generated */
  final Feature casFeat_phraseMatchStart;
  /** @generated */
  final int     casFeatCode_phraseMatchStart;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPhraseMatchStart(int addr) {
        if (featOkTst && casFeat_phraseMatchStart == null)
      jcas.throwFeatMissing("phraseMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return ll_cas.ll_getIntValue(addr, casFeatCode_phraseMatchStart);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPhraseMatchStart(int addr, int v) {
        if (featOkTst && casFeat_phraseMatchStart == null)
      jcas.throwFeatMissing("phraseMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    ll_cas.ll_setIntValue(addr, casFeatCode_phraseMatchStart, v);}
    
  
 
  /** @generated */
  final Feature casFeat_phraseMatchEnd;
  /** @generated */
  final int     casFeatCode_phraseMatchEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPhraseMatchEnd(int addr) {
        if (featOkTst && casFeat_phraseMatchEnd == null)
      jcas.throwFeatMissing("phraseMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return ll_cas.ll_getIntValue(addr, casFeatCode_phraseMatchEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPhraseMatchEnd(int addr, int v) {
        if (featOkTst && casFeat_phraseMatchEnd == null)
      jcas.throwFeatMissing("phraseMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    ll_cas.ll_setIntValue(addr, casFeatCode_phraseMatchEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conceptMatchStart;
  /** @generated */
  final int     casFeatCode_conceptMatchStart;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getConceptMatchStart(int addr) {
        if (featOkTst && casFeat_conceptMatchStart == null)
      jcas.throwFeatMissing("conceptMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return ll_cas.ll_getIntValue(addr, casFeatCode_conceptMatchStart);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConceptMatchStart(int addr, int v) {
        if (featOkTst && casFeat_conceptMatchStart == null)
      jcas.throwFeatMissing("conceptMatchStart", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    ll_cas.ll_setIntValue(addr, casFeatCode_conceptMatchStart, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conceptMatchEnd;
  /** @generated */
  final int     casFeatCode_conceptMatchEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getConceptMatchEnd(int addr) {
        if (featOkTst && casFeat_conceptMatchEnd == null)
      jcas.throwFeatMissing("conceptMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return ll_cas.ll_getIntValue(addr, casFeatCode_conceptMatchEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConceptMatchEnd(int addr, int v) {
        if (featOkTst && casFeat_conceptMatchEnd == null)
      jcas.throwFeatMissing("conceptMatchEnd", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    ll_cas.ll_setIntValue(addr, casFeatCode_conceptMatchEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lexVariation;
  /** @generated */
  final int     casFeatCode_lexVariation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLexVariation(int addr) {
        if (featOkTst && casFeat_lexVariation == null)
      jcas.throwFeatMissing("lexVariation", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    return ll_cas.ll_getIntValue(addr, casFeatCode_lexVariation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLexVariation(int addr, int v) {
        if (featOkTst && casFeat_lexVariation == null)
      jcas.throwFeatMissing("lexVariation", "com.unimelb.comp90055.bmAnalysis.type.MatchMap");
    ll_cas.ll_setIntValue(addr, casFeatCode_lexVariation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MatchMap_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_phraseMatchStart = jcas.getRequiredFeatureDE(casType, "phraseMatchStart", "uima.cas.Integer", featOkTst);
    casFeatCode_phraseMatchStart  = (null == casFeat_phraseMatchStart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phraseMatchStart).getCode();

 
    casFeat_phraseMatchEnd = jcas.getRequiredFeatureDE(casType, "phraseMatchEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_phraseMatchEnd  = (null == casFeat_phraseMatchEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phraseMatchEnd).getCode();

 
    casFeat_conceptMatchStart = jcas.getRequiredFeatureDE(casType, "conceptMatchStart", "uima.cas.Integer", featOkTst);
    casFeatCode_conceptMatchStart  = (null == casFeat_conceptMatchStart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conceptMatchStart).getCode();

 
    casFeat_conceptMatchEnd = jcas.getRequiredFeatureDE(casType, "conceptMatchEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_conceptMatchEnd  = (null == casFeat_conceptMatchEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conceptMatchEnd).getCode();

 
    casFeat_lexVariation = jcas.getRequiredFeatureDE(casType, "lexVariation", "uima.cas.Integer", featOkTst);
    casFeatCode_lexVariation  = (null == casFeat_lexVariation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lexVariation).getCode();

  }
}



    