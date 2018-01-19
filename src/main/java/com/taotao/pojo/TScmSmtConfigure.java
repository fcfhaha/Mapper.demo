package com.taotao.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_scm_smt_configure")
public class TScmSmtConfigure {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 线体类型
     */
    @Column(name = "line_type")
    private String lineType;

    /**
     * 线别，产线编号
     */
    @Column(name = "line_number")
    private String lineNumber;

    /**
     * 机台类型
     */
    @Column(name = "machine_type")
    private Short machineType;

    /**
     * 机台名称
     */
    @Column(name = "machine_name")
    private String machineName;

    /**
     * 程式文件获取路径
     */
    @Column(name = "acquire_pattern_path")
    private String acquirePatternPath;

    /**
     * 本地保存程式文件路径
     */
    @Column(name = "save_local_path")
    private String saveLocalPath;

    /**
     * 机台图片名称
     */
    @Column(name = "picture_name")
    private String pictureName;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update_date")
    private Date lastUpdateDate;

    /**
     * 最后更新者
     */
    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 记录创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 记录创建者
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * Y:有效资料 N:无效资料
     */
    private String active;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取线体类型
     *
     * @return line_type - 线体类型
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * 设置线体类型
     *
     * @param lineType 线体类型
     */
    public void setLineType(String lineType) {
        this.lineType = lineType == null ? null : lineType.trim();
    }

    /**
     * 获取线别，产线编号
     *
     * @return line_number - 线别，产线编号
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * 设置线别，产线编号
     *
     * @param lineNumber 线别，产线编号
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber == null ? null : lineNumber.trim();
    }

    /**
     * 获取机台类型
     *
     * @return machine_type - 机台类型
     */
    public Short getMachineType() {
        return machineType;
    }

    /**
     * 设置机台类型
     *
     * @param machineType 机台类型
     */
    public void setMachineType(Short machineType) {
        this.machineType = machineType;
    }

    /**
     * 获取机台名称
     *
     * @return machine_name - 机台名称
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * 设置机台名称
     *
     * @param machineName 机台名称
     */
    public void setMachineName(String machineName) {
        this.machineName = machineName == null ? null : machineName.trim();
    }

    /**
     * 获取程式文件获取路径
     *
     * @return acquire_pattern_path - 程式文件获取路径
     */
    public String getAcquirePatternPath() {
        return acquirePatternPath;
    }

    /**
     * 设置程式文件获取路径
     *
     * @param acquirePatternPath 程式文件获取路径
     */
    public void setAcquirePatternPath(String acquirePatternPath) {
        this.acquirePatternPath = acquirePatternPath == null ? null : acquirePatternPath.trim();
    }

    /**
     * 获取本地保存程式文件路径
     *
     * @return save_local_path - 本地保存程式文件路径
     */
    public String getSaveLocalPath() {
        return saveLocalPath;
    }

    /**
     * 设置本地保存程式文件路径
     *
     * @param saveLocalPath 本地保存程式文件路径
     */
    public void setSaveLocalPath(String saveLocalPath) {
        this.saveLocalPath = saveLocalPath == null ? null : saveLocalPath.trim();
    }

    /**
     * 获取机台图片名称
     *
     * @return picture_name - 机台图片名称
     */
    public String getPictureName() {
        return pictureName;
    }

    /**
     * 设置机台图片名称
     *
     * @param pictureName 机台图片名称
     */
    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    /**
     * 获取最后更新时间
     *
     * @return last_update_date - 最后更新时间
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateDate 最后更新时间
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * 获取最后更新者
     *
     * @return last_updated_by - 最后更新者
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * 设置最后更新者
     *
     * @param lastUpdatedBy 最后更新者
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy == null ? null : lastUpdatedBy.trim();
    }

    /**
     * 获取记录创建时间
     *
     * @return create_date - 记录创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置记录创建时间
     *
     * @param createDate 记录创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取记录创建者
     *
     * @return created_by - 记录创建者
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置记录创建者
     *
     * @param createdBy 记录创建者
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 获取Y:有效资料 N:无效资料
     *
     * @return active - Y:有效资料 N:无效资料
     */
    public String getActive() {
        return active;
    }

    /**
     * 设置Y:有效资料 N:无效资料
     *
     * @param active Y:有效资料 N:无效资料
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }
}