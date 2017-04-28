
/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Tue Apr 25 21:29:32 AEST 2017
 * @generated */
public class CuiConcept_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CuiConcept.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
 
  /** @generated */
  final Feature casFeat_negExCui;
  /** @generated */
  final int     casFeatCode_negExCui;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegExCui(int addr) {
        if (featOkTst && casFeat_negExCui == null)
      jcas.throwFeatMissing("negExCui", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_negExCui);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegExCui(int addr, String v) {
        if (featOkTst && casFeat_negExCui == null)
      jcas.throwFeatMissing("negExCui", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_negExCui, v);}
    
  
 
  /** @generated */
  final Feature casFeat_negExConcept;
  /** @generated */
  final int     casFeatCode_negExConcept;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegExConcept(int addr) {
        if (featOkTst && casFeat_negExConcept == null)
      jcas.throwFeatMissing("negExConcept", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_negExConcept);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegExConcept(int addr, String v) {
        if (featOkTst && casFeat_negExConcept == null)
      jcas.throwFeatMissing("negExConcept", "com.unimelb.comp90055.bmAnalysis.type.CuiConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_negExConcept, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CuiConcept_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_negExCui = jcas.getRequiredFeatureDE(casType, "negExCui", "uima.cas.String", featOkTst);
    casFeatCode_negExCui  = (null == casFeat_negExCui) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negExCui).getCode();

 
    casFeat_negExConcept = jcas.getRequiredFeatureDE(casType, "negExConcept", "uima.cas.String", featOkTst);
    casFeatCode_negExConcept  = (null == casFeat_negExConcept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negExConcept).getCode();

  }
}



    