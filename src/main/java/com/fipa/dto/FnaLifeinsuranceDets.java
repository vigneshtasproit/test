package com.fipa.dto;

// Generated May 17, 2018 11:20:36 AM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FnaLifeinsuranceDets generated by hbm2java
 */
public class FnaLifeinsuranceDets implements java.io.Serializable {

	private String lipId;//
	private FnaSelfspouseDets fnaSelfspouseDets;
	private String lipOwner;//
	private String lipAssured;//
	private String lipCompany;//
	private String lipPolicyno;//
	private String lipPlantype;//
	private String lipPaymentfreq;//
	private String lipPaymentmethod;//
	private String lipPremiumsrc;//
	private Date lipIncepdate;//
	private Double lipSa;//
	private String lipPlanname;//
	private String lipCoveragetype;//hidden value
	private String lipIsnurObject;//hidden value
	private Double lipCurrBonusAcc;//
	private Double lipCurrCashVal;//
	private Double lipMaturityVal;//
	private Date lipMaturityDate;//
	private Double osLoan;//
	private String nominationType;//
	private String thirdpartyName;//
	private Integer lfretYrstoret;//
	private Integer retSelfretage;//
	private Integer retSpouseretage;//
	private String retMultionret;//
	private BigDecimal retCashvalonret;//
	private String lipPolicytype;
	private Double retIntrateused;//
	private Double retPrcnttoused;//
	private String policyStatus;
	private String lipRemarks;//
	private Double retTotalSa;//
	private Double retTotalPrem;// 
	private String lipCreatedBy;//
	private Date lipCreatedDate;//
	private String lipModifiedBy;
	private Date lipModifiedDate;
	private String lipRefId;
	private String lipRetRefId;
	private Integer cashvalRetAge;//
	private Date lipExpdate;
	
	private Set<FnaLifeinsuranceCoverages> fnaLifeinsuranceCoverageses = new HashSet<FnaLifeinsuranceCoverages>(
			0);
	private Set<FnaLifeinsuranceChildedc> fnaLifeinsuranceChildedcs = new HashSet<FnaLifeinsuranceChildedc>(
			0);
	private Set<FnaLifeinsuranceBasicriders> fnaLifeinsuranceBasicriderses = new HashSet<FnaLifeinsuranceBasicriders>(
			0);
	private Set<FnaLifeinsuranceMvRet> fnaLifeinsuranceMvRets = new HashSet<FnaLifeinsuranceMvRet>(
			0);
	private Set<FnaLifeinsuranceDisablebenfs> fnaLifeinsuranceDisablebenfses = new HashSet<FnaLifeinsuranceDisablebenfs>(
			0);
	private Set<FnaLifeinsuranceNominees> fnaLifeinsuranceNomineeses = new HashSet<FnaLifeinsuranceNominees>(
			0);

	public FnaLifeinsuranceDets() {
	}

	public FnaLifeinsuranceDets(String lipId) {
		this.lipId = lipId;
	}
 

	public String getLipRefId() {
		return this.lipRefId;
	}

