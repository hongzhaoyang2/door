package com.hongzhaoyang.learn.common;


/**
 * 用户视图层
 *
 * @ClassName UserDto
 * @author shiqiangguo
 * @version 1.0
 */
public class UserDto implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1L;

	public Integer id;

	private Integer createTime;

	private Integer version;

	/**
	 * LDAP:uid；登录帐号，也是邮箱前缀，手工录入，按照汉语拼音命名，如果出现重名情况，需要人工决定后缀数字，从业务操作规范上来保证唯一
	 * 要求规则：last_name+first_name[+数字]
	 */
	private String uid;

	/**
	 * LDAP:email；邮箱，系统自动生成，<uid>@chicv.com
	 */
	private String email;

	/**
	 * 手机号码，将来登录可能要求手机号码验证
	 */
	private String mobile;

	/**
	 * LDAP:employeeNumber 。员工工号，唯一索引，用户起用时用max(uid)+1来设置 select max(uid)+1 from
	 * user where state
	 */
	private Integer employeeNumber;

	/**
	 * LDAP：displayName；作为用户在系统中的现实名称，例如：登陆帐号-shiqiangguo，对应“史强国”
	 */
	private String displayName;

	/**
	 * LDAP：givenName；用户的名，相当于 first name。
	 */
	private String firstName;

	/**
	 * LDAP：sn(surname)；用户的姓
	 */
	private String lastName;

	/**
	 * LDAP：ou第一级；ldap中定义的第一级，国家，采用ISO-3166的三位字符串，枚举：CNH-中国，USA-美国
	 */
	private String country;

	/**
	 * LDAP：ou第二级；城市，如beijing，guangzhou
	 */
	private String city;

	/**
	 * 头像地址
	 */
	private String headUrl;

	/**
	 * 密码更新时间
	 */
	private Integer passwordUpdateDate;

	/**
	 * LDAP：manager；当前用户的上级领导对应的 uid， 顶级为空串。
	 */
	private String supervisor;
	// 是否开启二次登录
	private Boolean twoFactor;
	// 是否合法授权（ 默认 false ）
	private boolean legalLogin = false;

	private String totpKey;

    public String getTotpKey() {
        return totpKey;
    }

    public void setTotpKey(String totpKey) {
        this.totpKey = totpKey;
    }

    public Boolean isTwoFactor() {
		return twoFactor == null ? false : twoFactor;
	}

	public void setTwoFactor(Boolean twoFactor) {
		this.twoFactor = twoFactor;
	}

	public boolean getLegalLogin() {
		return legalLogin;
	}

	public void setLegalLogin(boolean legalLogin) {
		this.legalLogin = legalLogin;
	}

	/**
	 * LDAP:uid；登录帐号，也是邮箱前缀，手工录入，按照汉语拼音命名，如果出现重名情况，需要人工决定后缀数字，从业务操作规范上来保证唯一
	 * 要求规则：last_name+first_name[+数字]
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * LDAP:uid；登录帐号，也是邮箱前缀，手工录入，按照汉语拼音命名，如果出现重名情况，需要人工决定后缀数字，从业务操作规范上来保证唯一
	 * 要求规则：last_name+first_name[+数字]
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * LDAP:email；邮箱，系统自动生成，<uid>@chicv.com
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * LDAP:email；邮箱，系统自动生成，<uid>@chicv.com
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 手机号码，将来登录可能要求手机号码验证
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 格式化显示，例如：1368****318
	 */
	public String getMobileFormatter() {
		if (null == mobile || mobile.length() < 11) {
			return null;
		}
		return mobile.substring(0, 4) + "****" + mobile.substring(9);
	}

	/**
	 * 手机号码，将来登录可能要求手机号码验证
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * LDAP:employeeNumber 。员工工号，唯一索引，用户起用时用max(uid)+1来设置 select max(uid)+1 from
	 * user where state
	 */
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * LDAP:employeeNumber 。员工工号，唯一索引，用户起用时用max(uid)+1来设置 select max(uid)+1 from
	 * user where state
	 */
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * LDAP：displayName；作为用户在系统中的现实名称，例如：登陆帐号-shiqiangguo，对应“史强国”
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * LDAP：displayName；作为用户在系统中的现实名称，例如：登陆帐号-shiqiangguo，对应“史强国”
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * LDAP：givenName；用户的名，相当于 first name。
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * LDAP：givenName；用户的名，相当于 first name。
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * LDAP：sn(surname)；用户的姓
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * LDAP：sn(surname)；用户的姓
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * LDAP：ou第一级；ldap中定义的第一级，国家，采用ISO-3166的三位字符串，枚举：CNH-中国，USA-美国
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * LDAP：ou第一级；ldap中定义的第一级，国家，采用ISO-3166的三位字符串，枚举：CNH-中国，USA-美国
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * LDAP：ou第二级；城市，如beijing，guangzhou
	 */
	public String getCity() {
		return city;
	}

	/**
	 * LDAP：ou第二级；城市，如beijing，guangzhou
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	/**
	 * 密码更新时间
	 */
	public Integer getPasswordUpdateDate() {
		return passwordUpdateDate;
	}

	/**
	 * 密码更新时间
	 */
	public void setPasswordUpdateDate(Integer passwordUpdateDate) {
		this.passwordUpdateDate = passwordUpdateDate;
	}

	/**
	 * LDAP：manager；当前用户的上级领导对应的 uid， 顶级为空串。
	 */
	public String getSupervisor() {
		return supervisor;
	}

	/**
	 * LDAP：manager；当前用户的上级领导对应的 uid， 顶级为空串。
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	public Boolean getTwoFactor() {
		return twoFactor;
	}

	public boolean isCompleteLogin(){
	    // 第二部认证通过，或者未开启二步认证
	    return legalLogin || !twoFactor;
    }

	public boolean isLegalLogin() {
		return legalLogin;
	}

	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User {");
		sb.append("  id=" + id);
		sb.append(", createTime=" + createTime);
		sb.append(", version=" + version);
		sb.append(", uid=" + uid);
		sb.append(", email=" + email);
		sb.append(", mobile=" + mobile);
		sb.append(", employeeNumber=" + employeeNumber);
		sb.append(", displayName=" + displayName);
		sb.append(", firstName=" + firstName);
		sb.append(", lastName=" + lastName);
		sb.append(", country=" + country);
		sb.append(", city=" + city);
		sb.append(", headUrl=" + headUrl);
		sb.append(", passwordUpdateDate=" + passwordUpdateDate);
		sb.append(", supervisor=" + supervisor);
	 	sb.append(", twoFactor=" + twoFactor);
	 	sb.append(", legalLogin=" + legalLogin);
		sb.append("}");
		return sb.toString();
	}

}
