package com.publiccms.entities.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsContentFile generated by hbm2java
 */
@Entity
@Table(name = "cms_content_file")
@DynamicUpdate
public class CmsContentFile implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "内容", condition = true)
    private long contentId;
    @GeneratorColumn(title = "上传用户", condition = true)
    private long userId;
    @GeneratorColumn(title = "文件路径")
    private String filePath;
    @GeneratorColumn(title = "图片类型", condition = true)
    private String fileType;
    @GeneratorColumn(title = "文件大小", order = true)
    private Long fileSize;
    @GeneratorColumn(title = "宽度")
    private Integer width;
    @GeneratorColumn(title = "高度")
    private Integer height;
    @GeneratorColumn(title = "点击", order = true)
    private int clicks;
    @GeneratorColumn(title = "排序")
    private int sort;
    @GeneratorColumn(title = "描述")
    private String description;

    public CmsContentFile() {
    }

    public CmsContentFile(long contentId, long userId, String filePath, String fileType, int clicks, int sort) {
        this.contentId = contentId;
        this.userId = userId;
        this.filePath = filePath;
        this.fileType = fileType;
        this.clicks = clicks;
        this.sort = sort;
    }

    public CmsContentFile(long contentId, long userId, String filePath, String fileType, Long fileSize, Integer width,
            Integer height, int clicks, int sort, String description) {
        this.contentId = contentId;
        this.userId = userId;
        this.filePath = filePath;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.width = width;
        this.height = height;
        this.clicks = clicks;
        this.sort = sort;
        this.description = description;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "content_id", nullable = false)
    public long getContentId() {
        return this.contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "file_path", nullable = false)
    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Column(name = "file_type", nullable = false, length = 20)
    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Column(name = "file_size")
    public long getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @Column(name = "width")
    public Integer getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Column(name = "height")
    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Column(name = "clicks", nullable = false)
    public int getClicks() {
        return this.clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    @Column(name = "sort", nullable = false)
    public int getSort() {
        return this.sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
