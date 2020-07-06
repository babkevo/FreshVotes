package com.freshvotes.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity  // This tells Hibernate to make a table out of this class
public class Vote {
	
	private VoteId pk;
	private Boolean UpVote;
	
	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}
	public void setPk(VoteId pk) {
		this.pk = pk;
	}
	public Boolean getUpVote() {
		return UpVote;
	}
	public void setUpVote(Boolean upVote) {
		UpVote = upVote;
	}

}
