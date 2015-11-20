/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ultimate
 */
@Entity
@Table(name = "WEB_IN_OUT_TRX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WebInOutTrx.findAll", query = "SELECT w FROM WebInOutTrx w"),
    @NamedQuery(name = "WebInOutTrx.findByFrmAgentType", query = "SELECT w FROM WebInOutTrx w WHERE w.frmAgentType = :frmAgentType"),
    @NamedQuery(name = "WebInOutTrx.findByFrmAgentNo", query = "SELECT w FROM WebInOutTrx w WHERE w.frmAgentNo = :frmAgentNo"),
    @NamedQuery(name = "WebInOutTrx.findByFrmAgentBrnNo", query = "SELECT w FROM WebInOutTrx w WHERE w.frmAgentBrnNo = :frmAgentBrnNo"),
    @NamedQuery(name = "WebInOutTrx.findByTrxYear", query = "SELECT w FROM WebInOutTrx w WHERE w.trxYear = :trxYear"),
    @NamedQuery(name = "WebInOutTrx.findByTrxSer", query = "SELECT w FROM WebInOutTrx w WHERE w.trxSer = :trxSer"),
    @NamedQuery(name = "WebInOutTrx.findByRemNo", query = "SELECT w FROM WebInOutTrx w WHERE w.remNo = :remNo"),
    @NamedQuery(name = "WebInOutTrx.findByTrxDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.trxDatetime = :trxDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByPymtMthd", query = "SELECT w FROM WebInOutTrx w WHERE w.pymtMthd = :pymtMthd"),
    @NamedQuery(name = "WebInOutTrx.findByTrxCurrNo", query = "SELECT w FROM WebInOutTrx w WHERE w.trxCurrNo = :trxCurrNo"),
    @NamedQuery(name = "WebInOutTrx.findByTrxAmt", query = "SELECT w FROM WebInOutTrx w WHERE w.trxAmt = :trxAmt"),
    @NamedQuery(name = "WebInOutTrx.findByTrxLamt", query = "SELECT w FROM WebInOutTrx w WHERE w.trxLamt = :trxLamt"),
    @NamedQuery(name = "WebInOutTrx.findByTrxExchRate", query = "SELECT w FROM WebInOutTrx w WHERE w.trxExchRate = :trxExchRate"),
    @NamedQuery(name = "WebInOutTrx.findByDestType", query = "SELECT w FROM WebInOutTrx w WHERE w.destType = :destType"),
    @NamedQuery(name = "WebInOutTrx.findByToAgentType", query = "SELECT w FROM WebInOutTrx w WHERE w.toAgentType = :toAgentType"),
    @NamedQuery(name = "WebInOutTrx.findByToAgentNo", query = "SELECT w FROM WebInOutTrx w WHERE w.toAgentNo = :toAgentNo"),
    @NamedQuery(name = "WebInOutTrx.findByToAgentBrnNo", query = "SELECT w FROM WebInOutTrx w WHERE w.toAgentBrnNo = :toAgentBrnNo"),
    @NamedQuery(name = "WebInOutTrx.findByNoteToAgent", query = "SELECT w FROM WebInOutTrx w WHERE w.noteToAgent = :noteToAgent"),
    @NamedQuery(name = "WebInOutTrx.findByFeeCurrNo", query = "SELECT w FROM WebInOutTrx w WHERE w.feeCurrNo = :feeCurrNo"),
    @NamedQuery(name = "WebInOutTrx.findByFeeAmt", query = "SELECT w FROM WebInOutTrx w WHERE w.feeAmt = :feeAmt"),
    @NamedQuery(name = "WebInOutTrx.findByFeeExchRate", query = "SELECT w FROM WebInOutTrx w WHERE w.feeExchRate = :feeExchRate"),
    @NamedQuery(name = "WebInOutTrx.findByFeeLamt", query = "SELECT w FROM WebInOutTrx w WHERE w.feeLamt = :feeLamt"),
    @NamedQuery(name = "WebInOutTrx.findByTrnsRsn", query = "SELECT w FROM WebInOutTrx w WHERE w.trnsRsn = :trnsRsn"),
    @NamedQuery(name = "WebInOutTrx.findByAmendFlag", query = "SELECT w FROM WebInOutTrx w WHERE w.amendFlag = :amendFlag"),
    @NamedQuery(name = "WebInOutTrx.findByTrxStatus", query = "SELECT w FROM WebInOutTrx w WHERE w.trxStatus = :trxStatus"),
    @NamedQuery(name = "WebInOutTrx.findByRefNo", query = "SELECT w FROM WebInOutTrx w WHERE w.refNo = :refNo"),
    @NamedQuery(name = "WebInOutTrx.findByFastFlag", query = "SELECT w FROM WebInOutTrx w WHERE w.fastFlag = :fastFlag"),
    @NamedQuery(name = "WebInOutTrx.findByEntryDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.entryDatetime = :entryDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByEntryUser", query = "SELECT w FROM WebInOutTrx w WHERE w.entryUser = :entryUser"),
    @NamedQuery(name = "WebInOutTrx.findByApprvDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.apprvDatetime = :apprvDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByApprvUser", query = "SELECT w FROM WebInOutTrx w WHERE w.apprvUser = :apprvUser"),
    @NamedQuery(name = "WebInOutTrx.findByPrintCnt", query = "SELECT w FROM WebInOutTrx w WHERE w.printCnt = :printCnt"),
    @NamedQuery(name = "WebInOutTrx.findByPrintDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.printDatetime = :printDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByPrintFlag", query = "SELECT w FROM WebInOutTrx w WHERE w.printFlag = :printFlag"),
    @NamedQuery(name = "WebInOutTrx.findBySndrName", query = "SELECT w FROM WebInOutTrx w WHERE w.sndrName = :sndrName"),
    @NamedQuery(name = "WebInOutTrx.findBySndrId", query = "SELECT w FROM WebInOutTrx w WHERE w.sndrId = :sndrId"),
    @NamedQuery(name = "WebInOutTrx.findBySndridType", query = "SELECT w FROM WebInOutTrx w WHERE w.sndridType = :sndridType"),
    @NamedQuery(name = "WebInOutTrx.findBySndridIssPlc", query = "SELECT w FROM WebInOutTrx w WHERE w.sndridIssPlc = :sndridIssPlc"),
    @NamedQuery(name = "WebInOutTrx.findBySndrIdExpDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.sndrIdExpDatetime = :sndrIdExpDatetime"),
    @NamedQuery(name = "WebInOutTrx.findBySndrAdd", query = "SELECT w FROM WebInOutTrx w WHERE w.sndrAdd = :sndrAdd"),
    @NamedQuery(name = "WebInOutTrx.findBySndrPhone", query = "SELECT w FROM WebInOutTrx w WHERE w.sndrPhone = :sndrPhone"),
    @NamedQuery(name = "WebInOutTrx.findByBnfName", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfName = :bnfName"),
    @NamedQuery(name = "WebInOutTrx.findByBnfId", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfId = :bnfId"),
    @NamedQuery(name = "WebInOutTrx.findByBnfidType", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfidType = :bnfidType"),
    @NamedQuery(name = "WebInOutTrx.findByBnfidIssPlc", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfidIssPlc = :bnfidIssPlc"),
    @NamedQuery(name = "WebInOutTrx.findByBnfIdExpDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfIdExpDatetime = :bnfIdExpDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByBnfAdd", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfAdd = :bnfAdd"),
    @NamedQuery(name = "WebInOutTrx.findByBnfPhone", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfPhone = :bnfPhone"),
    @NamedQuery(name = "WebInOutTrx.findByNoteToBnf", query = "SELECT w FROM WebInOutTrx w WHERE w.noteToBnf = :noteToBnf"),
    @NamedQuery(name = "WebInOutTrx.findByOutremSecureNo", query = "SELECT w FROM WebInOutTrx w WHERE w.outremSecureNo = :outremSecureNo"),
    @NamedQuery(name = "WebInOutTrx.findByOutremSecureDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.outremSecureDatetime = :outremSecureDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByCnclDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.cnclDatetime = :cnclDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByPayAgentType", query = "SELECT w FROM WebInOutTrx w WHERE w.payAgentType = :payAgentType"),
    @NamedQuery(name = "WebInOutTrx.findByPayAgentNo", query = "SELECT w FROM WebInOutTrx w WHERE w.payAgentNo = :payAgentNo"),
    @NamedQuery(name = "WebInOutTrx.findByPayAgentBrnNo", query = "SELECT w FROM WebInOutTrx w WHERE w.payAgentBrnNo = :payAgentBrnNo"),
    @NamedQuery(name = "WebInOutTrx.findByPayYear", query = "SELECT w FROM WebInOutTrx w WHERE w.payYear = :payYear"),
    @NamedQuery(name = "WebInOutTrx.findByPaySer", query = "SELECT w FROM WebInOutTrx w WHERE w.paySer = :paySer"),
    @NamedQuery(name = "WebInOutTrx.findByPayDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.payDatetime = :payDatetime"),
    @NamedQuery(name = "WebInOutTrx.findBySndrIdIssuDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.sndrIdIssuDatetime = :sndrIdIssuDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByBnfIdIssuDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfIdIssuDatetime = :bnfIdIssuDatetime"),
    @NamedQuery(name = "WebInOutTrx.findBySecKey", query = "SELECT w FROM WebInOutTrx w WHERE w.secKey = :secKey"),
    @NamedQuery(name = "WebInOutTrx.findByBrnNo", query = "SELECT w FROM WebInOutTrx w WHERE w.brnNo = :brnNo"),
    @NamedQuery(name = "WebInOutTrx.findByTransOra", query = "SELECT w FROM WebInOutTrx w WHERE w.transOra = :transOra"),
    @NamedQuery(name = "WebInOutTrx.findByPayPost", query = "SELECT w FROM WebInOutTrx w WHERE w.payPost = :payPost"),
    @NamedQuery(name = "WebInOutTrx.findByPayJvSer", query = "SELECT w FROM WebInOutTrx w WHERE w.payJvSer = :payJvSer"),
    @NamedQuery(name = "WebInOutTrx.findByTrxSerRef", query = "SELECT w FROM WebInOutTrx w WHERE w.trxSerRef = :trxSerRef"),
    @NamedQuery(name = "WebInOutTrx.findByRemType", query = "SELECT w FROM WebInOutTrx w WHERE w.remType = :remType"),
    @NamedQuery(name = "WebInOutTrx.findByToCityNo", query = "SELECT w FROM WebInOutTrx w WHERE w.toCityNo = :toCityNo"),
    @NamedQuery(name = "WebInOutTrx.findByFeeAmtExtra", query = "SELECT w FROM WebInOutTrx w WHERE w.feeAmtExtra = :feeAmtExtra"),
    @NamedQuery(name = "WebInOutTrx.findByPayFeeCurrNo", query = "SELECT w FROM WebInOutTrx w WHERE w.payFeeCurrNo = :payFeeCurrNo"),
    @NamedQuery(name = "WebInOutTrx.findByPayFeeAmt", query = "SELECT w FROM WebInOutTrx w WHERE w.payFeeAmt = :payFeeAmt"),
    @NamedQuery(name = "WebInOutTrx.findBySndVocNo", query = "SELECT w FROM WebInOutTrx w WHERE w.sndVocNo = :sndVocNo"),
    @NamedQuery(name = "WebInOutTrx.findByRcvVocNo", query = "SELECT w FROM WebInOutTrx w WHERE w.rcvVocNo = :rcvVocNo"),
    @NamedQuery(name = "WebInOutTrx.findByCnclJvSer", query = "SELECT w FROM WebInOutTrx w WHERE w.cnclJvSer = :cnclJvSer"),
    @NamedQuery(name = "WebInOutTrx.findByCnclUser", query = "SELECT w FROM WebInOutTrx w WHERE w.cnclUser = :cnclUser"),
    @NamedQuery(name = "WebInOutTrx.findByPayUser", query = "SELECT w FROM WebInOutTrx w WHERE w.payUser = :payUser"),
    @NamedQuery(name = "WebInOutTrx.findByEditUser", query = "SELECT w FROM WebInOutTrx w WHERE w.editUser = :editUser"),
    @NamedQuery(name = "WebInOutTrx.findByEditDate", query = "SELECT w FROM WebInOutTrx w WHERE w.editDate = :editDate"),
    @NamedQuery(name = "WebInOutTrx.findBySndrNameOld", query = "SELECT w FROM WebInOutTrx w WHERE w.sndrNameOld = :sndrNameOld"),
    @NamedQuery(name = "WebInOutTrx.findByBnfNameOld", query = "SELECT w FROM WebInOutTrx w WHERE w.bnfNameOld = :bnfNameOld"),
    @NamedQuery(name = "WebInOutTrx.findByOutRemNo", query = "SELECT w FROM WebInOutTrx w WHERE w.outRemNo = :outRemNo"),
    @NamedQuery(name = "WebInOutTrx.findByRcvPrintCnt", query = "SELECT w FROM WebInOutTrx w WHERE w.rcvPrintCnt = :rcvPrintCnt"),
    @NamedQuery(name = "WebInOutTrx.findByCnclPrintCnt", query = "SELECT w FROM WebInOutTrx w WHERE w.cnclPrintCnt = :cnclPrintCnt"),
    @NamedQuery(name = "WebInOutTrx.findByRnmPrintCnt", query = "SELECT w FROM WebInOutTrx w WHERE w.rnmPrintCnt = :rnmPrintCnt"),
    @NamedQuery(name = "WebInOutTrx.findByRcvPrintDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.rcvPrintDatetime = :rcvPrintDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByCnclPrintDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.cnclPrintDatetime = :cnclPrintDatetime"),
    @NamedQuery(name = "WebInOutTrx.findByRnmPrintDatetime", query = "SELECT w FROM WebInOutTrx w WHERE w.rnmPrintDatetime = :rnmPrintDatetime"),
    @NamedQuery(name = "WebInOutTrx.findBySndJvSer", query = "SELECT w FROM WebInOutTrx w WHERE w.sndJvSer = :sndJvSer")})
public class WebInOutTrx implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FRM_AGENT_TYPE")
    private long frmAgentType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FRM_AGENT_NO")
    private long frmAgentNo;
    @Column(name = "FRM_AGENT_BRN_NO")
    private Long frmAgentBrnNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_YEAR")
    private long trxYear;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_SER")
    private BigDecimal trxSer;
    @Size(max = 100)
    @Column(name = "REM_NO")
    private String remNo;
    @Column(name = "TRX_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trxDatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PYMT_MTHD")
    private long pymtMthd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_CURR_NO")
    private long trxCurrNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_AMT")
    private BigInteger trxAmt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_LAMT")
    private BigInteger trxLamt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_EXCH_RATE")
    private BigInteger trxExchRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEST_TYPE")
    private long destType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TO_AGENT_TYPE")
    private long toAgentType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TO_AGENT_NO")
    private long toAgentNo;
    @Column(name = "TO_AGENT_BRN_NO")
    private Long toAgentBrnNo;
    @Size(max = 200)
    @Column(name = "NOTE_TO_AGENT")
    private String noteToAgent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEE_CURR_NO")
    private long feeCurrNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEE_AMT")
    private BigDecimal feeAmt;
    @Column(name = "FEE_EXCH_RATE")
    private BigInteger feeExchRate;
    @Column(name = "FEE_LAMT")
    private BigInteger feeLamt;
    @Column(name = "TRNS_RSN")
    private Long trnsRsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AMEND_FLAG")
    private long amendFlag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_STATUS")
    private long trxStatus;
    @Column(name = "REF_NO")
    private Long refNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FAST_FLAG")
    private long fastFlag;
    @Column(name = "ENTRY_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDatetime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ENTRY_USER")
    private String entryUser;
    @Column(name = "APPRV_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date apprvDatetime;
    @Size(max = 25)
    @Column(name = "APPRV_USER")
    private String apprvUser;
    @Column(name = "PRINT_CNT")
    private Long printCnt;
    @Column(name = "PRINT_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date printDatetime;
    @Column(name = "PRINT_FLAG")
    private Long printFlag;
    @Size(max = 150)
    @Column(name = "SNDR_NAME")
    private String sndrName;
    @Size(max = 30)
    @Column(name = "SNDR_ID")
    private String sndrId;
    @Column(name = "SNDRID_TYPE")
    private Long sndridType;
    @Size(max = 80)
    @Column(name = "SNDRID_ISS_PLC")
    private String sndridIssPlc;
    @Column(name = "SNDR_ID_EXP_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sndrIdExpDatetime;
    @Size(max = 200)
    @Column(name = "SNDR_ADD")
    private String sndrAdd;
    @Size(max = 60)
    @Column(name = "SNDR_PHONE")
    private String sndrPhone;
    @Size(max = 150)
    @Column(name = "BNF_NAME")
    private String bnfName;
    @Size(max = 30)
    @Column(name = "BNF_ID")
    private String bnfId;
    @Column(name = "BNFID_TYPE")
    private Long bnfidType;
    @Size(max = 80)
    @Column(name = "BNFID_ISS_PLC")
    private String bnfidIssPlc;
    @Column(name = "BNF_ID_EXP_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bnfIdExpDatetime;
    @Size(max = 200)
    @Column(name = "BNF_ADD")
    private String bnfAdd;
    @Size(max = 60)
    @Column(name = "BNF_PHONE")
    private String bnfPhone;
    @Size(max = 200)
    @Column(name = "NOTE_TO_BNF")
    private String noteToBnf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OUTREM_SECURE_NO")
    private BigInteger outremSecureNo;
    @Column(name = "OUTREM_SECURE_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date outremSecureDatetime;
    @Column(name = "CNCL_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cnclDatetime;
    @Column(name = "PAY_AGENT_TYPE")
    private Long payAgentType;
    @Column(name = "PAY_AGENT_NO")
    private Long payAgentNo;
    @Size(max = 100)
    @Column(name = "PAY_AGENT_BRN_NO")
    private String payAgentBrnNo;
    @Column(name = "PAY_YEAR")
    private Long payYear;
    @Column(name = "PAY_SER")
    private Long paySer;
    @Column(name = "PAY_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date payDatetime;
    @Column(name = "SNDR_ID_ISSU_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sndrIdIssuDatetime;
    @Column(name = "BNF_ID_ISSU_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bnfIdIssuDatetime;
    @Size(max = 200)
    @Column(name = "SEC_KEY")
    private String secKey;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BRN_NO")
    private long brnNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRANS_ORA")
    private long transOra;
    @Column(name = "PAY_POST")
    private Long payPost;
    @Column(name = "PAY_JV_SER")
    private Long payJvSer;
    @Column(name = "TRX_SER_REF")
    private BigInteger trxSerRef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REM_TYPE")
    private long remType;
    @Column(name = "TO_CITY_NO")
    private Long toCityNo;
    @Column(name = "FEE_AMT_EXTRA")
    private Double feeAmtExtra;
    @Column(name = "PAY_FEE_CURR_NO")
    private Long payFeeCurrNo;
    @Column(name = "PAY_FEE_AMT")
    private BigDecimal payFeeAmt;
    @Column(name = "SND_VOC_NO")
    private Long sndVocNo;
    @Column(name = "RCV_VOC_NO")
    private Long rcvVocNo;
    @Column(name = "CNCL_JV_SER")
    private BigInteger cnclJvSer;
    @Size(max = 25)
    @Column(name = "CNCL_USER")
    private String cnclUser;
    @Size(max = 25)
    @Column(name = "PAY_USER")
    private String payUser;
    @Size(max = 25)
    @Column(name = "EDIT_USER")
    private String editUser;
    @Column(name = "EDIT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDate;
    @Size(max = 150)
    @Column(name = "SNDR_NAME_OLD")
    private String sndrNameOld;
    @Size(max = 150)
    @Column(name = "BNF_NAME_OLD")
    private String bnfNameOld;
    @Column(name = "OUT_REM_NO")
    private BigInteger outRemNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RCV_PRINT_CNT")
    private long rcvPrintCnt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNCL_PRINT_CNT")
    private long cnclPrintCnt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RNM_PRINT_CNT")
    private long rnmPrintCnt;
    @Column(name = "RCV_PRINT_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rcvPrintDatetime;
    @Column(name = "CNCL_PRINT_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cnclPrintDatetime;
    @Column(name = "RNM_PRINT_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rnmPrintDatetime;
    @Column(name = "SND_JV_SER")
    private BigInteger sndJvSer;

    public WebInOutTrx() {
    }
    

    public WebInOutTrx(BigDecimal trxSer) {
        this.trxSer = trxSer;
    }

    public WebInOutTrx(BigDecimal trxSer, long frmAgentType, long frmAgentNo, long trxYear, long pymtMthd, long trxCurrNo, BigInteger trxAmt, BigInteger trxLamt, BigInteger trxExchRate, long destType, long toAgentType, long toAgentNo, long feeCurrNo, BigDecimal feeAmt, long amendFlag, long trxStatus, long fastFlag, String entryUser, BigInteger outremSecureNo, long brnNo, long transOra, long remType, long rcvPrintCnt, long cnclPrintCnt, long rnmPrintCnt,String bnfName,String sndrName) {
        this.trxSer = trxSer;
        this.frmAgentType = frmAgentType;
        this.frmAgentNo = frmAgentNo;
        this.trxYear = trxYear;
        this.pymtMthd = pymtMthd;
        this.trxCurrNo = trxCurrNo;
        this.trxAmt = trxAmt;
        this.trxLamt = trxLamt;
        this.trxExchRate = trxExchRate;
        this.destType = destType;
        this.toAgentType = toAgentType;
        this.toAgentNo = toAgentNo;
        this.feeCurrNo = feeCurrNo;
        this.feeAmt = feeAmt;
        this.amendFlag = amendFlag;
        this.trxStatus = trxStatus;
        this.fastFlag = fastFlag;
        this.entryUser = entryUser;
        this.outremSecureNo = outremSecureNo;
        this.brnNo = brnNo;
        this.transOra = transOra;
        this.remType = remType;
        this.rcvPrintCnt = rcvPrintCnt;
        this.cnclPrintCnt = cnclPrintCnt;
        this.rnmPrintCnt = rnmPrintCnt;
        this.bnfName=bnfName;
        this.sndrName=sndrName;
        
    }
    public long getFrmAgentType() {
        return frmAgentType;
    }

    public void setFrmAgentType(long frmAgentType) {
        this.frmAgentType = frmAgentType;
    }

    public long getFrmAgentNo() {
        return frmAgentNo;
    }

    public void setFrmAgentNo(long frmAgentNo) {
        this.frmAgentNo = frmAgentNo;
    }

    public Long getFrmAgentBrnNo() {
        return frmAgentBrnNo;
    }

    public void setFrmAgentBrnNo(Long frmAgentBrnNo) {
        this.frmAgentBrnNo = frmAgentBrnNo;
    }

    public long getTrxYear() {
        return trxYear;
    }

    public void setTrxYear(long trxYear) {
        this.trxYear = trxYear;
    }

    public BigDecimal getTrxSer() {
        return trxSer;
    }

    public void setTrxSer(BigDecimal trxSer) {
        this.trxSer = trxSer;
    }

    public String getRemNo() {
        return remNo;
    }

    public void setRemNo(String remNo) {
        this.remNo = remNo;
    }

    public Date getTrxDatetime() {
        return trxDatetime;
    }

    public void setTrxDatetime(Date trxDatetime) {
        this.trxDatetime = trxDatetime;
    }

    public long getPymtMthd() {
        return pymtMthd;
    }

    public void setPymtMthd(long pymtMthd) {
        this.pymtMthd = pymtMthd;
    }

    public long getTrxCurrNo() {
        return trxCurrNo;
    }

    public void setTrxCurrNo(long trxCurrNo) {
        this.trxCurrNo = trxCurrNo;
    }

    public BigInteger getTrxAmt() {
        return trxAmt;
    }

    public void setTrxAmt(BigInteger trxAmt) {
        this.trxAmt = trxAmt;
    }

    public BigInteger getTrxLamt() {
        return trxLamt;
    }

    public void setTrxLamt(BigInteger trxLamt) {
        this.trxLamt = trxLamt;
    }

    public BigInteger getTrxExchRate() {
        return trxExchRate;
    }

    public void setTrxExchRate(BigInteger trxExchRate) {
        this.trxExchRate = trxExchRate;
    }

    public long getDestType() {
        return destType;
    }

    public void setDestType(long destType) {
        this.destType = destType;
    }

    public long getToAgentType() {
        return toAgentType;
    }

    public void setToAgentType(long toAgentType) {
        this.toAgentType = toAgentType;
    }

    public long getToAgentNo() {
        return toAgentNo;
    }

    public void setToAgentNo(long toAgentNo) {
        this.toAgentNo = toAgentNo;
    }

    public Long getToAgentBrnNo() {
        return toAgentBrnNo;
    }

    public void setToAgentBrnNo(Long toAgentBrnNo) {
        this.toAgentBrnNo = toAgentBrnNo;
    }

    public String getNoteToAgent() {
        return noteToAgent;
    }

    public void setNoteToAgent(String noteToAgent) {
        this.noteToAgent = noteToAgent;
    }

    public long getFeeCurrNo() {
        return feeCurrNo;
    }

    public void setFeeCurrNo(long feeCurrNo) {
        this.feeCurrNo = feeCurrNo;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public BigInteger getFeeExchRate() {
        return feeExchRate;
    }

    public void setFeeExchRate(BigInteger feeExchRate) {
        this.feeExchRate = feeExchRate;
    }

    public BigInteger getFeeLamt() {
        return feeLamt;
    }

    public void setFeeLamt(BigInteger feeLamt) {
        this.feeLamt = feeLamt;
    }

    public Long getTrnsRsn() {
        return trnsRsn;
    }

    public void setTrnsRsn(Long trnsRsn) {
        this.trnsRsn = trnsRsn;
    }

    public long getAmendFlag() {
        return amendFlag;
    }

    public void setAmendFlag(long amendFlag) {
        this.amendFlag = amendFlag;
    }

    public long getTrxStatus() {
        return trxStatus;
    }

    public void setTrxStatus(long trxStatus) {
        this.trxStatus = trxStatus;
    }

    public Long getRefNo() {
        return refNo;
    }

    public void setRefNo(Long refNo) {
        this.refNo = refNo;
    }

    public long getFastFlag() {
        return fastFlag;
    }

    public void setFastFlag(long fastFlag) {
        this.fastFlag = fastFlag;
    }

    public Date getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(Date entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    public String getEntryUser() {
        return entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    public Date getApprvDatetime() {
        return apprvDatetime;
    }

    public void setApprvDatetime(Date apprvDatetime) {
        this.apprvDatetime = apprvDatetime;
    }

    public String getApprvUser() {
        return apprvUser;
    }

    public void setApprvUser(String apprvUser) {
        this.apprvUser = apprvUser;
    }

    public Long getPrintCnt() {
        return printCnt;
    }

    public void setPrintCnt(Long printCnt) {
        this.printCnt = printCnt;
    }

    public Date getPrintDatetime() {
        return printDatetime;
    }

    public void setPrintDatetime(Date printDatetime) {
        this.printDatetime = printDatetime;
    }

    public Long getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(Long printFlag) {
        this.printFlag = printFlag;
    }

    public String getSndrName() {
        return sndrName;
    }

    public void setSndrName(String sndrName) {
        this.sndrName = sndrName;
    }

    public String getSndrId() {
        return sndrId;
    }

    public void setSndrId(String sndrId) {
        this.sndrId = sndrId;
    }

    public Long getSndridType() {
        return sndridType;
    }

    public void setSndridType(Long sndridType) {
        this.sndridType = sndridType;
    }

    public String getSndridIssPlc() {
        return sndridIssPlc;
    }

    public void setSndridIssPlc(String sndridIssPlc) {
        this.sndridIssPlc = sndridIssPlc;
    }

    public Date getSndrIdExpDatetime() {
        return sndrIdExpDatetime;
    }

    public void setSndrIdExpDatetime(Date sndrIdExpDatetime) {
        this.sndrIdExpDatetime = sndrIdExpDatetime;
    }

    public String getSndrAdd() {
        return sndrAdd;
    }

    public void setSndrAdd(String sndrAdd) {
        this.sndrAdd = sndrAdd;
    }

    public String getSndrPhone() {
        return sndrPhone;
    }

    public void setSndrPhone(String sndrPhone) {
        this.sndrPhone = sndrPhone;
    }

    public String getBnfName() {
        return bnfName;
    }

    public void setBnfName(String bnfName) {
        this.bnfName = bnfName;
    }

    public String getBnfId() {
        return bnfId;
    }

    public void setBnfId(String bnfId) {
        this.bnfId = bnfId;
    }

    public Long getBnfidType() {
        return bnfidType;
    }

    public void setBnfidType(Long bnfidType) {
        this.bnfidType = bnfidType;
    }

    public String getBnfidIssPlc() {
        return bnfidIssPlc;
    }

    public void setBnfidIssPlc(String bnfidIssPlc) {
        this.bnfidIssPlc = bnfidIssPlc;
    }

    public Date getBnfIdExpDatetime() {
        return bnfIdExpDatetime;
    }

    public void setBnfIdExpDatetime(Date bnfIdExpDatetime) {
        this.bnfIdExpDatetime = bnfIdExpDatetime;
    }

    public String getBnfAdd() {
        return bnfAdd;
    }

    public void setBnfAdd(String bnfAdd) {
        this.bnfAdd = bnfAdd;
    }

    public String getBnfPhone() {
        return bnfPhone;
    }

    public void setBnfPhone(String bnfPhone) {
        this.bnfPhone = bnfPhone;
    }

    public String getNoteToBnf() {
        return noteToBnf;
    }

    public void setNoteToBnf(String noteToBnf) {
        this.noteToBnf = noteToBnf;
    }

    public BigInteger getOutremSecureNo() {
        return outremSecureNo;
    }

    public void setOutremSecureNo(BigInteger outremSecureNo) {
        this.outremSecureNo = outremSecureNo;
    }

    public Date getOutremSecureDatetime() {
        return outremSecureDatetime;
    }

    public void setOutremSecureDatetime(Date outremSecureDatetime) {
        this.outremSecureDatetime = outremSecureDatetime;
    }

    public Date getCnclDatetime() {
        return cnclDatetime;
    }

    public void setCnclDatetime(Date cnclDatetime) {
        this.cnclDatetime = cnclDatetime;
    }

    public Long getPayAgentType() {
        return payAgentType;
    }

    public void setPayAgentType(Long payAgentType) {
        this.payAgentType = payAgentType;
    }

    public Long getPayAgentNo() {
        return payAgentNo;
    }

    public void setPayAgentNo(Long payAgentNo) {
        this.payAgentNo = payAgentNo;
    }

    public String getPayAgentBrnNo() {
        return payAgentBrnNo;
    }

    public void setPayAgentBrnNo(String payAgentBrnNo) {
        this.payAgentBrnNo = payAgentBrnNo;
    }

    public Long getPayYear() {
        return payYear;
    }

    public void setPayYear(Long payYear) {
        this.payYear = payYear;
    }

    public Long getPaySer() {
        return paySer;
    }

    public void setPaySer(Long paySer) {
        this.paySer = paySer;
    }

    public Date getPayDatetime() {
        return payDatetime;
    }

    public void setPayDatetime(Date payDatetime) {
        this.payDatetime = payDatetime;
    }

    public Date getSndrIdIssuDatetime() {
        return sndrIdIssuDatetime;
    }

    public void setSndrIdIssuDatetime(Date sndrIdIssuDatetime) {
        this.sndrIdIssuDatetime = sndrIdIssuDatetime;
    }

    public Date getBnfIdIssuDatetime() {
        return bnfIdIssuDatetime;
    }

    public void setBnfIdIssuDatetime(Date bnfIdIssuDatetime) {
        this.bnfIdIssuDatetime = bnfIdIssuDatetime;
    }

    public String getSecKey() {
        return secKey;
    }

    public void setSecKey(String secKey) {
        this.secKey = secKey;
    }

    public long getBrnNo() {
        return brnNo;
    }

    public void setBrnNo(long brnNo) {
        this.brnNo = brnNo;
    }

    public long getTransOra() {
        return transOra;
    }

    public void setTransOra(long transOra) {
        this.transOra = transOra;
    }

    public Long getPayPost() {
        return payPost;
    }

    public void setPayPost(Long payPost) {
        this.payPost = payPost;
    }

    public Long getPayJvSer() {
        return payJvSer;
    }

    public void setPayJvSer(Long payJvSer) {
        this.payJvSer = payJvSer;
    }

    public BigInteger getTrxSerRef() {
        return trxSerRef;
    }

    public void setTrxSerRef(BigInteger trxSerRef) {
        this.trxSerRef = trxSerRef;
    }

    public long getRemType() {
        return remType;
    }

    public void setRemType(long remType) {
        this.remType = remType;
    }

    public Long getToCityNo() {
        return toCityNo;
    }

    public void setToCityNo(Long toCityNo) {
        this.toCityNo = toCityNo;
    }

    public Double getFeeAmtExtra() {
        return feeAmtExtra;
    }

    public void setFeeAmtExtra(Double feeAmtExtra) {
        this.feeAmtExtra = feeAmtExtra;
    }

    public Long getPayFeeCurrNo() {
        return payFeeCurrNo;
    }

    public void setPayFeeCurrNo(Long payFeeCurrNo) {
        this.payFeeCurrNo = payFeeCurrNo;
    }

    public BigDecimal getPayFeeAmt() {
        return payFeeAmt;
    }

    public void setPayFeeAmt(BigDecimal payFeeAmt) {
        this.payFeeAmt = payFeeAmt;
    }

    public Long getSndVocNo() {
        return sndVocNo;
    }

    public void setSndVocNo(Long sndVocNo) {
        this.sndVocNo = sndVocNo;
    }

    public Long getRcvVocNo() {
        return rcvVocNo;
    }

    public void setRcvVocNo(Long rcvVocNo) {
        this.rcvVocNo = rcvVocNo;
    }

    public BigInteger getCnclJvSer() {
        return cnclJvSer;
    }

    public void setCnclJvSer(BigInteger cnclJvSer) {
        this.cnclJvSer = cnclJvSer;
    }

    public String getCnclUser() {
        return cnclUser;
    }

    public void setCnclUser(String cnclUser) {
        this.cnclUser = cnclUser;
    }

    public String getPayUser() {
        return payUser;
    }

    public void setPayUser(String payUser) {
        this.payUser = payUser;
    }

    public String getEditUser() {
        return editUser;
    }

    public void setEditUser(String editUser) {
        this.editUser = editUser;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getSndrNameOld() {
        return sndrNameOld;
    }

    public void setSndrNameOld(String sndrNameOld) {
        this.sndrNameOld = sndrNameOld;
    }

    public String getBnfNameOld() {
        return bnfNameOld;
    }

    public void setBnfNameOld(String bnfNameOld) {
        this.bnfNameOld = bnfNameOld;
    }

    public BigInteger getOutRemNo() {
        return outRemNo;
    }

    public void setOutRemNo(BigInteger outRemNo) {
        this.outRemNo = outRemNo;
    }

    public long getRcvPrintCnt() {
        return rcvPrintCnt;
    }

    public void setRcvPrintCnt(long rcvPrintCnt) {
        this.rcvPrintCnt = rcvPrintCnt;
    }

    public long getCnclPrintCnt() {
        return cnclPrintCnt;
    }

    public void setCnclPrintCnt(long cnclPrintCnt) {
        this.cnclPrintCnt = cnclPrintCnt;
    }

    public long getRnmPrintCnt() {
        return rnmPrintCnt;
    }

    public void setRnmPrintCnt(long rnmPrintCnt) {
        this.rnmPrintCnt = rnmPrintCnt;
    }

    public Date getRcvPrintDatetime() {
        return rcvPrintDatetime;
    }

    public void setRcvPrintDatetime(Date rcvPrintDatetime) {
        this.rcvPrintDatetime = rcvPrintDatetime;
    }

    public Date getCnclPrintDatetime() {
        return cnclPrintDatetime;
    }

    public void setCnclPrintDatetime(Date cnclPrintDatetime) {
        this.cnclPrintDatetime = cnclPrintDatetime;
    }

    public Date getRnmPrintDatetime() {
        return rnmPrintDatetime;
    }

    public void setRnmPrintDatetime(Date rnmPrintDatetime) {
        this.rnmPrintDatetime = rnmPrintDatetime;
    }

    public BigInteger getSndJvSer() {
        return sndJvSer;
    }

    public void setSndJvSer(BigInteger sndJvSer) {
        this.sndJvSer = sndJvSer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trxSer != null ? trxSer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebInOutTrx)) {
            return false;
        }
        WebInOutTrx other = (WebInOutTrx) object;
        if ((this.trxSer == null && other.trxSer != null) || (this.trxSer != null && !this.trxSer.equals(other.trxSer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proj.entity.WebInOutTrx[ trxSer=" + trxSer + " ]";
    }
    
}
