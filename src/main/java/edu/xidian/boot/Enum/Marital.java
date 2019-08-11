package edu.xidian.boot.Enum;

public enum Marital implements BaseEnum {
	MARRIED(200, "已婚"), UNMARRIED(300, "未婚"), ENGAGED(400, "订婚");

	private int code;
	private String desc;

	private Marital(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	@Override
	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static void main(String[] args) {
		System.out.println(Marital.MARRIED);
	}

}