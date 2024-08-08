package com.gdl.lims.rnaExp.domain;

import lombok.Data;

@Data
public class Expression {


	private String sampleName;

	private String cellName;

	private String geneName;

	private String fpkm;

	private String tpm;

	private String geneId;

	private String chromosome;

	private String start;

	private String end;

	private String biotype;
}
