package com.perasite.blockcoding.block;

import java.util.Arrays;
import java.util.List;

import com.perasite.blockcoding.Argument;

/**
 * Created by user on 2017-07-01.
 */
public class TalkBlock extends ABlock {

	private static final long serialVersionUID = 1L;

	public TalkBlock(Argument... args) {
		super();
	}

	@Override
	public String getName() {
		return "TalkBlock";
	}

	@Override
	public boolean execute() {
		return false;
	}

	@Override
	public List<String> getFieldList() {
		return Arrays.asList("sender", "receiver", "msg");
	}
	@Override
	public List<String> getDescription() {
		return Arrays.asList("전송자가 메세지를 수신자에게 전송합니다.");
	}
}
