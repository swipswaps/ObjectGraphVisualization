package ch.hsr.ogv.domain;

public class InstanceRelation {

	private InstanceRelationEndpoint start;
	private InstanceRelationEndpoint end;

	public InstanceRelation(InstanceRelationEndpoint start, InstanceRelationEndpoint end) {
		this.start = start;
		this.end = end;
	}

}
