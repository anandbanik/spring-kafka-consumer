package gbs.finance.blockchain.oms.model;

import java.util.Arrays;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import gbs.finance.blockchain.oms.util.PoConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EditPurchaseOrder {
	
	 @JsonProperty(value="omsPoNbr")
	  private String poNumber;
	  
	  @JsonProperty(value="xrefNbr")
	  private String xrefPoNbr;
	  
	  public String getXrefPoNbr() {
	    return xrefPoNbr;
	  }

	  public void setXrefPoNbr(String xrefPoNbr) {
	    this.xrefPoNbr = xrefPoNbr;
	  }
	  @JsonProperty(value="updateTypes")
	  private String[] updateTypes;

	  public String[] getUpdateTypes() {
	    return updateTypes;
	  }

	  public void setUpdateTypes(String[] updateTypes) {
	    this.updateTypes = updateTypes;
	  }

	  @Override
	  public String toString() {
	    return "EditPo [poNumber=" + poNumber + ", updateTypes=" + Arrays.toString(updateTypes) + ", requestedDeliveryDate="
	        + requestedDeliveryDate + ", locCountry=" + locCountry + ", facilityNumber=" + facilityNumber
	        + ", divisionNumber=" + divisionNumber + ", timestamp=" + timestamp + ", vendorNbr=" + vendorNbr
	        + ", orderOfficeId=" + orderOfficeId + ", importIndicator=" + importIndicator + "]";
	  }

	  public Date getTimestamp() {
	    return timestamp;
	  }
	 
	  public int getOrderOfficeId() {
	    return orderOfficeId;
	  }
	  public void setOrderOfficeId(int orderOfficeId) {
	    this.orderOfficeId = orderOfficeId;
	  }
	  public void setTimestamp(Date timestamp) {
	    this.timestamp = timestamp;
	  }
	  @JsonProperty(value="mabdDate")
	  private Date requestedDeliveryDate;
	 
	  private String locCountry;
	  
	  @JsonProperty(value="dcNbr")
	  private String facilityNumber;
	  
	  @JsonProperty(value="division")
	  private String divisionNumber;

	  @JsonProperty(value="timestamp") 
	  private Date timestamp;
	  
	  @JsonProperty(value="vendorNbr")
	  private String vendorNbr;
	  
	  public String getVendorNbr() {
	    return vendorNbr;
	  }
	  public void setVendorNbr(String vendorNbr) {
	    this.vendorNbr = vendorNbr;
	  }

	  @JsonProperty(value="orderOfficeId")
	  private int orderOfficeId;  
	  
	  public String getPoNumber() {
	    return poNumber;
	  }
	  public void setPoNumber(String poNumber) {
	    this.poNumber = poNumber;
	  }

	  public Date getRequestedDeliveryDate() {
	    return requestedDeliveryDate;
	  }
	  public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
	    this.requestedDeliveryDate = requestedDeliveryDate;
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
	  
	  public String getLocCountry() {
	    if(orderOfficeId == PoConstants.US_OFFICE_ID) {
	      return PoConstants.US_CODE;
	    }
	    return null;
	  }
	  @JsonProperty(value="importInd")
	  private String importIndicator;

}
