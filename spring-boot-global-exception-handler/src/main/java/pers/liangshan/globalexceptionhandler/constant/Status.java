package pers.liangshan.globalexceptionhandler.constant;

import lombok.Getter;

@Getter
public enum Status {
	
	SUCCESS("200", "成功"),

	SERVER_ERROR("500", "服务器错误!"),

	BIZ_EXCEPTION("600", "业务类异常"),;

	private String rspCode;
	
	private String rspMsg;

	Status(String rspCode, String rspMsg) {
		this.rspCode = rspCode;
		this.rspMsg = rspMsg;
	}
}
