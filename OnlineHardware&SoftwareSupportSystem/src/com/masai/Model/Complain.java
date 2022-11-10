package com.masai.Model;

public class Complain {

	int complainid;
	String complainname;
	String complainengineer;
	String solved;
	
	
	public Complain(int complainid, String complainname, String complainengineer, String solved) {
		super();
		this.complainid = complainid;
		this.complainname = complainname;
		this.complainengineer = complainengineer;
		this.solved = solved;
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


	public String getSolved() {
		return solved;
	}


	public void setSolved(String solved) {
		this.solved = solved;
	}


	@Override
	public String toString() {
		return "Complain [complainid=" + complainid + ", complainname=" + complainname + ", complainengineer="
				+ complainengineer + ", solved=" + solved + "]";
	}



	
}
