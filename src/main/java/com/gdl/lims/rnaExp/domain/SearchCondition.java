package com.gdl.lims.rnaExp.domain;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SearchCondition {

	private String[] sampleList;

	private String[] cellList;

	private String expType;

	private String searchType;

	private String searchText;
}