	public void setLipRefId(String lipRefId) {
		this.lipRefId = lipRefId;
	}
 

	 
	public FnaLifeinsuranceDets(String lipId,
			FnaSelfspouseDets fnaSelfspouseDets, String lipOwner,
			String lipAssured, String lipCompany, String lipPolicyno,
			String lipPlantype, String lipPaymentfreq, String lipPaymentmethod,
			String lipPremiumsrc, Date lipIncepdate, Double lipSa,
			String lipPlanname, String lipCoveragetype, String lipIsnurObject,
			Double lipCurrBonusAcc, Double lipCurrCashVal,
			Double lipMaturityVal, Date lipMaturityDate, Double osLoan,
			String nominationType, String thirdpartyName,
			Integer lfretYrstoret, Integer retSelfretage,
			Integer retSpouseretage, String retMultionret,
			BigDecimal retCashvalonret, String lipPolicytype,
			Double retIntrateused, Double retPrcnttoused, String policyStatus,
			String lipRemarks, Double retTotalSa, Double retTotalPrem,
			String lipCreatedBy, Date lipCreatedDate, String lipModifiedBy,
			Date lipModifiedDate, String lipRefId, String lipRetRefId,
			Integer cashvalRetAge,Date lipExpdate,
			Set<FnaLifeinsuranceCoverages> fnaLifeinsuranceCoverageses,
			Set<FnaLifeinsuranceChildedc> fnaLifeinsuranceChildedcs,
			Set<FnaLifeinsuranceBasicriders> fnaLifeinsuranceBasicriderses,
			Set<FnaLifeinsuranceMvRet> fnaLifeinsuranceMvRets,
			Set<FnaLifeinsuranceDisablebenfs> fnaLifeinsuranceDisablebenfses,
			Set<FnaLifeinsuranceNominees> fnaLifeinsuranceNomineeses) {
		 
		this.lipId = lipId;
		this.fnaSelfspouseDets = fnaSelfspouseDets;
		this.lipOwner = lipOwner;
		this.lipAssured = lipAssured;
		this.lipCompany = lipCompany;
		this.lipPolicyno = lipPolicyno;
		this.lipPlantype = lipPlantype;
		this.lipPaymentfreq = lipPaymentfreq;
		this.lipPaymentmethod = lipPaymentmethod;
		this.lipPremiumsrc = lipPremiumsrc;
		this.lipIncepdate = lipIncepdate;
		this.lipSa = lipSa;
		this.lipPlanname = lipPlanname;
		this.lipCoveragetype = lipCoveragetype;
		this.lipIsnurObject = lipIsnurObject;
		this.lipCurrBonusAcc = lipCurrBonusAcc;
		this.lipCurrCashVal = lipCurrCashVal;
		this.lipMaturityVal = lipMaturityVal;
		this.lipMaturityDate = lipMaturityDate;
		this.osLoan = osLoan;
		this.nominationType = nominationType;
		this.thirdpartyName = thirdpartyName;
		this.lfretYrstoret = lfretYrstoret;
		this.retSelfretage = retSelfretage;
		this.retSpouseretage = retSpouseretage;
		this.retMultionret = retMultionret;
		this.retCashvalonret = retCashvalonret;
		this.lipPolicytype = lipPolicytype;
		this.retIntrateused = retIntrateused;
		this.retPrcnttoused = retPrcnttoused;
		this.policyStatus = policyStatus;
		this.lipRemarks = lipRemarks;
		this.retTotalSa = retTotalSa;
		this.retTotalPrem = retTotalPrem;
		this.lipCreatedBy = lipCreatedBy;
		this.lipCreatedDate = lipCreatedDate;
		this.lipModifiedBy = lipModifiedBy;
		this.lipModifiedDate = lipModifiedDate;
		this.lipRefId = lipRefId;
		this.lipRetRefId = lipRetRefId;
		this.cashvalRetAge = cashvalRetAge;
		this.lipExpdate=lipExpdate;
		this.fnaLifeinsuranceCoverageses = fnaLifeinsuranceCoverageses;
		this.fnaLifeinsuranceChildedcs = fnaLifeinsuranceChildedcs;
		this.fnaLifeinsuranceBasicriderses = fnaLifeinsuranceBasicriderses;
		this.fnaLifeinsuranceMvRets = fnaLifeinsuranceMvRets;
		this.fnaLifeinsuranceDisablebenfses = fnaLifeinsuranceDisablebenfses;
		this.fnaLifeinsuranceNomineeses = fnaLifeinsuranceNomineeses;
	}

	public String getLipRetRefId() {
		return this.lipRetRefId;
	}

	public void setLipRetRefId(String lipRetRefId) {
		this.lipRetRefId = lipRetRefId;
	}

	public Date getLipExpdate() {
		return this.lipExpdate;
	}

	public void setLipExpdate(Date lipExpdate) {
		this.lipExpdate = lipExpdate;
	}

	public Integer getCashvalRetAge() {
		return this.cashvalRetAge;
	}

	public void setCashvalRetAge(Integer cashvalRetAge) {
		this.cashvalRetAge = cashvalRetAge;
	}

	public Double getRetTotalSa() {
		return this.retTotalSa;
	}

	public void setRetTotalSa(Double retTotalSa) {
		this.retTotalSa = retTotalSa;
	}

	public Double getRetTotalPrem() {
		return this.retTotalPrem;
	}

	public void setRetTotalPrem(Double retTotalPrem) {
		this.retTotalPrem = retTotalPrem;
	}

	public String getLipId() {
		return this.lipId;
	}

	public void setLipId(String lipId) {
		this.lipId = lipId;
	}

	public FnaSelfspouseDets getFnaSelfspouseDets() {
		return this.fnaSelfspouseDets;
	}

	public void setFnaSelfspouseDets(FnaSelfspouseDets fnaSelfspouseDets) {
		this.fnaSelfspouseDets = fnaSelfspouseDets;
	}

