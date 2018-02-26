package cn.leepon.entity;

public class ChinaCity {
    private Integer id;

    private String sname;

    private Integer iparentid;

    private Integer isort;

    private Boolean istatus;

    private Integer icreatetime;

    private Integer iupdatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getIparentid() {
        return iparentid;
    }

    public void setIparentid(Integer iparentid) {
        this.iparentid = iparentid;
    }

    public Integer getIsort() {
        return isort;
    }

    public void setIsort(Integer isort) {
        this.isort = isort;
    }

    public Boolean getIstatus() {
        return istatus;
    }

    public void setIstatus(Boolean istatus) {
        this.istatus = istatus;
    }

    public Integer getIcreatetime() {
        return icreatetime;
    }

    public void setIcreatetime(Integer icreatetime) {
        this.icreatetime = icreatetime;
    }

    public Integer getIupdatetime() {
        return iupdatetime;
    }

    public void setIupdatetime(Integer iupdatetime) {
        this.iupdatetime = iupdatetime;
    }
}