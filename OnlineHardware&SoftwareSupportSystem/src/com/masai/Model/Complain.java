package com.masai.Model;

public class Complain {

	int complainid;
	String complainname;
	String complainengineer;
	
	
	
	public Complain(int complainid, String complainname, String complainengineer) {
		super();
		this.complainid = complainid;
		this.complainname = complainname;
		this.complainengineer = complainengineer;
	}



	public int getComplainid() {
		return complainid;
	}



	public void setComplainid(int complainid) {
		this.complainid = complainid;
	}



	public String getComplainname() {
		return complainname;
	}



	public void setComplainname(String complainname) {
		this.complainname = complainname;
	}



	public String getComplainengineer() {
		return complainengineer;
	}



	public void setComplainengineer(String complainengineer) {
		this.complainengineer = complainengineer;
	}



	@Override
	public String toString() {
		return "Complain [complainid=" + complainid + ", complainname=" + complainname + ", complainengineer="
				+ complainengineer + "]";
	}

}
