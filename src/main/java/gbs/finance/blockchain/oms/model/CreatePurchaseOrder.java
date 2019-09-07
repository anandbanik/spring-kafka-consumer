package gbs.finance.blockchain.oms.model;

import java.util.Date;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import gbs.finance.blockchain.oms.util.PoConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePurchaseOrder {
	
	@JsonProperty(value="omsPoNbr")
	  private String poNumber;
	  
	  private String xrerfPoNumber; 
	  
	  public void setXrerfPoNumber(String xrerfPoNumber) {
	    this.xrerfPoNumber = xrerfPoNumber;
	  }
	  @JsonProperty(value="poCreateTs")
	  private Date poCreateDate;
	  
	  @JsonProperty(value="mabdDate")
	  private Date requestedDeliveryDate;
	  
	  @JsonProperty(value="dcCountryCode")
	  private String locCountry;
	  
	  @JsonProperty(value="dcNbr")
	  private String facilityNumber;
	  
	  @JsonProperty(value="vendorNbr")
	  private String vendorNbr;
	  
	  @JsonProperty(value="lastChgTs")
	  private Date lastChgTs;
	  
	  
	  public Date getLastChgTs() {
	    return lastChgTs;
	  }

	  public void setLastChgTs(Date lastChgTs) {
	    this.lastChgTs = lastChgTs;
	  }
	  @JsonProperty(value="orderOfficeId")
	  private int orderOfficeId;
	  
	  public String getVendorNbr() {
	    return vendorNbr;
	  }
	  
	  public void setVendorNbr(String vendorNbr) {
	    this.vendorNbr = vendorNbr;
	  }
	  private String divisionNumber;

	  @JsonProperty(value="omsSubPo")
	  public void unPackDivisionNumberFromOmsSubPo(Map<String, String> omsSubPo) {
	    divisionNumber = omsSubPo.get("xrefBaseDivNbr");
	    xrerfPoNumber = omsSubPo.get("xrefPoNbr");
	  }
	  
	  public String getXrefPoNumber() {
	    return xrerfPoNumber;
	  }
	  
	  public String getPoNumber() {
	    return poNumber;
	  }
	  public void setPoNumber(String poNumber) {
	    this.poNumber = poNumber;
	  }
	  public Date getPoCreateDate() {
	    return poCreateDate;
	  }
	  public void setPoCreateDate(Date poCreateDate) {
	    this.poCreateDate = poCreateDate;
	  }
	  public Date getRequestedDeliveryDate() {
	    return requestedDeliveryDate;
	  }
	  public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
	    this.requestedDeliveryDate = requestedDeliveryDate;
	  }
	  
	  public String getLocCountry() {
	    if(orderOfficeId == PoConstants.US_OFFICE_ID) {
	      return PoConstants.US_CODE;
	    }
	    return null;
	  }
	  public void setLocCountry(String locCountry) {
	    this.locCountry = locCountry;
	  }
	  public String getFacilityNumber() {
	    return facilityNumber;
	  }
	  public void setFacilityNumber(String facilityNumber) {
	    this.facilityNumber = facilityNumber;
	  }
	  public String getDivisionNumber() {
	    return divisionNumber;
	  }
	  public void setDivisionNumber(String divisionNumber) {
	    this.divisionNumber = divisionNumber;
	  }
	  public String getImportIndicator() {
	    return importIndicator;
	  }
	  public void setImportIndicator(String importIndicator) {
	    this.importIndicator = importIndicator;
	  }
	  @Override
	  public String toString() {
	    return "NewPo [poNumber=" + poNumber + ", poCreateDate=" + poCreateDate + ", requestedDeliveryDate="
	        + requestedDeliveryDate + ", locCountry=" + locCountry + ", facilityNumber=" + facilityNumber + ", vendorNbr="
	        + vendorNbr + ", lastChgTs=" + lastChgTs + ", orderOfficeId=" + orderOfficeId + ", divisionNumber="
	        + divisionNumber + ", importIndicator=" + importIndicator + "]";
	  }
	  @JsonProperty(value="importInd")
	  private String importIndicator;

}
