package pers.liangshan.globalexceptionhandler.exception;

/**
 * 业务异常类
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BizException() {
		super();
	}

	public BizException(String message) {
		super(message);
	}

}