	public String getLipOwner() {
		return this.lipOwner;
	}

	public void setLipOwner(String lipOwner) {
		this.lipOwner = lipOwner;
	}

	public String getLipAssured() {
		return this.lipAssured;
	}

	public void setLipAssured(String lipAssured) {
		this.lipAssured = lipAssured;
	}

	public String getLipCompany() {
		return this.lipCompany;
	}

	public void setLipCompany(String lipCompany) {
		this.lipCompany = lipCompany;
	}

	public String getLipPolicyno() {
		return this.lipPolicyno;
	}

	public void setLipPolicyno(String lipPolicyno) {
		this.lipPolicyno = lipPolicyno;
	}

	public String getLipPlantype() {
		return this.lipPlantype;
	}

	public void setLipPlantype(String lipPlantype) {
		this.lipPlantype = lipPlantype;
	}

	public String getLipPaymentfreq() {
		return this.lipPaymentfreq;
	}

	public void setLipPaymentfreq(String lipPaymentfreq) {
		this.lipPaymentfreq = lipPaymentfreq;
	}

	public String getLipPaymentmethod() {
		return this.lipPaymentmethod;
	}

	public void setLipPaymentmethod(String lipPaymentmethod) {
		this.lipPaymentmethod = lipPaymentmethod;
	}

	public String getLipPremiumsrc() {
		return this.lipPremiumsrc;
	}

	public void setLipPremiumsrc(String lipPremiumsrc) {
		this.lipPremiumsrc = lipPremiumsrc;
	}

	public Date getLipIncepdate() {
		return this.lipIncepdate;
	}

	public void setLipIncepdate(Date lipIncepdate) {
		this.lipIncepdate = lipIncepdate;
	}

	public Double getLipSa() {
		return this.lipSa;
	}

	public void setLipSa(Double lipSa) {
		this.lipSa = lipSa;
	}

	public String getLipPlanname() {
		return this.lipPlanname;
	}

	public void setLipPlanname(String lipPlanname) {
		this.lipPlanname = lipPlanname;
	}

	public String getLipCoveragetype() {
		return this.lipCoveragetype;
	}

	public void setLipCoveragetype(String lipCoveragetype) {
		this.lipCoveragetype = lipCoveragetype;
	}

	public String getLipIsnurObject() {
		return this.lipIsnurObject;
	}

	public void setLipIsnurObject(String lipIsnurObject) {
		this.lipIsnurObject = lipIsnurObject;
	}

	public Double getLipCurrBonusAcc() {
		return this.lipCurrBonusAcc;
	}

	public void setLipCurrBonusAcc(Double lipCurrBonusAcc) {
		this.lipCurrBonusAcc = lipCurrBonusAcc;
	}

	public Double getLipCurrCashVal() {
		return this.lipCurrCashVal;
	}

	public void setLipCurrCashVal(Double lipCurrCashVal) {
		this.lipCurrCashVal = lipCurrCashVal;
	}

	public Double getLipMaturityVal() {
		return this.lipMaturityVal;
	}

	public void setLipMaturityVal(Double lipMaturityVal) {
		this.lipMaturityVal = lipMaturityVal;
	}

	public Date getLipMaturityDate() {
		return this.lipMaturityDate;
	}

	public void setLipMaturityDate(Date lipMaturityDate) {
		this.lipMaturityDate = lipMaturityDate;
	}

	public Double getOsLoan() {
		return this.osLoan;
	}

	public void setOsLoan(Double osLoan) {
		this.osLoan = osLoan;
	}

	public String getNominationType() {
		return this.nominationType;
	}

	public void setNominationType(String nominationType) {
		this.nominationType = nominationType;
	}

	public String getThirdpartyName() {
		return this.thirdpartyName;
	}

	public void setThirdpartyName(String thirdpartyName) {
		this.thirdpartyName = thirdpartyName;
	}

	public Integer getLfretYrstoret() {
		return this.lfretYrstoret;
	}

	public void setLfretYrstoret(Integer lfretYrstoret) {
		this.lfretYrstoret = lfretYrstoret;
	}

	public Integer getRetSelfretage() {
		return this.retSelfretage;
	}

	public void setRetSelfretage(Integer retSelfretage) {
		this.retSelfretage = retSelfretage;
	}

	public Integer getRetSpouseretage() {
		return this.retSpouseretage;
	}

	public void setRetSpouseretage(Integer retSpouseretage) {
		this.retSpouseretage = retSpouseretage;
	}

	public String getRetMultionret() {
		return this.retMultionret;
	}

