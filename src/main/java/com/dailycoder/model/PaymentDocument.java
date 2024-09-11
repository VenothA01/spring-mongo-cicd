package com.dailycoder.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PaymentDocument {

    private String id;
    private String acctSvcrId;
    private BigDecimal amt;
    private String cdtrAcctNb;
    private String contextId;
    private Date createdTs;
    private String dbtrAcctNb;
    private String epegId;
    private String instructionType;
    private Date lastUpdatedTs;
    private String participantId;
    private PmtInf pmtInf;
    private String pmtRail;
    private String processType;
    private String requestType;
    private SplmtryData splmtryData;
    private String status;
    private String txId;
    private Date valDate;
    private WfPmtOrdrPrcg wfPmtOrdrPrcg;
    private List<WfSttlmMsg> wfSttlmMsg;
    private String workflowId;

    // Getters and setters...

    public static class PmtInf {
        private BigDecimal amt;
        private String cdtDbtInd;
        private Cdtr cdtr;
        private CdtrAcct cdtrAcct;
        private CdtrAgt cdtrAgt;
        private String chrgBr;
        private Dbtr dbtr;
        private DbtrAcct dbtrAcct;
        private DbtrAgt dbtrAgt;
        private InstdAgt instdAgt;
        private InstgAgt instgAgt;
        private List<InstrForNxtAgt> instrForNxtAgt;
        private PmtId pmtId;
        private PmtTpInf pmtTpInf;
        private Date reqdExctnDt;
        private List<RmtInf> rmtInf;
        private SttlmInf sttlmInf;
        private UltmtDbtr ultmtDbtr;
        private Date valDt;
        // Getters and setters...
    }

    public static class InstgAgt{

    }

    public static class Cdtr {
        private String id;
        private String nm;
        private PstlAdr pstlAdr;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public PstlAdr getPstlAdr() {
            return pstlAdr;
        }

        public void setPstlAdr(PstlAdr pstlAdr) {
            this.pstlAdr = pstlAdr;
        }
    }

    public static class PstlAdr {
        private List<String> adrLine;
        private String ctry;
        private String ctrySubDvsn;
        private String pstCd;
        private String twnNm;

        public List<String> getAdrLine() {
            return adrLine;
        }

        public void setAdrLine(List<String> adrLine) {
            this.adrLine = adrLine;
        }

        public String getCtry() {
            return ctry;
        }

        public void setCtry(String ctry) {
            this.ctry = ctry;
        }

        public String getCtrySubDvsn() {
            return ctrySubDvsn;
        }

        public void setCtrySubDvsn(String ctrySubDvsn) {
            this.ctrySubDvsn = ctrySubDvsn;
        }

        public String getPstCd() {
            return pstCd;
        }

        public void setPstCd(String pstCd) {
            this.pstCd = pstCd;
        }

        public String getTwnNm() {
            return twnNm;
        }

        public void setTwnNm(String twnNm) {
            this.twnNm = twnNm;
        }
    }

    public static class CdtrAcct {
        private String id;
        private String nm;
        private String tp;
        private boolean wfAcctFlg;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public String getTp() {
            return tp;
        }

        public void setTp(String tp) {
            this.tp = tp;
        }

        public boolean isWfAcctFlg() {
            return wfAcctFlg;
        }

        public void setWfAcctFlg(boolean wfAcctFlg) {
            this.wfAcctFlg = wfAcctFlg;
        }
    }

    public static class CdtrAgt {
        private FinInstnId finInstnId;
        // Getters and setters...
    }

    public static class FinInstnId {
        private ClrSysMmbId clrSysMmbId;
        private String nm;
        private PstlAdr pstlAdr;

        public ClrSysMmbId getClrSysMmbId() {
            return clrSysMmbId;
        }

        public void setClrSysMmbId(ClrSysMmbId clrSysMmbId) {
            this.clrSysMmbId = clrSysMmbId;
        }

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public PstlAdr getPstlAdr() {
            return pstlAdr;
        }

        public void setPstlAdr(PstlAdr pstlAdr) {
            this.pstlAdr = pstlAdr;
        }
    }

    public static class ClrSysMmbId {
        private String clrSysId;
        private String mmbId;
        // Getters and setters...
    }

    public static class Dbtr {
        private String id;
        private String nm;
        private PstlAdr pstlAdr;
        private List<WfOthrNmAdr> wfOthrNmAdr;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public PstlAdr getPstlAdr() {
            return pstlAdr;
        }

        public void setPstlAdr(PstlAdr pstlAdr) {
            this.pstlAdr = pstlAdr;
        }

        public List<WfOthrNmAdr> getWfOthrNmAdr() {
            return wfOthrNmAdr;
        }

        public void setWfOthrNmAdr(List<WfOthrNmAdr> wfOthrNmAdr) {
            this.wfOthrNmAdr = wfOthrNmAdr;
        }
    }

    public static class DbtrAcct {
        private String id;
        private List<AttrRcrdList> attrRcrdList;
        private String ccy;
        private List<Lmt> lmt;
        private List<Rstrctn> rstrctn;
        private String sts;
        private String tp;
        private boolean wfAcctFlg;
        private String wfAuNb;
        private List<WfChrg> wfChrg;
        private String wfCpnyNb;
        private String wfPrdtCd;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<AttrRcrdList> getAttrRcrdList() {
            return attrRcrdList;
        }

        public void setAttrRcrdList(List<AttrRcrdList> attrRcrdList) {
            this.attrRcrdList = attrRcrdList;
        }

        public String getCcy() {
            return ccy;
        }

        public void setCcy(String ccy) {
            this.ccy = ccy;
        }

        public List<Lmt> getLmt() {
            return lmt;
        }

        public void setLmt(List<Lmt> lmt) {
            this.lmt = lmt;
        }

        public List<Rstrctn> getRstrctn() {
            return rstrctn;
        }

        public void setRstrctn(List<Rstrctn> rstrctn) {
            this.rstrctn = rstrctn;
        }

        public String getSts() {
            return sts;
        }

        public void setSts(String sts) {
            this.sts = sts;
        }

        public String getTp() {
            return tp;
        }

        public void setTp(String tp) {
            this.tp = tp;
        }

        public boolean isWfAcctFlg() {
            return wfAcctFlg;
        }

        public void setWfAcctFlg(boolean wfAcctFlg) {
            this.wfAcctFlg = wfAcctFlg;
        }

        public String getWfAuNb() {
            return wfAuNb;
        }

        public void setWfAuNb(String wfAuNb) {
            this.wfAuNb = wfAuNb;
        }

        public List<WfChrg> getWfChrg() {
            return wfChrg;
        }

        public void setWfChrg(List<WfChrg> wfChrg) {
            this.wfChrg = wfChrg;
        }

        public String getWfCpnyNb() {
            return wfCpnyNb;
        }

        public void setWfCpnyNb(String wfCpnyNb) {
            this.wfCpnyNb = wfCpnyNb;
        }

        public String getWfPrdtCd() {
            return wfPrdtCd;
        }

        public void setWfPrdtCd(String wfPrdtCd) {
            this.wfPrdtCd = wfPrdtCd;
        }
    }

    public static class InstdAgt {
        private FinInstnId finInstnId;
        private String nm;

        public FinInstnId getFinInstnId() {
            return finInstnId;
        }

        public String getNm() {
            return nm;
        }
    }

    public static class InstrForNxtAgt {
        private String instrInf;

        public String getInstrInf() {
            return instrInf;
        }

        public void setInstrInf(String instrInf) {
            this.instrInf = instrInf;
        }
    }

    public static class PmtId {
        private String instrId;
        private String txId;
        private String uetr;

        public String getInstrId() {
            return instrId;
        }

        public void setInstrId(String instrId) {
            this.instrId = instrId;
        }

        public String getTxId() {
            return txId;
        }

        public void setTxId(String txId) {
            this.txId = txId;
        }

        public String getUetr() {
            return uetr;
        }

        public void setUetr(String uetr) {
            this.uetr = uetr;
        }
    }

    public static class PmtTpInf {
        private String lclInstrm;
        private String svcLvl;

        public String getLclInstrm() {
            return lclInstrm;
        }

        public void setLclInstrm(String lclInstrm) {
            this.lclInstrm = lclInstrm;
        }

        public String getSvcLvl() {
            return svcLvl;
        }

        public void setSvcLvl(String svcLvl) {
            this.svcLvl = svcLvl;
        }
    }

    public static class RmtInf {
        private List<String> ustrd;
        // Getters and setters...
    }

    public static class SttlmInf {
        private SttlmAcct sttlmAcct;
        private String sttlmMtd;
        // Getters and setters...
    }

    public static class SttlmAcct {
        private String id;
        private String ccy;
        private List<Lmt> lmt;
        private String nm;
        private String sts;
        private String tp;
        private boolean wfAcctFlg;
        private String wfAuNb;
        private List<WfChrg> wfChrg;
        private String wfCpnyNb;
        private String wfPrdtCd;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCcy() {
            return ccy;
        }

        public void setCcy(String ccy) {
            this.ccy = ccy;
        }

        public List<Lmt> getLmt() {
            return lmt;
        }

        public void setLmt(List<Lmt> lmt) {
            this.lmt = lmt;
        }

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public String getSts() {
            return sts;
        }

        public void setSts(String sts) {
            this.sts = sts;
        }

        public String getTp() {
            return tp;
        }

        public void setTp(String tp) {
            this.tp = tp;
        }

        public boolean isWfAcctFlg() {
            return wfAcctFlg;
        }

        public void setWfAcctFlg(boolean wfAcctFlg) {
            this.wfAcctFlg = wfAcctFlg;
        }

        public String getWfAuNb() {
            return wfAuNb;
        }

        public void setWfAuNb(String wfAuNb) {
            this.wfAuNb = wfAuNb;
        }

        public List<WfChrg> getWfChrg() {
            return wfChrg;
        }

        public void setWfChrg(List<WfChrg> wfChrg) {
            this.wfChrg = wfChrg;
        }

        public String getWfCpnyNb() {
            return wfCpnyNb;
        }

        public void setWfCpnyNb(String wfCpnyNb) {
            this.wfCpnyNb = wfCpnyNb;
        }

        public String getWfPrdtCd() {
            return wfPrdtCd;
        }

        public void setWfPrdtCd(String wfPrdtCd) {
            this.wfPrdtCd = wfPrdtCd;
        }
    }

    public static class UltmtDbtr {
        private String id;
        private String nm;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }
    }

    public static class SplmtryData {
        private List<WfXtndedList> wfXtndedList;
        // Getters and setters...
    }

    public static class WfXtndedList {
        private String nm;
        private String val;
        // Getters and setters...
    }

    public static class WfPmtOrdrPrcg {
        private String acctSvcrId;
        private String applCstmrId;
        private String applId;
        private List<ClrSysInf> clrSysInf;
        private String dlvryChnl;
        private Date msgCreDtTm;
        private String orgtnChnl;
        private String pmtDlvryTp;
        private String pmtOrdrId;
        private String pmtRail;
        private String pmtSubTp;
        private String pmtTp;
        private String srcChnl;
        private String thrdPtyId;
        private String wfClearingNetwork;
        private Date wfDbtValDt;
        private String wfExecutionApplId;
        private List<WfTranTypeList> wfTranTypeList;
        private String wfTxTp;

        public String getAcctSvcrId() {
            return acctSvcrId;
        }

        public void setAcctSvcrId(String acctSvcrId) {
            this.acctSvcrId = acctSvcrId;
        }

        public String getApplCstmrId() {
            return applCstmrId;
        }

        public void setApplCstmrId(String applCstmrId) {
            this.applCstmrId = applCstmrId;
        }

        public String getApplId() {
            return applId;
        }

        public void setApplId(String applId) {
            this.applId = applId;
        }

        public List<ClrSysInf> getClrSysInf() {
            return clrSysInf;
        }

        public void setClrSysInf(List<ClrSysInf> clrSysInf) {
            this.clrSysInf = clrSysInf;
        }

        public String getDlvryChnl() {
            return dlvryChnl;
        }

        public void setDlvryChnl(String dlvryChnl) {
            this.dlvryChnl = dlvryChnl;
        }

        public Date getMsgCreDtTm() {
            return msgCreDtTm;
        }

        public void setMsgCreDtTm(Date msgCreDtTm) {
            this.msgCreDtTm = msgCreDtTm;
        }

        public String getOrgtnChnl() {
            return orgtnChnl;
        }

        public void setOrgtnChnl(String orgtnChnl) {
            this.orgtnChnl = orgtnChnl;
        }

        public String getPmtDlvryTp() {
            return pmtDlvryTp;
        }

        public void setPmtDlvryTp(String pmtDlvryTp) {
            this.pmtDlvryTp = pmtDlvryTp;
        }

        public String getPmtOrdrId() {
            return pmtOrdrId;
        }

        public void setPmtOrdrId(String pmtOrdrId) {
            this.pmtOrdrId = pmtOrdrId;
        }

        public String getPmtRail() {
            return pmtRail;
        }

        public void setPmtRail(String pmtRail) {
            this.pmtRail = pmtRail;
        }

        public String getPmtSubTp() {
            return pmtSubTp;
        }

        public void setPmtSubTp(String pmtSubTp) {
            this.pmtSubTp = pmtSubTp;
        }

        public String getPmtTp() {
            return pmtTp;
        }

        public void setPmtTp(String pmtTp) {
            this.pmtTp = pmtTp;
        }

        public String getSrcChnl() {
            return srcChnl;
        }

        public void setSrcChnl(String srcChnl) {
            this.srcChnl = srcChnl;
        }

        public String getThrdPtyId() {
            return thrdPtyId;
        }

        public void setThrdPtyId(String thrdPtyId) {
            this.thrdPtyId = thrdPtyId;
        }

        public String getWfClearingNetwork() {
            return wfClearingNetwork;
        }

        public void setWfClearingNetwork(String wfClearingNetwork) {
            this.wfClearingNetwork = wfClearingNetwork;
        }

        public Date getWfDbtValDt() {
            return wfDbtValDt;
        }

        public void setWfDbtValDt(Date wfDbtValDt) {
            this.wfDbtValDt = wfDbtValDt;
        }

        public String getWfExecutionApplId() {
            return wfExecutionApplId;
        }

        public void setWfExecutionApplId(String wfExecutionApplId) {
            this.wfExecutionApplId = wfExecutionApplId;
        }

        public List<WfTranTypeList> getWfTranTypeList() {
            return wfTranTypeList;
        }

        public void setWfTranTypeList(List<WfTranTypeList> wfTranTypeList) {
            this.wfTranTypeList = wfTranTypeList;
        }

        public String getWfTxTp() {
            return wfTxTp;
        }

        public void setWfTxTp(String wfTxTp) {
            this.wfTxTp = wfTxTp;
        }
    }

    public static class WfSttlmMsg {

    }

    public static class ClrSysInf {
        private String clrSysNm;

        public String getClrSysNm() {
            return clrSysNm;
        }

        public void setClrSysNm(String clrSysNm) {
            this.clrSysNm = clrSysNm;
        }
    }

    public static class WfTranTypeList {
        private String issr;
        private String name;
        private String value;

        public String getIssr() {
            return issr;
        }

        public void setIssr(String issr) {
            this.issr = issr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class AttrRcrdList {
        private String tp;
        private String val;

        public String getTp() {
            return tp;
        }

        public void setTp(String tp) {
            this.tp = tp;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }
    }

    public static class Lmt {
        private LmtAmt lmtAmt;
        private String lmtTp;

        public LmtAmt getLmtAmt() {
            return lmtAmt;
        }

        public void setLmtAmt(LmtAmt lmtAmt) {
            this.lmtAmt = lmtAmt;
        }

        public String getLmtTp() {
            return lmtTp;
        }

        public void setLmtTp(String lmtTp) {
            this.lmtTp = lmtTp;
        }
    }

    public static class LmtAmt {
        private BigDecimal amt;
        private String ccy;

        public BigDecimal getAmt() {
            return amt;
        }

        public void setAmt(BigDecimal amt) {
            this.amt = amt;
        }

        public String getCcy() {
            return ccy;
        }

        public void setCcy(String ccy) {
            this.ccy = ccy;
        }
    }

    public static class Rstrctn {
        private String rstrctnTp;
        // Getters and setters...
    }

    public static class WfChrg {
        private String chrgCd;

        public String getChrgCd() {
            return chrgCd;
        }

        public void setChrgCd(String chrgCd) {
            this.chrgCd = chrgCd;
        }
    }

    public static class WfOthrNmAdr {
        private String nm;
        private String nmAdrTp;
        private PstlAdr pstlAdr;

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public String getNmAdrTp() {
            return nmAdrTp;
        }

        public void setNmAdrTp(String nmAdrTp) {
            this.nmAdrTp = nmAdrTp;
        }

        public PstlAdr getPstlAdr() {
            return pstlAdr;
        }

        public void setPstlAdr(PstlAdr pstlAdr) {
            this.pstlAdr = pstlAdr;
        }
    }
}

