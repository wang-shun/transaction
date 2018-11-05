package com.sinochem.crude.trade.transaction.model.vo;

import java.io.Serializable;

/**
 * 文件信息VO
 * @author hexinfang
 *
 */
public class FileInfoVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 901519818495065569L;

	/***BL或SOF 标识**/
	private Long id;

	/** 附件主键*/
	private Long attachmentsId;

	private String type;

	private Long taskId;

	private Long createUser;

	private String businessUuid;

	private String deal_no;

	/**
	 * 文件路径
	 */
	private String path;
	
	/**
	 * 文件后缀
	 */
	private String suffix;
	
	/**
	 * 文件大小
	 */
	private String size;

	/**
	 * 文件原名
	 */
    private String originalName;

    /**
     * 文件sha
     */
    private String fileSHA;

	public Long getAttachmentsId() {
		return attachmentsId;
	}

	public void setAttachmentsId(Long attachmentsId) {
		this.attachmentsId = attachmentsId;
	}

	public String getDeal_no() {
		return deal_no;
	}

	public void setDeal_no(String deal_no) {
		this.deal_no = deal_no;
	}

	public String getBusinessUuid() {
		return businessUuid;
	}

	public void setBusinessUuid(String businessUuid) {
		this.businessUuid = businessUuid;
	}

	public String getPath() {
		return path;
	}

	public String getSuffix() {
		return suffix;
	}

	public String getSize() {
		return size;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

    public String getFileSHA() {
        return fileSHA;
    }

    public void setFileSHA(String fileSHA) {
        this.fileSHA = fileSHA;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}
}