	public void setRetMultionret(String retMultionret) {
		this.retMultionret = retMultionret;
	}

	public BigDecimal getRetCashvalonret() {
		return this.retCashvalonret;
	}

	public void setRetCashvalonret(BigDecimal retCashvalonret) {
		this.retCashvalonret = retCashvalonret;
	}

	public String getLipPolicytype() {
		return this.lipPolicytype;
	}

	public void setLipPolicytype(String lipPolicytype) {
		this.lipPolicytype = lipPolicytype;
	}

	public Double getRetIntrateused() {
		return this.retIntrateused;
	}

	public void setRetIntrateused(Double retIntrateused) {
		this.retIntrateused = retIntrateused;
	}

	public Double getRetPrcnttoused() {
		return this.retPrcnttoused;
	}

	public void setRetPrcnttoused(Double retPrcnttoused) {
		this.retPrcnttoused = retPrcnttoused;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getLipRemarks() {
		return this.lipRemarks;
	}

	public void setLipRemarks(String lipRemarks) {
		this.lipRemarks = lipRemarks;
	}

	public String getLipCreatedBy() {
		return this.lipCreatedBy;
	}

	public void setLipCreatedBy(String lipCreatedBy) {
		this.lipCreatedBy = lipCreatedBy;
	}

	public Date getLipCreatedDate() {
		return this.lipCreatedDate;
	}

	public void setLipCreatedDate(Date lipCreatedDate) {
		this.lipCreatedDate = lipCreatedDate;
	}

	public String getLipModifiedBy() {
		return this.lipModifiedBy;
	}

	public void setLipModifiedBy(String lipModifiedBy) {
		this.lipModifiedBy = lipModifiedBy;
	}

	public Date getLipModifiedDate() {
		return this.lipModifiedDate;
	}

	public void setLipModifiedDate(Date lipModifiedDate) {
		this.lipModifiedDate = lipModifiedDate;
	}

	public Set<FnaLifeinsuranceCoverages> getFnaLifeinsuranceCoverageses() {
		return this.fnaLifeinsuranceCoverageses;
	}

	public void setFnaLifeinsuranceCoverageses(
			Set<FnaLifeinsuranceCoverages> fnaLifeinsuranceCoverageses) {
		this.fnaLifeinsuranceCoverageses = fnaLifeinsuranceCoverageses;
	}

	public Set<FnaLifeinsuranceChildedc> getFnaLifeinsuranceChildedcs() {
		return this.fnaLifeinsuranceChildedcs;
	}

	public void setFnaLifeinsuranceChildedcs(
			Set<FnaLifeinsuranceChildedc> fnaLifeinsuranceChildedcs) {
		this.fnaLifeinsuranceChildedcs = fnaLifeinsuranceChildedcs;
	}

	public Set<FnaLifeinsuranceBasicriders> getFnaLifeinsuranceBasicriderses() {
		return this.fnaLifeinsuranceBasicriderses;
	}

	public void setFnaLifeinsuranceBasicriderses(
			Set<FnaLifeinsuranceBasicriders> fnaLifeinsuranceBasicriderses) {
		this.fnaLifeinsuranceBasicriderses = fnaLifeinsuranceBasicriderses;
	}

	public Set<FnaLifeinsuranceMvRet> getFnaLifeinsuranceMvRets() {
		return this.fnaLifeinsuranceMvRets;
	}

	public void setFnaLifeinsuranceMvRets(
			Set<FnaLifeinsuranceMvRet> fnaLifeinsuranceMvRets) {
		this.fnaLifeinsuranceMvRets = fnaLifeinsuranceMvRets;
	}

	public Set<FnaLifeinsuranceDisablebenfs> getFnaLifeinsuranceDisablebenfses() {
		return this.fnaLifeinsuranceDisablebenfses;
	}

	public void setFnaLifeinsuranceDisablebenfses(
			Set<FnaLifeinsuranceDisablebenfs> fnaLifeinsuranceDisablebenfses) {
		this.fnaLifeinsuranceDisablebenfses = fnaLifeinsuranceDisablebenfses;
	}

	public Set<FnaLifeinsuranceNominees> getFnaLifeinsuranceNomineeses() {
		return this.fnaLifeinsuranceNomineeses;
	}

	public void setFnaLifeinsuranceNomineeses(
			Set<FnaLifeinsuranceNominees> fnaLifeinsuranceNomineeses) {
		this.fnaLifeinsuranceNomineeses = fnaLifeinsuranceNomineeses;
	}

}