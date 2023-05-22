package com.fipa.dto;

// Generated May 17, 2018 11:20:36 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * FnaCpfDeductions generated by hbm2java
 */
public class FnaCpfDeductions implements java.io.Serializable {

	private String cdPkid;
	private MasterCpfAcctype masterCpfAcctype;
	private FnaSelfspouseDets fnaSelfspouseDets;
	private String cdApplicant;
	private String cdApplicantType;
	private String transType;
	private String cdDeductionType;
	private Date periodFrom;
	private Date periodTo;
	private Double cdDeductionAmt;
	private String cdPaymentTerm;
	private String cdType;
	private Double cdBalanceTerm;
	private String cdTransReference;
	private String sumTransToRetirement;
	private String cdCrtdBy;
	private Date cdCrtdDate;
	private String cdModBy;
	private Date cdModDate;
	private String cdRefId;
//	<!--changes done 19/06/2019 -->
	private String lifePlanName;
	private String lifePolNo;
	private String ageFrom;
	private String ageTo;
	private String yrsToRetOrTer;
	private String cpfChildName;



	public FnaCpfDeductions() {
	}

	public FnaCpfDeductions(String cdPkid) {
		this.cdPkid = cdPkid;
	}
 
	public FnaCpfDeductions(String cdPkid, MasterCpfAcctype masterCpfAcctype,
			FnaSelfspouseDets fnaSelfspouseDets, String cdApplicant,
			String cdApplicantType, String transType, String cdDeductionType,
			Date periodFrom, Date periodTo, Double cdDeductionAmt,
			String cdPaymentTerm, String cdType, Double cdBalanceTerm,
			String cdTransReference, String sumTransToRetirement,
			String cdCrtdBy, Date cdCrtdDate, String cdModBy, Date cdModDate,
			String cdRefId, String lifePlanName, String lifePolNo,String ageFrom,String ageTo,
			String yrsToRetOrTer,String cpfChildName) {
		 
		this.cdPkid = cdPkid;
		this.masterCpfAcctype = masterCpfAcctype;
		this.fnaSelfspouseDets = fnaSelfspouseDets;
		this.cdApplicant = cdApplicant;
		this.cdApplicantType = cdApplicantType;
		this.transType = transType;
		this.cdDeductionType = cdDeductionType;
		this.periodFrom = periodFrom;
		this.periodTo = periodTo;
		this.cdDeductionAmt = cdDeductionAmt;
		this.cdPaymentTerm = cdPaymentTerm;
		this.cdType = cdType;
		this.cdBalanceTerm = cdBalanceTerm;
		this.cdTransReference = cdTransReference;
		this.sumTransToRetirement = sumTransToRetirement;
		this.cdCrtdBy = cdCrtdBy;
		this.cdCrtdDate = cdCrtdDate;
		this.cdModBy = cdModBy;
		this.cdModDate = cdModDate;
		this.cdRefId = cdRefId;
		this.lifePlanName = lifePlanName;
		this.lifePolNo = lifePolNo;
		this.ageFrom = ageFrom;
		this.ageTo = ageTo;
		this.yrsToRetOrTer=yrsToRetOrTer;
		this.cpfChildName=cpfChildName;
	}

	public String getLifePlanName() {
		return this.lifePlanName;
	}

	public void setLifePlanName(String lifePlanName) {
		this.lifePlanName = lifePlanName;
	}

	public String getLifePolNo() {
		return this.lifePolNo;
	}

	public void setLifePolNo(String lifePolNo) {
		this.lifePolNo = lifePolNo;
	}

	public String getCdRefId() {
		return this.cdRefId;
	}

	public void setCdRefId(String cdRefId) {
		this.cdRefId = cdRefId;
	}

	public String getCdPkid() {
		return this.cdPkid;
	}

	public void setCdPkid(String cdPkid) {
		this.cdPkid = cdPkid;
	}

