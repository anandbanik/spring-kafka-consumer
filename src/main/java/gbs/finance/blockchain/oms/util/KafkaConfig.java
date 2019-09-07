package gbs.finance.blockchain.oms.util;

import java.io.Serializable;

public class KafkaConfig implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bindAddress;
	private String groupId;
	private boolean enableAutoCommit;
	private String createPoTopic;
	private String editPoTopic;
	private String offsetConfig;
	
	
	
	public String getBindAddress() {
		return bindAddress;
	}
	public void setBindAddress(String bindAddress) {
		this.bindAddress = bindAddress;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public boolean isEnableAutoCommit() {
		return enableAutoCommit;
	}
	public void setEnableAutoCommit(boolean enableAutoCommit) {
		this.enableAutoCommit = enableAutoCommit;
	}
	
	public String getCreatePoTopic() {
		return createPoTopic;
	}
	public void setCreatePoTopic(String createPoTopic) {
		this.createPoTopic = createPoTopic;
	}
	public String getEditPoTopic() {
		return editPoTopic;
	}
	public void setEditPoTopic(String editPoTopic) {
		this.editPoTopic = editPoTopic;
	}
	public String getOffsetConfig() {
		return offsetConfig;
	}
	public void setOffsetConfig(String offsetConfig) {
		this.offsetConfig = offsetConfig;
	}
	
	
	
}
