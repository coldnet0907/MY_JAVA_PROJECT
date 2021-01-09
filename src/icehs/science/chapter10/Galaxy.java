package icehs.science.chapter10;

public class Galaxy extends Mobile{

	private String osVersion;
	public Galaxy()
	{
		super("Galaxy");
	}
	
	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
		System.out.println("Galaxy : " + osVersion);
	}

	@Override
	public void charge(int item)
	{
		System.out.println("Galaxy : 보조배터리 " + item + "분 충전");
	}
}
