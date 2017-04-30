
/* First created by JCasGen Sun Apr 23 23:07:21 AEST 2017 */
package com.unimelb.comp90055.bmAnalysis.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Retrieve atoms from Metathesaurus of UMLS according to cui
 * Updated by JCasGen Sun Apr 30 12:34:28 AEST 2017
 * @generated */
public class Atom_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Atom.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.unimelb.comp90055.bmAnalysis.type.Atom");
 
  /** @generated */
  final Feature casFeat_aui;
  /** @generated */
  final int     casFeatCode_aui;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAui(int addr) {
        if (featOkTst && casFeat_aui == null)
      jcas.throwFeatMissing("aui", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aui);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAui(int addr, String v) {
        if (featOkTst && casFeat_aui == null)
      jcas.throwFeatMissing("aui", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    ll_cas.ll_setStringValue(addr, casFeatCode_aui, v);}
    
  
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_language;
  /** @generated */
  final int     casFeatCode_language;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "com.unimelb.comp90055.bmAnalysis.type.Atom");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Atom_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_aui = jcas.getRequiredFeatureDE(casType, "aui", "uima.cas.String", featOkTst);
    casFeatCode_aui  = (null == casFeat_aui) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aui).getCode();

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

  }
}



    