package com.masai.Model;

public class Complain {

	int complainid;
	String complainname;
	String complainengineer;
	String complainstatus;
	
	
	
	public Complain() {
		super();
		
	}



	public Complain(int complainid, String complainname, String complainengineer, String complainstatus) {
		super();
		this.complainid = complainid;
		this.complainname = complainname;
		this.complainengineer = complainengineer;
		this.complainstatus = complainstatus;
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



	public String getComplainstatus() {
		return complainstatus;
	}



	public void setComplainstatus(String complainstatus) {
		this.complainstatus = complainstatus;
	}



	@Override
	public String toString() {
		return "Complain [complainid=" + complainid + ", complainname=" + complainname + ", complainengineer="
				+ complainengineer + ", complainstatus=" + complainstatus + "]";
	}
	
	
	

	
}