	public MasterCpfAcctype getMasterCpfAcctype() {
		return this.masterCpfAcctype;
	}

	public void setMasterCpfAcctype(MasterCpfAcctype masterCpfAcctype) {
		this.masterCpfAcctype = masterCpfAcctype;
	}

	public FnaSelfspouseDets getFnaSelfspouseDets() {
		return this.fnaSelfspouseDets;
	}

	public void setFnaSelfspouseDets(FnaSelfspouseDets fnaSelfspouseDets) {
		this.fnaSelfspouseDets = fnaSelfspouseDets;
	}

	public String getCdApplicant() {
		return this.cdApplicant;
	}

	public void setCdApplicant(String cdApplicant) {
		this.cdApplicant = cdApplicant;
	}

	public String getCdApplicantType() {
		return this.cdApplicantType;
	}

	public void setCdApplicantType(String cdApplicantType) {
		this.cdApplicantType = cdApplicantType;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getCdDeductionType() {
		return this.cdDeductionType;
	}

	public void setCdDeductionType(String cdDeductionType) {
		this.cdDeductionType = cdDeductionType;
	}

	public Date getPeriodFrom() {
		return this.periodFrom;
	}

	public void setPeriodFrom(Date periodFrom) {
		this.periodFrom = periodFrom;
	}

	public Date getPeriodTo() {
		return this.periodTo;
	}

	public void setPeriodTo(Date periodTo) {
		this.periodTo = periodTo;
	}

	public Double getCdDeductionAmt() {
		return this.cdDeductionAmt;
	}

	public void setCdDeductionAmt(Double cdDeductionAmt) {
		this.cdDeductionAmt = cdDeductionAmt;
	}

	public String getCdPaymentTerm() {
		return this.cdPaymentTerm;
	}

	public void setCdPaymentTerm(String cdPaymentTerm) {
		this.cdPaymentTerm = cdPaymentTerm;
	}

	public String getCdType() {
		return this.cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	public Double getCdBalanceTerm() {
		return this.cdBalanceTerm;
	}

	public void setCdBalanceTerm(Double cdBalanceTerm) {
		this.cdBalanceTerm = cdBalanceTerm;
	}

	public String getCdTransReference() {
		return this.cdTransReference;
	}

	public void setCdTransReference(String cdTransReference) {
		this.cdTransReference = cdTransReference;
	}

	public String getSumTransToRetirement() {
		return this.sumTransToRetirement;
	}

	public void setSumTransToRetirement(String sumTransToRetirement) {
		this.sumTransToRetirement = sumTransToRetirement;
	}

	public String getCdCrtdBy() {
		return this.cdCrtdBy;
	}

	public void setCdCrtdBy(String cdCrtdBy) {
		this.cdCrtdBy = cdCrtdBy;
	}

	public Date getCdCrtdDate() {
		return this.cdCrtdDate;
	}

	public void setCdCrtdDate(Date cdCrtdDate) {
		this.cdCrtdDate = cdCrtdDate;
	}

	public String getCdModBy() {
		return this.cdModBy;
	}

	public void setCdModBy(String cdModBy) {
		this.cdModBy = cdModBy;
	}

	public Date getCdModDate() {
		return this.cdModDate;
	}

	public void setCdModDate(Date cdModDate) {
		this.cdModDate = cdModDate;
	}
	
	public String getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(String ageFrom) {
		this.ageFrom = ageFrom;
	}

	public String getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(String ageTo) {
		this.ageTo = ageTo;
	}

	public String getYrsToRetOrTer() {
		return yrsToRetOrTer;
	}

	public void setYrsToRetOrTer(String yrsToRetOrTer) {
		this.yrsToRetOrTer = yrsToRetOrTer;
	}

	public String getCpfChildName() {
		return cpfChildName;
	}

	public void setCpfChildName(String cpfChildName) {
		this.cpfChildName = cpfChildName;
	}

}